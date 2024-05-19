@file:Suppress("PropertyName")

package com.github.phisgr.bridge

import org.intellij.lang.annotations.Language

data class Bid(val bidder: Bidder, val bid: String) {
    fun step(steps: Int): String {
        val index = BID_STEPS.getValue(bid)
        return ALL_BIDS.getOrElse(index + steps) {
            throw IllegalArgumentException("You are going too high!")
        }
    }

    val withBrackets get() = if (bidder.isOpponent) "($bid)" else bid
}

// Since `invoke` has a higher precedence over `minus`,
// `"bid" - "meaning" {...}` will be parsed as `"bid".minus("meaning".invoke {...})`.
// We create an intermediate object for the meaning and the bidding tree branch.
private typealias MeaningAndBranch = Pair<String, FurtherBidding>

@DslMarker
annotation class BiddingDsl

@BiddingDsl
sealed class BiddingContext {
    protected abstract val root: BiddingSystem

    private var dangling: IllegalStateException? = null
    protected fun checkNoDangling() {
        dangling?.let { throw it }
    }

    abstract val previousBids: List<Bid>

    val fullSequence: String get() = previousBids.joinToString(separator = "-") { it.withBrackets }

    private val _nextBids: MutableList<BiddingTree> = mutableListOf()
    val nextBids: List<BiddingTree> get() = _nextBids

    protected val defaultNextBidder: Bidder
        get() = when (val previousBid = previousBids.lastOrNull()) {
            null -> Bidder.S
            else -> previousBid.bidder.next
        }

    /**
     * Particularly useful when the content of the remark is relevant to __the partner__ of the next bidder
     * The [remark] will be added to the bidding tree as a "bid".
     */
    fun remark(bidder: Bidder, remark: String) {
        addBid(bidder, bid = remark, meaning = "")
    }

    /**
     * Useful for specifying balancing bids.
     */
    fun addBid(bidder: Bidder, bid: String, meaning: String, block: FurtherBidding = {}) {
        addBid(Bid(bidder, bid), meaning = meaning, block = block)
    }

    protected fun checkMismatchContext(action: String) {
        if (root.current != this) {
            IllegalStateException(
                """
                    $action $fullSequence instead of ${root.current.fullSequence}. This is probably not what you want.
                    Write `fun BiddingTree.YOUR_FUNCTION() {` or `val YOUR_FUNCTION: FurtherBidding = {` when you extract sequences into functions.
                    If you do want to make non-local updates, write `${BiddingTree::fixUp.name} {`...
                """.trimIndent()
            ).cleanUpAndThrow()
        }
    }

    protected fun addBid(bid: Bid, meaning: String, block: FurtherBidding) {
        checkMismatchContext("Adding bid ${bid.withBrackets} to")
        val newContext = BiddingTree(previousBids + bid, parent = this, root = root)
        _nextBids.add(newContext)
        root.swapCurrent(newContext) {
            newContext.meaning = meaning
            block(newContext)
        }
        newContext.checkNoDangling()
    }

    operator fun String.invoke(block: FurtherBidding): MeaningAndBranch {
        val meaning = this@invoke
        checkNoDangling()
        dangling = IllegalStateException("If you intend to add a bid, write `\"$meaning\" - {`...")
        return Pair(meaning, block)
    }

    operator fun String.minus(meaning: String) {
        addBid(Bid(defaultNextBidder, bid = this), meaning = meaning, block = {})
    }

    operator fun String.minus(block: FurtherBidding) {
        addBid(Bid(defaultNextBidder, bid = this), meaning = "", block = block)
    }

    operator fun String.minus(meaningAndBranch: MeaningAndBranch) {
        dangling = null
        val (meaning, block) = meaningAndBranch
        addBid(Bid(defaultNextBidder, bid = this), meaning = meaning, block = block)
    }

    fun findBid(sequence: List<String>, block: FurtherBidding = {}): BiddingTree =
        if (sequence.isEmpty()) this as BiddingTree
        else nextBids
            .first { it.previousBids.last().bid == sequence.first() }
            .findBid(sequence.subList(1, sequence.size))
            .also { it.fixUp(block) }

    /**
     * Find the bidding [sequence] following the current bidding context.
     * Optionally [fix up][BiddingTree.fixUp] that bid with [block].
     */
    fun findBid(vararg sequence: String, block: FurtherBidding = {}): BiddingTree =
        findBid(sequence.toList(), block)

    /**
     * Execute the [block] of code. The new bids added by it will then be sorted.
     */
    fun sorted(block: () -> Unit) {
        val originalSize = _nextBids.size
        block()
        _nextBids.subList(originalSize, _nextBids.size).sortBy {
            BID_STEPS.getValue(it.previousBids.last().bid)
        }
    }
}

typealias FurtherBidding = BiddingTree.() -> Unit

