package lebensohl

import com.github.phisgr.bridge.BiddingTree
import com.github.phisgr.bridge.FurtherBidding


private fun BiddingTree.puppetLikeResponse() {
    "3H" - "4cH, may have 4cS"
    "3S" - "4cS, denies 4cH"
}

private fun slow(isWeak2: Boolean): FurtherBidding = {
    "3D" - "at least one 4cM, D stopped" {
        if (isWeak2) {
            explanation = "Advancer, who has the stop, bids NT first."
        }
        puppetLikeResponse()
    }
    "3M" - "5M4OM" {
        explanation = "to sign off in M, just bid 2M."
    }
    "3N" - "Slammish in C with stop"
    "4C" - "Slammish in C without stop, or very slammish in C."
}

private val fast: FurtherBidding = {
    "3C" - "transfer cuebid - Stayman (at least one 4cM) without stop" {
        "3D" - "no stop" {
            puppetLikeResponse()
        }
        "3H" - "4cH and (4cS or D stop)" {
            explanation = "So there must be some place to go to (3N or 4S) if there's no H fit."
        }
        "3S" - "4cS and D stop"
        "3N" - "D stop. No 4cM"
    }
    "3D/H" - "inv+ in H/S"
    "3S" - "GF. No 4cM. No D stop." {
        explanation = "Consider it a transfer to no trump. See also the slow 3N/4C"
        "4C" - "counting on partner to have some clubs. NF"
    }
    "3N" - "no 4cM, D stopped"
}

fun BiddingTree.lebOverWeak2D() = "X" - "take out, can be strong single suited" {
    explanation = """
        Having two unbid majors create some challenge.
        Here the cue-bid - both the fast transfer and through 2NT - are Staymanic.
    """.trimIndent()
    fourthHandApplies()


    leb(
        slow = slow(isWeak2 = true),
        fast = fast,
        not3C = {
            "3D" - "GF, asks stop."
            "3M" - "approx 16-20, nat"
            "3N" - "19-20"
        }
    )
}

fun BiddingTree.natDiamondOvercall() = overcall("2D", meaning = "diamonds (May include another suit, e.g. in DONT)") {
    "X" - "negative"
    "2M" - "to play"
    leb(slow = slow(isWeak2 = false), fast = fast)
}
