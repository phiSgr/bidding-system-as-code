package lebensohl

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.majorAndDiamondOvercall() = overcall(
    "2X", meaning = "diamonds + a concrete M (e.g. 2D = D+H in Brozel)"
) {
    explanation = """
        Here we have two stoppers and one unbid major to show.

        After the lower cue bid, opener can cue the major to show D stopper but deny M stopper.
    """.trimIndent()

    "X" - "negative if the overcall is one of the suit bid. penalty otherwise."

    leb(
        slow = {
            "3D" - "asks for D stop, with 4cOM" {
                "3OM" - "no stop. 3-card fit."
                "3M" - "D stopped, asks for M stop."
                "3N" - "both suits stopped."
                "4C" - "no stop."
                "4OM" - "fit"
            }
            "3M" - "asks for M stop, promises D stop, with 4cOM" {
                "3S (if available)" opener "No stop. 3-card fit."
                "4C" opener "No stop."
            }
            "3OM" - "5C4OM, forcing to 3N. Except when 2OM is unavailable, then to play."
            "3N" - "both suits stopped, 4cOM, c.o.g."
        },
        fast = {
            "3C" - "asks for D stopper, no 4cOM" {
                "3D" - "no stop"
                "3OM" - "no stop, 5cOM"
                "3M" - "D stopped, no M stop"
                "4C" - "no stop, 5+C"
            }
            "3red" - "D stopped. asks for M stopper, no 4cOM" {
                "3M" - "no stop"
                "3S (if available)" - "no stop, 5cS"
                "4C" - "no stop, 5+C"
            }
            "3OM-1" - "5+OM inv+"
            "3S" - "5+C inv+"
            "3N" - "both suits stopped, to play"
        }
    )
}
