package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.twoClubs() {
    "2D" - "invit+ relay, asks for 3+crd major - could be 4-4 majors weak gambling on better fit" {
        "(X) 2H" - """was 1435/3415 "3 or 4 hearts" as normal"""
        "(2H) Pass" - "was 1345"
        overcall("2S") {
            "Pass" - "could be penalty of spades (bal X = takeout passable)"
            "X" - "takeout (passable) with 4H"
            "3C" - "was 1246 (pd 4H to play)"
        }
        overcall("3D") {
            "Pass" - "neutral (3H = was 5H GF)"
            "X" - "takeout"
            "opener" - "nat was 3406 10"
        }
        "(3H) X" - "takeout was 3046"
        "(3S) Pass" - "had min with sAQx (X = was takeout)"
        "2H" - "3-4H" {
            "2S" - "5+S GF" {
                "2N" - "was 1435/0445/1345" {
                    "3D" - "was 5350, thk D fit (4D = was 0445, cues)"
                    "3S" - "6+S"
                }
                "3C" - "was 2326 no D stop, denies 3S"
                "3D" - "was 1345/1444 max (3N/4S = s/o)"
                "3H" - "1435 (4C = sets C)"
                "3S" - "shows 3S assume?"
            }
            "2N" - "R, denies 5+S" {
                "3C" - "6+C" {
                    "3D" - "relay" {
                        "3H" - "4H-6+C(4H to play)"
                        "3S" - "was 2317"
                        "3N" - "3H exactly, was 3316/2326 (4C = sets C, 4D = H flag)"
                    }
                    "3N" - "to play"
                }
                "3D" - "4D, was 1345x2 (5D to play)"
                "3H" - "1435x3 any strength(3S = cue for H [3N min])"
                "3S" - "was 3415 any strength x2 (promises 4H)" {
                    "4D" - "was ART H slamtry (since had C cue)"
                    "4H" - "to play"
                }
            }
            "3C" - "NF, had 4S or 3-4H, 2/4 C (3N = accepts without 4H)"
            "3D" - "was nat, F (3H = was 1426 no S stopper [4H = sugg Moysian])"
            "4M" - "to play"
        }
        "2S" - """3-4S, could be 4405/3145/4135/4126/3226/4117/4306 "denies 3-3 majors, mb 3S-2H or 4S-3H"""" {
            "2N" - "relay, any shape" {
                "3C" - "6+C (was 4126/3226/4117/4306)" {
                    "3D" - "relay (was 2533 13) (3S = was 4117/4126 [4D = sets S])"
                    "3S" - "was 5431 GF (4S = to play, was min)"
                    "4C" - "sets C"
                }
                "3D" - "3145 (5D = to play)"
                "3H" - "was 4315 any strength, or 4405, promises 4S and 3H (4M = to play)"
                "3S" - "was 4135 min (5C = to play)"
            }
            "3C" - "NF"
            "3D" - "nat, F (3H = denies 4S was 3226)"
            "3S" - "was 6331 GF" {
                "3N" - "was 3145"
            }
            "4M" - "to play"
        }
        "2N" - "max 1suiter no 3+M" {
            "3D" - "was 4251 GF no H stopper (3N = had sK, hKx [5C to play had no H stop])"
        }
        "3C" - "min no 3+M"
        "3D" - "nat, was 4D-6C max (denies 3M)"
    }
    "2H" - "nat NF constructive" {
        "(2S) Pass" - "could be 6 nice clubs unbalanced with doubleton spade, but was bare minimum"
        "(3D) 4H" - "was 1426"
        "2S" - "was 4135 min (3C = s/o)"
        "2N" - "was 3136 max (3D = to play)"
        "3C" - "to play, was 3136 min"
        "3H" - "was 4315 11, NF"
        "4H" - "was 0445 min, 4315 max"
    }
    "2S" - "nat NF constructive" {
        "2N" - "was 2326 with solid clubs, 2236 max v. good clubs, 1345 12 any clubs, 0445" {
            "3C" - "to play, v. light"
            "3H" - "nat, was 11"
            "3S" - "nat NF, was 8/11"
            "3N" - "to play, was 6322 12"
        }
        "3S" - "courtesy"
        "4S" - "was 3415 12, 2236 13 bad hearts Kx spades"
    }
    "2N" - "5+S-4+H invit (4M = to play)"
    "3C" - "pree, 3+C"
    "3D/H/S" - "7+ crds invit"
    "4C" - "pree/to play"
    "4H" - "to play"

    overcall("X", balancing = true) {
        opponent("Pass", "pen by 2nd seat") {
            "XX by re:" responder "SOS over balancing X"
        }
    }
    overcall("X") {
        "Pass" - "may have constructive hand, waiting to reopen for takeout" {
            opponent("bid") {
                "3H" opener "may be 4 or 5 cards but highly distributional"
                addBid(responder, "reopening X by RE", "takeout")
            }
        }
        "XX" - "10+, was 7222/5233/24(34)/2533/5143 (if would relay, XX)" {
            explanation = "does not set up force if they win auction"
            addBid(responder, "later 2S freebid", "5S F1") {
                "2N" opener "s/o attempt, can stop in partial"
            }
            "3H" - "was 6C-5 bad hearts"
        }
        "2D" - "nat NF"
        "2H" - "was 6H 9-10, NF (3H = courtesy min 3fit)"
        "2S" - "nat NF"
        "3C" - "pree"
        "4C" - "was good pree vul x2"
    }
    overcall("2D") {
        "X" - "neg, at least one major usually, not nec. invit (later C raise constr. NF)" {
            "(3D) X" - "takeout, but does not set up force"
        }
    }
    overcall("2H") {
        "Pass" - "Op can reopen for takeout"
        "X" - "neg but if light or offshape will have 3+C, could have 5S if light" {
            overcall("3H") {
                "X" - "was 2137 alerted, probably is takeout without 4S"
                "3S" opener "was 4S-6C min"
            }
            "2N" - "nat, was x Kxx  KQxx  Axxxx, xx KJx Jx AQJxxx"
            "3C" - "was xx45"
        }
        "2S" - "F (3S = was min 3fit)"
        "3C" - "to play"
    }
    overcall("2S") {
        "X" - "neg but if light will have 3+C, may be invite with 6+H" {
            "2N" - "was QT xx Qx AKxxxxx"
            "3H" - "was 4H-6C min"
        }
        "2N" - "nat mb C fit"
        "3C" - "to play"
        "3S" - "was Qxxx Axx J QJxxx"
    }
    overcall("2N", "natural") {
        "3S" - "was 5314 8 good suit"
    }
    overcall("4D", "natural")
    overcall("4D", "D + M") {
        "Pass" - "may have normal takeout of a major (double later)"
        "X" - "cards?"
    }
    remark(opener, "(they bid, we balance) X = takeout, both sides")
}
