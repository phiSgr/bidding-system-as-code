package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.twoNoTrump() {
    "3C" - "Puppet Stayman" {
        "(X) Pass" - "had C stop with/without 5M" {
            "XX" - "pls continue"
        }
        "3D" - "at least one major" {
            "3H" - "4S" {
                "3S" - "S fit, cues"
            }
            "3S" - "4H" {
                "3N" - "nope" {
                    "4D" - "4D" {
                        "4N" - "renope (5N = invit)"
                    }
                }
            }
            "4C" - "4-4 majors at least mild slammish (4S = to play)"
            "4D" - "4-4 majors no slam"
            "4N" - "quant, no major"
        }
        "3H" - "no 4M (was 4333 recently)" {
            "3S" - "transfer to 3N, incl. hands with 4H"
            "3N" - "5S-4H I think"
        }
        "3S" - "5S"
        "3N" - "5H"
    }
    "3D" - "transfer" {
        "3H" - "may have 3H" {
            "3S" - """was 4531, 1543 10, 1642 6 "transfer to 3N"""" {
                "3N" - "denies 3H (4H = was 1642 6)"
                "4C" - "sets H"
                "4H" - ""
            }
            "3N" - "4S-5H no slam"
            "4C" - "was 0544 slammish (4H = ? had no fit for anything)"
        }
        "3S" - "cue with 3+H (3N turbo, 4D retransfer)"
        "3N" - "3H but suggests 3NT (4D retransfer)"
    }
    "3H" - "transfer" {
        "3S" - "2S" {
            "4C" - "was 5125 8 (4S = signoff attempt - was good doubleton - NF, 4N = signoff attempt bad S)"
            "4D" - "was 5341/5251 slammish (4H = was 3D but slammish, 4N = just 3D NF)"
        }
        "3N" - "3S (4H retransfer)"
        "4C" - "was good hand 4Sx3 (4H retransfer)"
        "4S" - "was 4333 21 good ctrls"
    }
    "3S" - "5+S-4+H GF"
    "4m" - "South African Transfer to 4M"
    "4H" - "6+C slammish"
    "4S" - "6+D slammish, was 2263/2272/1462 - they may not know if 4N is Turbo here, or to play" {
        "4N" - "to play but was AJ AKx KQx AJ9xx recently" {
            "5C" - "was xx Jx AJTxxxx Qx"
        }
        "5C" - "was KQJTx KQx AKx Kx" {
            "6C" - "was no 1st rd 5-level cue, odd keycards, got to 6D off 2 Aces"
        }
    }
    "4N" - "quant"
}