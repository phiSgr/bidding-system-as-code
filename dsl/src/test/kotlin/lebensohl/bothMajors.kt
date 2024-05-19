package lebensohl

import com.github.phisgr.bridge.BiddingTree

private fun BiddingTree.overBothM(is2H: Boolean) {
    explanation = """
        Transfers hurt minor, which we need to focus on.
        The lebensohl here is NOT transfer leb.
        
        Note that we are consistent that fast 3N is simply to-play
    """.trimIndent()

    "X" - if (is2H) "negative" else "penalty"
    if (is2H) {
        "2S" - "GF in D"
    } else {
        "2H/S" - "GF in C/D"
    }
    leb(
        slow = {
            "Pass/3D" - "to play" {
                explanation = "We continue the theme of slow suit = to play"
            }
            "3M" - "no stop in M (but OM stopped)"
            "3N" - "both M not stopped" {
                explanation = "breaking the rule that 3N promises stop. " +
                    "but at least there's 2N-3C reminding you of the artificiality."
            }
        },
        fast = {
            "3m" - "invite"
            if (is2H) {
                "3H" - "GF in C"
                "3S" - "54ms, no stop in Ms"
            } else {
                "3H" - "31(54)"
                "3S" - "13(54)"
            }
            "3N" - "to play"
        }
    )
}

fun BiddingTree.bothMajorOvercall() {
    overcall("2C/D", meaning = "both Ms (Landy/Cappelletti)") {
        overBothM(is2H = false)
    }
    overcall("2H", meaning = "both Ms (DONT)") {
        overBothM(is2H = true)
    }
}
