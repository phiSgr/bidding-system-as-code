package lebensohl

import com.github.phisgr.bridge.BiddingTree
import com.github.phisgr.bridge.FurtherBidding

// ideas from https://bridgewinners.com/article/view/lebensohl-an-optimized-approach/

private val slowOverMajor: FurtherBidding = {
    "3M" - "4cOM GF, no stop"
    "3x" - "to play"
    "3N" - "4cOM, with stop"
}
private val fastOverMajor: FurtherBidding = {
    "3M-1" - "transfer cue, no 4cOM, no stop" {
        "3M" - "not stopped"
    }
    "3X-1" - "5cX, inv+ (it wraps around, i.e. 3S = transfer to C)" {
        "3x" - "decline invite"
    }
    "3N" - "no 4cOM, with stop"
}

fun BiddingTree.natMajorOvercall() = overcall("2M", "natural M") {
    explanation = "This also applies when the overcall show an unknown minor, or the call is not the major shown."
    "X" - "negative"
    "2S" - "to play"
    leb(
        slow = slowOverMajor,
        fast = {
            fastOverMajor()
            "4m" - "Leaping Michaels, 5OM5m"
        },
        explanation = """
            On the ACBL Convention Card, it asks "____ denies".
            We do play "fast denies" here, but we do not deny a stop, but 4cOM.\
            Use cue/3NT to deny/promise stop is more
            [iconic](https://en.wikipedia.org/wiki/Iconicity).
        """.trimIndent()
    )
}

fun BiddingTree.lebOverWeakTwo() {
    "X" - "take out, can be strong single suited" {
        fourthHandApplies()
        leb(
            slow = slowOverMajor,
            fast = {
                fastOverMajor()
                "4m" - "nat slammish, kickback turbo afterwards"
            },
            not3C = {
                "3x" - "approx 16-20, nat"
                "3M" - "GF, asks stop."
                "3N" - "19-20"
            },
            explanation = """
                This is mostly the same as 1N - (2M),
                except that "responder" cannot double.
            """.trimIndent()
        )
    }
}
