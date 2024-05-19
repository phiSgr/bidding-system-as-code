package com.github.phisgr.bridge

val ALL_BIDS = (1..7).flatMap { level -> STRAINS.map { "$level$it" } }

val BID_STEPS = ALL_BIDS.mapIndexed { index, bid ->
    bid to index
}.toMap().withDefault { bid ->
    throw IllegalArgumentException("$bid is not a concrete bid")
}

val nonBidCalls = setOf("P", "Pass", "X", "XX")

infix fun String.isAbove(otherBid: String): Boolean =
    compareValuesBy(this, otherBid, BID_STEPS::getValue) >= 0

fun <T> Pair<T, T>.swapIf(cond: Boolean): Pair<T, T> =
    if (cond) Pair(second, first) else this

/**
 * Build length strings with dynamic suits. E.g. assuming [BiddingTree.M] is Spades:
 * ```
 * distribution(D * 5, OM * 4, M * 3, C * 1) == "3451"
 * ```
 * See [Suit.times]
 */
fun distribution(
    vararg lengths: Pair<Suit, Int>,
    separator: String = "",
): String {
    val sorted = lengths.sortedByDescending { it.first }
    require(sorted.sumOf { it.second } == 13)
    require(sorted.map { it.first } == SUITS.asReversed())
    return sorted.joinToString(separator) { it.second.toString() }
}