class BiddingTree(
    override val previousBids: List<Bid>,
    private val parent: BiddingContext,
    override val root: BiddingSystem,
) : BiddingContext() {
    var meaning = ""
        set(value) {
            checkMismatchContext("Updating meaning in")
            field = value
        }

    /**
     * Explanation for the bid in GitHub Flavored Markdown
     */
    @Language("Markdown")
    var explanation = ""
        set(value) {
            checkMismatchContext("Updating explanation in")
            field = value
        }
    val newLine get() = "\\\n"
    val newParagraph get() = "\n\n"

    private val nextOpponent: Bidder
        get() = previousBids.last().bidder.nextOpponent

    private fun ourFirstBid() = previousBids.firstOrNull { !it.bidder.isOpponent }

    // Make South or the opener the aggressor
    private fun southOpened() = require(previousBids.first().bidder == Bidder.S)
    private fun southAggressor() = require(ourFirstBid()?.bidder == Bidder.S)
    private fun southToBid() = require(defaultNextBidder == Bidder.S) { "It is not South's turn to bid." }
    private fun northToBid() = require(defaultNextBidder == Bidder.N) { "It is not North's turn to bid." }


    val opener: Bidder
        get() {
            southOpened()
            return Bidder.S
        }
    val responder: Bidder
        get() {
            southOpened()
            return Bidder.N
        }

    fun overcall(bid: String, meaning: String = "", balancing: Boolean = false, block: FurtherBidding = {}) {
        require(!previousBids.first().bidder.isOpponent) { "Use `opponent(bid)` if they opened." }
        opponent(bid, meaning, balancing, block)
    }

    fun opponent(bid: String, meaning: String = "", balancing: Boolean = false, block: FurtherBidding = {}) {
        val bidder = if (balancing) nextOpponent.nextOpponent else nextOpponent
        addBid(Bid(bidder, bid = bid), meaning, block)
    }

    infix fun String.opener(meaning: String) {
        this opener meaning {}
    }

    infix fun String.opener(block: FurtherBidding) {
        this opener Pair("", (block))
    }

    infix fun String.opener(meaningAndBranch: MeaningAndBranch) {
        southOpened()
        southToBid()
        this - meaningAndBranch
    }

    infix fun String.responder(meaning: String) {
        this responder meaning {}
    }

    infix fun String.responder(block: FurtherBidding) {
        this responder Pair("", (block))
    }

    infix fun String.responder(meaningAndBranch: MeaningAndBranch) {
        southOpened()
        northToBid()
        this - meaningAndBranch
    }

    infix fun String.aggressor(meaning: String) {
        this aggressor meaning {}
    }

    infix fun String.aggressor(block: FurtherBidding) {
        this aggressor Pair("", (block))
    }

    infix fun String.aggressor(meaningAndBranch: MeaningAndBranch) {
        southAggressor()
        southToBid()
        this - meaningAndBranch
    }

    infix fun String.advancer(meaning: String) {
        this advancer meaning {}
    }

    infix fun String.advancer(block: FurtherBidding) {
        this advancer Pair("", (block))
    }

    infix fun String.advancer(meaningAndBranch: MeaningAndBranch) {
        southAggressor()
        northToBid()
        this - meaningAndBranch
    }

    fun addPassHandAdjRow() {
        "Third/Fourth Seat adjustments:" - ""
    }

    private var _major: Major? = null
    fun setMajor(M: Major) {
        this._major = M
    }

    private fun <T> fromContext(name: String, getter: (BiddingTree) -> T?): T {
        var seek: BiddingContext = this
        while (seek is BiddingTree) {
            getter(seek)?.let { return it }
            seek = seek.parent
        }
        throw IllegalStateException("$name not set!")
    }

    /**
     * The major stored in previous bidding context by [setMajor].
     */
    val M: Major get() = fromContext("Major") { it._major }
    val OM: Major get() = other(M)
    val red: Red get() = M.red

    private var _minor: Minor? = null
    fun setMinor(minor: Minor) {
        this._minor = minor
    }

    /**
     * The minor stored in previous bidding context by [setMinor].
     */
    val m: Minor get() = fromContext("minor") { it._minor }
    val om: Minor get() = other(m)

    /**
     * The last bid added to this [BiddingTree].
     */
    val lastBid: Bid
        get() = nextBids.map { it.previousBids.last() }.lastOrNull { it.bid !in nonBidCalls }
            ?: previousBids.last { it.bid !in nonBidCalls }

    val step: String
        get() = lastBid.step(1)

    /**
     * Checks how high the bidding has gone.
     * Useful in higher-order/first-class functions
     * where it can be hard to track when they are called.
     */
    fun stepShouldBe(bid: String) {
        require(step == bid) {
            "`step` is ${step}, expected $bid. Previous bids are $previousBids."
        }
    }

    /**
     * Allows users to make changes to a bidding context which is not top-of-stack
     */
    fun fixUp(block: FurtherBidding) = root.swapCurrent(this) { block(this) }
}

class BiddingSystem : BiddingContext() {
    var name = ""
    var author = ""

    /**
     * Description for the system, in GitHub Flavored Markdown
     */
    @Language("Markdown")
    var description = ""

    override val previousBids: List<Bid> = emptyList()

    fun opponentOpen(bid: String, meaning: String = "", opener: Bidder = Bidder.E, block: FurtherBidding) {
        require(opener.isOpponent)
        addBid(Bid(opener, bid = bid), meaning, block)
    }

    override val root: BiddingSystem get() = this
    internal var current: BiddingContext = this
    internal inline fun swapCurrent(newContext: BiddingContext, action: () -> Unit) {
        val top = current
        current = newContext
        try {
            action()
        } finally {
            current = top
        }
    }

    companion object {
        operator fun invoke(block: BiddingSystem.() -> Unit) = BiddingSystem().apply {
            block()
            checkNoDangling()
        }
    }
}

private fun Throwable.cleanUpAndThrow(): Nothing {
    stackTrace = stackTrace?.cleanUp()
    throw this
}

private fun Array<StackTraceElement>.cleanUp(): Array<StackTraceElement> =
    (listOf(this[0]) + dropWhile { it.className == BiddingContext::class.java.name })
        .toTypedArray()
