package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.twoDiamonds() {

    "2H" - "GF relay, asks for short major, OR INVITE with 4+H" {
        overcall("X", "H, ignore, but not sure what Pass/XX =") {
            "Pass" - "was 1363 min with H stop" {
                "XX" - "was GF 4234 (pd bid 3D with 1363 and H stop but probably out of book)"
            }
        }
        overcall("2S") {
            "Pass" - "could have 6D min, could have 4S min (X by Re = takeout)"
            "2N" - "was 3262 max with S stop"
            "3C" - "nat, was minimum"
            "3H" - "nat, was avg 5D-4H but conc."
            "3S" - "was 0454 max, 1453 min (3N = to play had no H or D fit)"
        }
        "2S" - "short H:  3154 any, 4153 any, 3055 11, 2164 12, 2155 9-10" {
            "(X) 4H" - "to play"
            "2N" - "GF relay, any shape, even with 6+H" {
                "3C" - "shows clubs, was 3154 any strength, 3055 11, 2155 9-12" {
                    "Pass" - "misfit city!"
                    "3D" - "relay" {
                        "3H" - "was 3154 12 (3N to play)"
                        "3S" - """"2155", was 3055 11, 2155 9-12 ("5-5+") (3N = to play, 4m = sets suit)"""
                        "3N" - "explained as 6+D-4+C short H, but F thought was 3154 (4C = fit)"
                    }
                }
                "3D" - "to play"
                "3H" - "was 4153 any strength, denies 2H (4D = sets D)"
                "3S" - "6D-4+S (was 5062 min)" {
                    "4D" - """not sure, was 1723 slammish and now 4H pd was explained "no Ace")"""
                }
            }
        }
        "2N" - "1-suited D hand no voids, or 4+S-2+H" {
            "3C" - "relay, if min then 4+S or D fit" {
                "(X) XX" - "max 6322, no C stop (3S = normal and had cA)"
                "3D" - "1-suited hand no void"
                "3S" - "was 4270/4261/4360 (4D = sets D had no C cue, 3N/4H/4S = to play)"
                "3N" - "6322 max (4S = to play)"
            }
            "3D" - "was 3415 12, likely NF" {
                "3S" - "4S-6+D, 2-3H"
            }
            "3H" - "was 2614 good 9 (3N = was 3262 no C stopper)"
            "4H" - "to play"
        }
        "3C" - "short S, 4+C, denies 4H, short S, was 0364/1354x4/(12)55 min, ** but recently was 3262 min , tk this right" {
            "3D" - "NF, but was GF relay recently (but was NF recently when 3C was bal - think they switched here)" {
                "3H" - "was 1354 min (4C = sets C)"
            }
            "3S" - "4th suit essentially)"
            "3N" - "to play"
        }
        "3D" - "6+D, short S or C (2-3H), any strength" {
            "3D" - "s/o"
            "3H" - "R [3S = short C was 3361x2 (3N/4H s/o),3N = short S was 1363]"
            "3S" - "5crds"
            "4H" - "s/o"
        }
        "3H" - "5D-4H low short (4S = to play)"
        "3S" - "5D-4H high short, any strength, including 0454 (4C = H flag, 4D = sets D, 4H/5C = to play)"
        "3N" - "6D-4H, says nothing about shortness (5D = to play)"
        "4H" - "was 4441 max"
    }
    "2S" - "invite exactly, 4+S" {
        overcall("3H") {
            "X" - "max, says nothing about majors"
            "3S" - "was 3451 min"
        }
        "2N" - "NF, pretty sure shows minimum without 3S, denies 3S, was 2362x2/2173, 0355 11x2, 1453 10, 1363 min" {
            "3C" - "nat NF, was 5224/4315 good suits (3N = was min 2362 endplayed?, 5C = suprise 0355)"
            "3D" - "NF"
            "3H" - "was 5413 GF (3S = had Ax)"
            "3S" - "was 5S 1-suiter 12"
        }
        "3C" - "was 1354 max (4D invit)"
        "3D" - "NF, was minimum 1561, medium 2263"
        "3H" - "was 3451 max (4D = fit [4S = to play Moysian])"
        "4S" - "was 4153 min, 4270 min"
    }
    "2N" - "transfer, clubs, or 5M F, or 5H-5S F" {
        "3C" - "forced" {
            "Pass" - "clubs s/o"
            "3D" - "asks for 3crd major, could be 5S-5H, 4S-5H or bal slammish" {
                "3H" - "had good H fit (cues)"
                "3S" - "was 3163/3154 (3N to play)"
            }
            "3S" - """5S, F, was 5233 14/15 ("5332 with S" GF) (3N = to play even with 1 suit unstopped)"""
        }
        "3D" - "was 2263 min" {
            "3H" - "5H F (4H = was Ax)"
        }
    }
    "3C" - "5+S-4H (or 6+-5+), invit"
    "3D" - "** 5H-5S invit ** (3M = to play)"
    "3M" - "invite, 6+ crds, may be light if distributional"
    "4D" - "pree/to play"
    "4M" - "to play"

    overcall("X", balancing = true) {
        addBid(responder, "Pass (Pass) XX", "SOS by re over balancing X")
    }

    overcall("X") {
        "XX" - "strong, even with 3343/5134" {
            overcall("2H") {
                "Pass" - "had Kxxx hearts" {
                    "2S" - "was 5134 12 (2N = to play [3D to play])"
                }
            }
            overcall("2S") {
                "X" - "max or good shape"
                "3D" - "min, 6+D"
            }
        }
        "2S" - "was 5134 8, 6232 8, does not set forcing pass"
        "3D" - "pree, 3+D"
        "3N" - "to play"
        "4D" - "pree/to play"
    }
    overcall("2H") {
        "X" - "neg but does not promise 4S and does not set force (op rebids side suit even with 7-4)"
        "3C" - "was long suit, good 9, 11" {
            "(3H) X" - "takeout, had 4153"
        }
        "3D" - "to play"
        "3H" - "incl. slamraises"
        "4S" - "to play"
    }
    overcall("2S") {
        "X" - "neg but does not promise 4H" {
            remark(opener, "op rebids side suit even with 7-4")
            "2N" - "was 4351 (3D to play)"
            "3D" - "6+D" {
                "later X by RE" responder "takeout (pd should strain to bid NT rather than penalize)"
            }
        }
        "2N" - "had QT9 Qxx AQxx xxx, does not set up forcing pass"
        "3C" - "BPH = nat NF"
        "3D" - "to play"
        "3H" - "GF"
        "4S" - "splinter raise (Was void with 5D)"
    }
    overcall("3C") {
        "X" - "neg, was 4432 (3S = 4crd)"
    }
    overcall("3D") {
        "X" - "cards, not lead-direct"
    }
    overcall("4S") {
        "X" - "negative/optional"
    }

    addPassHandAdjRow()
    "(2S) 3C" - "nat NF for some reason that hadn't preempted"
    "2H" - "nat, max passed hand, NF (4H to play)"
    "3D" - "**natural was invit**"
}
