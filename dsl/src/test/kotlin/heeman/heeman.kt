@file:Suppress("LocalVariableName")

package heeman

import com.github.phisgr.bridge.*
import java.io.File

/**
 * The four-fold symmetry sequence.
 * The sequence [isFast] if responder's first bid is a transfer to [M],
 * i.e. it does not go through 2C-2D.
 */
private fun BiddingTree.symmetric(isFast: Boolean, M: Major) {
    val majorHolding = "${if (isFast) 4 else 5}c$M"
    val minorLength = if (isFast) 5 else 4

    "2N" - "$majorHolding inv to both games"
    "3m" - "$majorHolding$minorLength+m, inv"
    Minor.suits.forEach { m ->
        "3${m.correspondingMajor}" - "$majorHolding$minorLength+$m, GF"
    }
    "3N" - "$majorHolding choice of game"

    val suitQuality = if (isFast) "weak" else "good"
    "4m" - "splinter, $suitQuality long $M"
    sorted {
        when (M) {
            // no way to show spade splinter with long H
            H if isFast -> "4S" - "undefined"
            // no way to show S suit quality when the splinter suit is H, as slow 4H is RKCB
            S if isFast -> "4H" - "splinter, long $M"
            else -> "4${other(M)}" - "RKCB"
        }
        "4$M" - "$suitQuality long $M, slam inv"
    }
    "4N" - "$majorHolding inv to both slams"
}

private fun BiddingTree.breakTransfer(M: Major) {
    val otherSuits = ((1..4).map { lastBid.step(it) } - "2N").joinToString("/")

    "2N" - "four good ${M.fullNamePlural}, minimum"
    otherSuits - "four good ${M.fullNamePlural}, maximum, two small or doubleton ace or king in suit bid"
    "3$M" - "four good ${M.fullNamePlural}, maximum"
}

private fun BiddingTree.bothMajorResponses() {
    fun BiddingTree.afterRetransfer(M: Major) {
        "3N" - "to play"
        "4m" - "cue for $M (6+$M)"
        "4$M" - "6+$M slammish"
        "4N" - "6-key RKCB for $M"
    }

    val noMajorShown: FurtherBidding = {
        "3D" - "five hearts, four or five spades, inv+" {
            "3H" - {
                "3S" - "55Ms, forcing"
                afterRetransfer(H)
            }
        }
        "3H" - "five spades, four hearts, inv+" {
            "3S" - { afterRetransfer(S) }
        }
        "3S" - "mildly slammish 4=4=4=1"
        "3N" - "4-4 in the majors, choice of games"
        "4M" - "to play (6M4OM)"
    }

    "2N" - "min, no 4cM" {
        "P" - "44Ms"
        noMajorShown()
    }
    "3C" - "max, GF. May or may not have 4cM" { noMajorShown() }
    "3H" - "min, 4cH. A subsequent 4NT is 6-key RKCB"
    "3S" - "max, 4cS. A subsequent 4NT is 6-key RKCB"
}

fun BiddingTree.heeman() {
    "2C" - "puppets to 2D" {
        "2D" - {
            "2H" - "transfers to 2S" {
                "2S" - { symmetric(isFast = false, M = S) }
            }
            "2S" - "slammish long m, or inv- both ms" {
                val strongCase: FurtherBidding = {
                    "3H/S" - "long C/D slammish" {
                        "3N" - "discourages slam" {
                            "4m" - "sets m"
                        }
                    }
                    "3N" - "to play"
                }
                "2N" - "min" {
                    "3C" - "P/C"
                    strongCase()
                }
                "3m" - "max, preference" {
                    "P" - "weak both ms"
                    strongCase()
                }
            }
            symmetric(isFast = false, M = H)
        }
    }
    "2D" - "transfers to 2H, can be 4cH if inv+" {
        "2H" - "denies good four-card support for hearts" {
            "2S" - "4+Ms inv+ F1" {
                bothMajorResponses()
            }
            symmetric(isFast = true, M = H)
        }
        breakTransfer(M = H)
    }
    "2H" - "transfers to 2S, can be 4cS if inv+" {
        "2S" - "denies good four-card support for spades" {
            symmetric(isFast = true, M = S)
        }
        breakTransfer(M = S)
    }
    "2S" - "asks min/max" {
        "2N/3C" - "min/max" {
            "3C/Pass" - "to play"
            "3D" - "CONFIT: balanced slammish." {
                explanation = """
                    1. Opener replies control. Assuming strong (15-17) NT, first step (3H) = 3/4 controls, 3S = 5 controls...
                    2. Any time responder returns to notrump, opener must pass.
                    3. Opener must never raise the level except for points 1 and 6.
                    4. Both players bid suits up the line
                    5. Rebidding a suit shows a fifth card in it.
                    6. When opener fits a suit that responder has shown, he raises.
                """.trimIndent()
            }
            "3H/S" - "both ms slammish, longer C/D"
        }
    }
    "2N" - "asks weak doubleton (JX or worse)" {
        "3x" - {
            "4m" - "if x = m forcing, else inv"
            "4N" - "nat inv"
        }
        "3N" - "no weak doubleton"
    }
    "3C" - "puppets to 3D" {
        "3D" - {
            "3M" - "4441M slammish"
            "3N" - "4=4=1=4 slammish"
            "4C" - "4=4=4=1 very slammish" {
                explanation = "For regularly slammish 4-4-4-1, See 1N-2D-2H-2S-2N/3C-3S."
            }
        }
    }
    "3D" - "long M inv" {
        "3H" - "rejects H inv" {
            "3S" responder "S inv"
        }
        "3S" - "rejects S inv, accepts H invite"
        "3N" - "accepts invite in either M" {
            "4m" - "transfer"
            "4M" - "to play"
        }
        "4C" - "accepts invite in either M, asks responder to transfer"
        "4D" - "accepts invite in either M, asks responder to play"
    }
    "3M" - "1M3OM54ms" {
        "4m" - "4+m, NF"
        "4OM" - "to play"
        "4M" - "asks responder to bid his longer m. GF"
    }
    "4C" - "Gerber 1430"
    "4red" - "Texas Transfer"
    "4S" - "5-5ms, choice of minor games"
    "4N" - "quant"
    "5m" - "to play"
}

fun main() {
    val system = BiddingSystem {
        name = "HEEMAN - Responding to 1NT"
        author = "Wim Heemskerk"
        description = """
            Adapted from https://www.jackbridge.com/pdf/eheeman.pdf
        """.trimIndent()

        "1N" - { heeman() }
    }


    val file = File("build", "heeman.html")
    system.writeHtml(file)
    println("Written HTML to ${file.absolutePath}")
}
