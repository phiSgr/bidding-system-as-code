package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.twoHearts() {
    "2S" - "asks for a minor - can easily be v. weak 3244 type, or any invite+ hand" {
        overcall("X") {
            "2N" - "was 1732 max"
            "3C" - "was 3505 11, pd passed with light invite"
        }
        "(3H) X" - "had 6H"
        "2N" - "6+H, denies 4+D (think single-suited)" {
            "Pass" - "4144 10 typically (5044)"
            "3C" - "relay" {
                "3D" - "6(322) but recently was 3631 promising 3S (4S = to play, 5C = to play)"
                "3H" - "see above, but 3631 (4C = sets H, 4D = sets D)" {
                    "3S" - "was 3334 slammish with cue" {
                        "3N" - "had S cue, min"
                    }
                }
                "3S" - "thk short D"
                "3N" - "was 1732/1633 (thk short S) (cues)"
                "4C" - "void C, cues"
            }
            "3D" - "ART I think invite to 4H?"
            "3H" - "to play (but was psyche)"
            "4H" - "to play"
        }
        "3C" - "was 3514 12, 1624 10, 3505 11, 2614, 1525 12" {
            "3D" - "relay, was 3244/5233/3262/3253/4225 GF" {
                "3H" - "was supposed to be 5H-5C, was 3514 once (4C = sets C, games = to play)"
                "3S" - "was 3514 [3N to play]"
                "3N" - "was 0544 (prob mb 1534)"
                "4C" - "6H-4C (even over X) (4D was slamtry H x2, 4H = to play)"
            }
        }
        "3D" - "5+H-4D (even over X)" {
            "3H" - "GF relay" {
                "3S" - "3541"
                "3N" - "1543 (4C sets C)"
                "4C" - "was 6H-4D"
            }
            "games" - "to play"
        }
        "3H" - "5+D (was 2650/2551)" {
            "4C" - "was D flag/cue"
        }
    }
    "2N" - "5+S, invit+" {
        "3C" - "4+C, was 2614/1534 (3S = 6+S [F?], 3N = to play)"
        "3D" - "was 1543 min, 1552 12"
        "3H" - "was 2524 min, 2632 max"
        "3S" - "was 2623 12 (4S = had AKTxx x KTx KQxx)"
        "3N" - "3S, max"
    }
    "3C" - "nat, F1 (3D = was 6-4 min, 3H = min [4C NF but recently was F])"
    "3D" - "nat, F1" {
        "3H" - "was 1624 min (3S = was 5161 slam [3N = to play])"
    }
    "3H" - "pree (4H = 7+H, 2-way shot)"
    "3S" - "GF, good suit (4C = was 1741 alerted, 4D = was 1642 no C cue [thk they unsure here what 4H is])"
    "4H" - "to play (op can compete to 5H with 6)"
    "4S" - "to play"

    overcall("X") {
        "XX" - "10+, even Qxx Jxx ATxx Kxx (opener's immediate 3H in comp is minimum w/ 6crds) (later pen X by XX'er)"
        "2N" - "was weak scramble"
        "3C" - "was lead-directing raise BPH"
    }

    overcall("X", "cards, was 3253 9 w/ 2 def tricks", balancing = true) {
        remark(opener, "opener ran to 3H with sing C")
    }
    overcall("2S") {
        "X" - """takeout, may be invite 3fit (was 4333/3334 11, 3352 10 and pd bid 3H with min 6crdsx2, "shows 6crd min")""" {
            "(3S) 4H" - "was 2641"
            "3C" - "was 1534 min no alert"
        }
        "3D" - "nat, was GF no fit"
        "3S" - "GF raise, does not set force over 4S"
        "3N" - """was 1534 10, 1552 8, 4441 11 (but forgot) - "any splinter""""
        "4H" - "mb 3325 13 (later X)"
        "Pass X 2N" responder "scramble"
    }
    overcall("3C") {
        "3S" - "GF was 6133 (4C = S flag)"
    }
    overcall("4S") {
        "5m" - "to play"
    }

    addPassHandAdjRow()
    "2S" - """nat, original "weak two", NF - but recently was 5413 invite (relay?) and was passed with 3S min"""
    overcall("X") {
        "3C" - "lead-directing raise"
    }

}
