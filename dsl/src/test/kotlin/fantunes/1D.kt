package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.oneDiamond() {
    "1H" - "4+H, 0-9" {
        overcall("X") {
            "XX" - "had 4fit 17"
        }
        overcall("1S") {
            "Pass" - "was 4252 16 (X = was 1534 9)"
            "X" - "18+ (what is 1N?)"
            "1N" - """"17-19", was 4252 18 (2S = general GF)"""
        }
        overcall("2S") {
            "X" - "18+ (takeout X by responder)"
        }
        "1S" - "5+D-4S (forcing?), was 4360/4351 16, 4144, 4252 17" {
            "1N" - "was 3415 6 NF, 2425 7 NF (2N = was 4252 17 so probably 1NT guarantees some values)"
            "2C" - "relay, 6+" {
                "2D" - "was 4162 min (3N = to play had 6 bad hearts)"
                "2H" - "was 4351 16, promises 3H"
            }
            "2D" - "to play, was 6-7, doubleton twice, but once with 3S so maybe courtesy" {
                "3H" - "was 4360 16"
            }
            "2S" - "was 4522 7 courtesy (NF)"
            "2N" - "invite"
            "3S" - "invite"
        }
        "1N" - "any 18+ unbalanced" {
            "2C" - "6-9 HCP relay, GF" {
                "2H" - "was 4441 19 (4D = was min splinteR)"
                "2S" - "was 4252 19 (4H = to play)"
                "2N" - "18-20, 6-(322)" {
                    "3H" - "was 4603 (3S = had 2H)"
                }
                "3C" - "was (21)55 21, 3154 23" {
                    "3D" - "was 3-fit x2, once with C fit too" {
                        "3H" - "4th suit or advance cue"
                        "3N" - "descriptive"
                    }
                    "3N" - "was 4423 (4C = was 22+ 55)"
                }
            }
            "2D" - "0-5, 2+D"
        }
        "2C" - "14-17 nat, 5+D-4+C, may have 3H" {
            "2D" - "to play, mb 2D-3C 5"
            "2S" - "was 3523 9 with S stop, AQ QJxxxx Txx xx" {
                "2N" - "was 3154 16 w/ half S stop (3H = NF)"
                "3S" - "was 17, sAx, maybe xfer to 3N, pd bid 3N with QJx"
            }
        }
        "2D" - "14-17 6+D 1-suiter, may have 3H" {
            "2H" - "was 6+H 7" {
                "3H" - "was Qx minimum"
            }
            "2S" - "was 4513 9 (3H = 3crds, was min)"
        }
        "2H" - "4crd raise, 14-17, mb unbal 15" {
            "3C" - "was xx AJT97 xx QTxx"
            "3H" - "was preempt but they thought invite"
        }
        "2N" - """GF relay, was 3262 22, but explained online as 6D-4S 18+ "and this could change soon"""" {
            "2N" - "R" {
                "3C" - "sing C"
                "3D" - "sing H"
                "3H" - "void C"
                "3S" - "void H"
                "3N" - "5161"
                "4C" - "5260"
                "4D" - "5062"
            }
            "3C" - "was 2425 5" {
                "3D" - "was 3262 22 (3N = was 2425 5)"
            }
            "3D" - "weak"
            "3H" - "6+H F"
            "3S" - "weak supp"
            "3N" - "to play"
        }
        "3D" - "had about 8 tricks, 2H"
    }
    "1S" - "4+S, 0-9" {
        "(X) XX" - "had GF S raise"
        "1N" - "any 18+ unbalanced" {
            "2C" - "6-9 relay, GF <--- they have had a few mixups after this point" {
                "2D" - "was 3262" {
                    "3C" - "was 4225 (3H = had Qx H)"
                }
                "2H" - "nat, incl. 1444, 3361 20 *new?*" {
                    "2S" - "had 5224/5332, then nat, but recently 4315 7 maybe a R when pd had 3361 20" {
                        "3D" - "recently 3361 20 - again they had a mixup"
                    }
                    "2N" - "was 5233 10 (3N = was 2452 18)"
                    "3D" - "nat had 5S-4D"
                }
                "2N" - "18-20, 6-(322)  (3S = was 5422)"
                "3C" - "nat, was (31)54/1444" {
                    "3S" - "had 5/6S, no H stopper"
                    "4C" - "was 4315 9 with Qxx H (cues)"
                }
                "3N" - "was SOL 7D, minimum, but misunderstanding"
            }
            "2D" - "0-5, 2+D (2N = was 2254 21 [3S = was 5323 5 (3N to play)])"
            "2H" - "5+S-4+H GF (since 1D-2D is same 0-6)" {
                "2S" - "was 2362 min (3C = was 5422 8 [event. got to 5-2 4S since just 1 club stop])"
            }
        }
        "2C" - "4+C 14-17" {
            "2D" - "pref"
            "2H" - "4th suit forcing (was 5323/5305 9/10 with H stopper, so maybe relay)" {
                "(X) Pass" - "was 2254 17 with Qx H (5C = to play so Pass denied 3S)"
                "3D" - "denies 3S, was 2254 16 (no H stopper)"
            }
            "2N" - "invit"
            "3S" - "invit"
        }
        "2D" - "5+D 14-17, may have 3S and/or 4H" {
            "2S" - "6+S or 5decent S with max, was 6322/6214 8, NF (3S = was 3451 17)"
            "2N/3D" - "invit"
            "3C" - "was 5332 9 no C stop, 5323 9 with Qxx C, 5143 8 with C stop, 5224 10 no H stop - guess art invite" {
                "3D" - "was 2461 min, NF"
                "3S" - "3crd"
                "3N" - "to play, may have 4H"
            }
            "3S" - "invit"
        }
        "2H" - "??"
        "2S" - "4crd raise, 14-17" {
            "2N" - "was 4324 8 (pd bid 4S with 4441 14)"
        }
        "2N" - "GF relay"
        "3D" - "about 8 tricks"
    }
    "1N" - "no M, 0-9" {
        "(X) Pass" - "includes (43)51 so 2D prob shows 6 (later bid 2S with max)"
        "(2H) 3C" - "was 4054 15"
        "2C" - "Gazzilli:  14-17 natural, or any 18+" {
            "2D" - "6-9 relay" {
                "2N" - "was 2254 18, GF (3C = fit then stoppers)"
                "3C" - "14-17 nat NF, but was 1354 21 recently (3S was AKx xxx Qxx xxxx, then 4H slamtry Q AQx AKTxx AQxx)"
            }
        }
        "2D" - "nat 14-17, may be just 5 cards with a 4M, was 4252 16, 4450 14, 3451 16" {
            "2H" - "7-9 no H stop (2N = was 3451 16 [3D = s/o])"
            "2S" - "7-9 H stop no S stop (3N = was 4252 16)"
            "2N" - "invite, both M's stopped"
        }
        "2H/2S" - "??"
        "2N" - "GF relay"
        "3D" - "good suit, trick-based, but limited strength (3S = heart worry, 4D = inv)"
    }
    "2C" - "GF, balanced OR clubs OR D raise" {
        "2D" - "nat 14-17 denies 4M, was 3262/3154 16, 3064 13" {
            "2H" - "was 1435" {
                "3C" - "was 3154" {
                    "3D" - "was 1435"
                }
            }
            "2N" - "was 4324"
            "3N" - "was 4324 10"
        }
        "2H" - "was 4441/2452 15/16 x2, 1561 18" {
            "2S" - "4th suit" {
                "2N" - "S stop (3N = had 13/16)"
            }
            "2N" - "was 4243 11, but they missed a 4-4 spade fit, 4216 10" {
                "3D" - "was 4441 16"
                "4C" - "was 1561 18 (5D = to play)"
            }
            "3D" - "was 3145 11 (3N = good S stopper)"
        }
        "2S" - "4S any strength, was 4252/4144/4351/4153, 4351 19/21, 4153 13, 4360 3rd seat, 4261 19" {
            "2N" - "relay, was 2137 12, 3343 13, 2425, 4234 10, 3442 11" {
                "3C" - "5D-4S 18+" {
                    "3D" - "R (3H = short C (4C = cue for D), 4C = was 4252 20 too strong for 3N)"
                }
                "3D" - """4153 (but was 4144/4351x2) 14-17 ("shows 3 clubs")""" {
                    "3H" - """"relay" (3S = was 4351 17 [4C = S flag], 3N = was 4153 13x2)"""
                }
                "3H" - "?"
                "3S" - "was 4261 19 (4S = signoff min)"
                "3N" - "4252 14-16 (4D sets D)"
            }
            "3C" - "was 3226 10 (3D = was 4351 19)"
            "3N" - "fast arrival (10 e.g.)"
            "4S" - "to play"
        }
        "3C" - "was 3154 18, 2254 17 (3H was 1435 12 [3S had no S stopper], 3N = to play was 3343)"
        "3D" - "was 3172 20, think cues now"
    }
    "2D" - "5+S-4H, 2-6 (NF)" {
        "2H" - "was 2452 18" {
            "2S" - "was 6412 4" {
                "2N" - "R, was 2452 18 (3H = was 6412 4)"
            }
        }
    }
    "2H" - "GF, 5+H (not 5332 but was recently)" {
        "2S" - "4162 13" {
            "2N" - "was 6H GF (3H = was 4162 13 [4N quant])"
        }
        "2N" - "was 4351 14/18, thk relay" {
            "3C" - "was 2722 12, 2533 14" {
                "3D" - "was 4351, thk relay" {
                    "3H" - "was 2722 12, then cues for H"
                }
                "3S" - "was 4351 14 (think H cue, cues)"
            }
        }
        "3C" - "was 2155 (had misopened, had 11), 3055 14, 3154 BPH" {
            "3H" - "was 3703/2623 (3N = was 3055, 4H = worst possible hand with singleton)"
        }
        "3D" - "was 3163 16, 2182 15" {
            "3H" - "was 2623, promises 6+H"
            "4D" - "sets D"
        }
    }
    "2S" - "GF, 5+S (not 5332)" {
        "2N" - "was 3154 15, think promises S fit?" {
            "3C" - "was 6322 13 (3N = was nonserious... cues)"
        }
        "3C" - "4+C, denies 3+S, was 1354/1444/1255" {
            "3D" - "nat"
            "3S" - "was 7123" {
                "3NT" - "to play" {
                    "4C" - "was 7123 and cue-bidding commenced ending in a jump to 6C by the 5crd"
                }
            }
            "4C" - "sets C"
        }
        "3D" - "had 1273, 1174 14[SOL D], 1363 14/16" {
            "3H" - "was 6403 11, prob implies just 4H since 1D-3C = 5S-5H (3N = was 1174 min, to play)"
            "3S" - "was 7 great spades no D fit x2" {
                "3N" - "s/o attempt (cues for S)"
                "4S" - "was sing min (Turbo/cues)"
            }
            "3N" - "to play (4C = cue for D[4N quant])"
        }
        "3S" - "fit, was 4252 14, 4441 15 (cues)"
    }
    "2N" - "GF, 5M-332" {
        "3C" - "relay, any shape" {
            overcall("X", "ignore")
            "3H" - "5S, was 12 once (4S to play)"
        }
        "3N" - "no 3crd M, to play, was 2263 15"
        "4C" - "5-5 slammish (4D = D fit, 4M = cue for C, 4N = to play)"
        "4D" - "sets D, great suit, cues"
    }
    "3C" - "5H-5S GF (3N = to play)"
    "3D" - "was 1354 5" {
        "3H" - "was 4441 20 (3S = was 1354 6, cues...)"
    }
    "3H" - "?"
    "3S" - "now 5H-5C 11-14"

    overcall("X") {
        "XX" - "6-7, may have fit and/or 4M, activates inverted doubles (X = 2-3 cards in their suit, Pass = long/short)" {
            "(bid) X" - "extras"
        }
        "1H" - "was 3532 5, 2623 6" {
            "(2C) 2S" - "was 5161 13"
        }
        "2D" - "weak 3+D, may have 4M as judgement"
        "2S" - "was 6S-5D 6"
    }
    overcall("1H") {
        "X" - "4 or 5 S" {
            "(bid) free 2S raise" - "3-4 crds [no supp X]"
            "1S" - "3crds, but was 4252 15 recently"
            "2H" - "generic 18+ incl 3154 18 [2N = nat]"
            "2S" - "4crd, min"
        }
        "1S" - "takeout without 4+S"
        "2C" - "5+C F (2S = nat not reverse)"
        "2D" - "3-7(-) raise, mb 3 good cards"
        "2H" - "6+S (cf X)"
        "2S" - "general GF without 4+S, had 6D"
        "3D" - "v. weak, 4+D (pd did not move with AQx xxx AQJ9xx A)"
    }
    overcall("1S") {
        "Pass" - {
            "X" opener "was 3154 19 (1N = was 6 HCP with stop [2S = general force])"
            "2S" opener "was 0454 21"
        }
        "X" - "4 or 5 H" {
            "(XX) 1N" - "was 4252 17 (2C = to play)"
            "2S" - "general GF"
        }
        "1N" - "was 4324/4333 7 (2D = to play, 2H = was 18+ nat)"
        "2C" - "5+C, F, may be 7 HCP (2H = nat not reverse, 2N = was 16 with S stop [3S = was c.o.g.])"
        "2D" - "3-7(-) HCP raise, mb 3 good cards (2S = was 21+ [3D signoff attempt])"
        "2H" - "5+H, not GF (3D = NF)"
        "2S" - "had 10 HCP 4D, no S stop"
    }
    overcall("1N") {
        "2D" - "mb weak 3fit"
        "2M" - "to play"
    }
    overcall("2C") {
        "X" - "neg, had 4S, may be 5S-5H 8 (2S = was 4351 min)"
        "2D" - "3-7(-) HCP raise, mb 3 cards, may be 4-4 majors, still bid majors nat to find 4-4 fit" {
            "(X) XX" - "18+ sets F pass"
            "(any) 3M" - "nat reverse"
        }
        "2H" - "was 5H 8 HCP"
        "3D" - "pree, was 3253 5"
        "3H" - "was 7crds 5 HCP"
    }
    overcall("2D", "Michaels") {
        "3D" - "was 7 4fit"
    }
    overcall("2H") {
        "3D" - "GF, nat"
    }
    overcall("2S") {
        "3D" - "to play, mb 3"
        "3H" - "was 2632 8"
    }
    overcall("3C") {
        "3H" - "was confusion, one thought it showed spades"
    }
    overcall("3C", "C-H") {
        "X" - "neg"
    }
    overcall("3D") {
        "X" - "neg, might not have both majors (4D = strong, scramblish)"
    }
    overcall("3H") {
        "3S" - "GF (3N = had 0454 [4H = slamtry S])"
    }

    addPassHandAdjRow()
    "2C" - "invit, mb 3334" {
        "2S" - "was 4360 min (3N = was 3334 10)"
    }
    "2D" - "same"
    "2H" - "near GF (3C = was 3154 15 [3H = NF])"
    "2S" - "9-11 GF 5S (3H = not nec strong, was 2461 14)"
    "2N" - "5M332 10-11 (cont's the same)"
    "3C" - "(same - 5H-5S GF)"
}
