package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.oneSpade() {
    "1N" - "0-9 no 4S" {
        overcall("X") {
            "Pass" - "had 5431 13"
            "XX" - "18+" {
                overcall("bid") {
                    "X" - "was 7 semibal with 5H"
                }
            }
        }
        overcall("2y") {
            "Pass" - "had 17 BAL"
            "X" - "18+, any distr. (cue = GF general)"
            "4S" - "was min distributional"
        }
        "2C" - "Gazzilli:  14-17 natural OR any 18+" {
            "2D" - "6-9 relay" {
                "(X) 2H" - "as normal"
                "2H" - "18+, 3+H" {
                    "2S" - "R, may be any shape, was 2245 7, 2335, 1345 6, 2425 7, 2434" {
                        "2N" - "was 5332x2, denies 4H" {
                            "3C" - "was 2335, no D stopper"
                            "3N" - "to play, was 2245"
                        }
                        "3C" - "4 clubs, so 5314'ish (5C = to play)"
                        "3D" - "was 5341 18 (3N = to play had doubleton S)"
                        "3H" - "was 5431/5422/7411/6421" {
                            "3S" - "doubleton"
                            "3N" - "to play"
                            "4H" - "to play [was 3]"
                        }
                        "3S" - "6+S (cues for S)"
                    }
                    "3C" - "natural, was 2326 6"
                    "3H" - "5+H, max (3D = cue, 3N = min. no S cue, 4H = min)"
                    "3S" - "was 0742 7, mb splinter for H (4C = was 5332 19, H is trumps)"
                }
                "2S" - "5+S-3+C, 14-17(16?)"
                "2N" - "was 5224 17, denies 3H"
                "3C" - "18+, 5+S-4+C, 0-2H" {
                    "3D" - "nat (3H stall)"
                    "3H" - "was 1624 (3N = was 5134 stiff Ace [5C to play])"
                    "3N" - "to play, may have 2S"
                }
                "3D" - "18+, 5+S-4+D, 0-2H (4C = cue for D)"
                "3S" - "6+S, denies 3+H (was 8crds 9 tricks or 6crds 7.5 tricksx2 - good suit either way, AKxxxx at worst)" {
                    "3N" - "to play"
                    "4y" - "cue for S, had Hx"
                }
            }
            "2H" - "0-5, 5+H" {
                "2N" - "strong invite, 20+, NF"
                "3H" - "invite, was 6313 18 solid spades"
                "4m" - "cue for H, huge hand"
            }
            "2S" - "0-5, 2(3)S"
            "2N" - "0-5, 5-5 minors (3S NF)"
            "3C" - "0-5, long C"
        }
        "2D" - "4+D, max 17" {
            "2H" - "to play"
            "2S" - "pref, signoff (3D = 5-5 max)"
            "2N" - "invit, may have 2S-3H (4S = was 6 good S-4H)"
            "3D" - "invit"
            "3H" - "invit, 6+H"
            "4D" - "was 2263 5, NF"
        }
        "2H" - "4+H, max 17, could be 6S-4H" {
            "2S" - "pref, signoff, tends to have some values (was as strong as 2344 8 2335 7, NF)"
            "2N" - "invite, was as weak as 2335 9 (3H = 5-5 min, signoff)"
            "3C" - "tk max"
            "3D" - "was max, tk max since pd bid 3N with fitting 14"
            "3H" - "invit, e.g. 8 HCP (3S = 6-4, 4H to play)"
            "4C" - "was 0544 8 with club cue"
            "4H" - "was 2623 5, 1534 9"
        }
        "2S" - "6+S, max 17" {
            "2N" - "invite, was 1543 8 1453 9, 1444 8 NF"
            "3D" - "nat invite, was 0472 8"
        }
        "2N" - "18+, 5+-5" {
            "3C" - "relay" {
                "3D" - "5S-5H"
                "3H" - "5S-5C [4S = was doub)"
                "3S" - "5S-5D [3N = to play (4D = 6-5), 4S = mb doub]"
                "4D" - "was 6S-5D 16 (4S = s/o was doub)"
            }
            "4S" - "was 3343 2 HCP"
        }
        "3C/D/H" - "5S-5y, good 16-17, more based on tricks"
        "3S" - "was 7222 5 losers"
        "4S" - "was freak non-slam"
    }
    "2C" - "10+ HCP, balanced (even longer D) OR clubs or S raise (even BPH)" {
        overcall("2D") {
            "Pass" - "was alerted, was 6241 15, pd doubled with 3433 10 but was removed back to 2S"
            "2H" - "was 5422 12, 5413 14 (4H min)"
        }
        overcall("2H") {
            "Pass" - "was 6430 18 (4S = bare min)"
            "3D" - "was 5-5"
        }
        "2D" - "4+H, 11+ HCP" {
            overcall("X", "ignore")
            "2H" - "?, prob NF short S, yes was 1345 10" {
                "2S" - "was 6421 15 (2N = was 1345 10)"
            }
            "2S" - "was 2164 11 recently NF" {
                "3N" - "was 5422 17 (4C = cue for S)"
            }
            "2N" - "GF relay, may be unbal with 3S-5+C, 5S-4C, 1444, 2434, 4153, 2353, 3433, 2245, 4243" {
                "3C" - """"maximum" was 5413 19""" {
                    "3H" - "sets H"
                }
                "3D" - "54(31) min, mb 14" {
                    "3H" - "relay (3S = shows 5431 exactly [3N = to play, 4D sets S ART])"
                    "4H" - "was 1444 11 with C wastage"
                }
                "3H" - "was 6403 10 (3S = was 3352 12 [3N = was 6403 10])"
                "3S" - "5-5, may be 11, 5512 9 (4C = sets H, 4D = sets S, 4S = to play)"
                "3N" - "5422 minimum (4H = to play)"
            }
            "3C" - "was 1336 16 great suit (4D = splinter for C)"
            "3H" - "GF H raise, was 10 bal"
            "3S" - "was 4135 12"
        }
        "2H" - {
            meaning = """4+D, says nothing about S length, GF, may have 3C, denies 4H
                        |** maybe exactly 4D **""".trimMargin()
            "2S" - "was 4225/4423, 3433/3244 10" {
                "2N" - "was 5242 16 (not max, cf 3N) (4S = to play)"
                "3D" - "was 5-5 min had C cue, so probably just natural (3S = had no H cue, now 3N ART min...)"
                "3S" - "6-4 max [cues (3N min?)"
                "3N" - "5242 max"
            }
            "2N" - "R, was 4225/3334/2335 12" {
                "3D" - "was 5341 min [3S sets S]"
                "3H" - "was 6241 min promises 6S (3S = sets suit [3N = min])"
                "3N" - "was 5242 15"
            }
            "3D" - "was 1345 14 (3S = was 7240 12, shows 6+S [raised with stiff, even with 14...])"
            "3H" - "was 2335 11 no H stopper (4C = was 5053 14 [5C = to play minimum])"
            "3N" - "was 1444 12 good soft stoppers in other suits (4N = quant was 19)"
            "4S" - "was 3433/3334 11, 3316 9"
        }
        "2S" - "was 6124/6214/5125/5224/6(331)/62(32)/5(332) min, denies 4+D, think GF, also 6223 20" {
            "2N" - "relay, says nothing about S" {
                "3C" - "was 6134/6214/5224 min, alerted 6223 20" {
                    "3D" - "R no S fit" {
                        "3H" - "was 6223 20 (3N was random 11 no S cue pd jumped 6S)"
                        "3N" - "5224 min"
                    }
                    "3S" - "sets S"
                }
                "3D" - "3C, may have 6S, incl 5233" {
                    "3H" - "R had no S fit, but once S fit (3S = was 6223x2 [4C = cue for S], 3N = was 5233x2 15 NF)"
                    "3S" - "S fit"
                }
                "3H" - "was 6331 15 (3N = to play)"
                "3S" - "6+S 14-17, without 3C (4C = cue for S)"
                "3N" - "5332 exactly, 15-17"
            }
            "3C" - "was 1336 (4C was 5125 min)"
            "3D" - "was 1345 13 (4C = had 3fit short H)"
            "3S" - "was 4333 10"
        }
        "2N" - "17+ one-suiter, was mostly 5332. or 6223 18 recently" {
            "3S" - "was 3415 slammish, 4432 minimum (cues)"
            "3N" - "to play, was 10 HCPx2, even with 4H or 5D"
        }
        "3C" - "was 5(21)5 13/15/17, 6124 17/18, 6304 15 (, 5224 18 4th seat)" {
            "3D" - "relay" {
                "3H" - "was 5125"
                "3S" - "was 6124 18 (4C = sets C)"
            }
            "3S" - "sets S, was just GF balx5 (3N/cues)"
            "3N" - "to play, doub S"
        }
        "3S" - "SOL 7+suit any strength (cues)"
    }
    "2D" - "10+ HCP, 5+D, GF, even without major fit" {
        overcall("2H") {
            "X" - "was 5224 14 (2S = was 4351 12, sets suit)"
            "3D" - "was 5440 12 (5D = was min with xx hearts)"
        }
        "2H" - "4+H, 11+" {
            "2S" - "was 3253 11x2 (F?)" {
                "3D" - "was 5431 11, 5530 15" {
                    "3S" - "was same as 4S, but signed off later quickly"
                    "4S" - "no slam"
                }
            }
            "2N" - "GF relay, any shape (GAR)" {
                "3C" - "5-4, 15+ (3D = relay [3N = 5422])"
                "3D" - "54(31) or 54(40) 11-15" {
                    "3H" - "R (3S = short C, 3N = short D)"
                }
                "3H" - "6+S-4H, was 6403 13 (probably 11-14 as... 4S = min to play)"
                "3S" - "was 5S-5H min, promises 5H (4H = to play)"
                "3N" - "5422 11-14"
            }
            "3C" - "4th suit GF, no C stopper (3S = 6+S)"
            "3D" - "was 2272/3172 GF" {
                "3N" - "had 6 good S but C stop (4D = sets D for cues)"
            }
            "3H" - "sets H, was 3460 10 (cues for H)"
        }
        "2S" - "was 6124/6313/5224/5215/72(13)/6322/5332/5314 minimum (16 ok)" {
            "2N" - "was 2254 14 (shows extras?)" {
                "3S" - "was great 7 crds (3N = had 2 spades weak H stop, maybe cue for S?)"
            }
            "3C" - "was 0355/0454, 2155 12, 1264 12" {
                "3D" - "fit, was 7231/5332 (3H = was 2155 no slam [3N to play], 3N = to play)"
                "3H" - "had hAx but 4 clubs (3N = H stop [4C = slamtry C])"
                "3S" - "was 6313"
            }
            "3D" - "was 2263 12, 1372 16" {
                "4S" - "was awesome solid suit minimum"
            }
            "3S" - "was 3271 9 (3N = was AQJTxx AJx Qx xx, think the minimum 3N since pd signed off)"
            "4C" - "splinter for S, mb void with 3fit"
            "4S" - "minimum"
        }
        "2N" - "17+ bal?"
        "3C" - "was 5215 14/15" {
            "3D" - "was 2182 (3N = to play)"
            "3H" - "was 1453 18 (4C = was 5215 15 no H stop [4H = cue for C had no D cue])"
        }
        "3D" - "was 5053 14 (3S = sets S was 4153 10)"
        "3S" - "SOL 7+suit any strength (cues)"
    }
    "2H" - "GF, 10+ HCP, 5+H" {
        "(2S) X" - "6+crds"
        "2S" - "denies 3H, was 8122, 6142 15, 5242 15, 7141 12" {
            "2N" - "was 2533 13, denies 6H, 5m (3N = was 5242 15)"
            "3C" - "was 0535 slammish, 2524 12, 2614 thk nat" {
                "3D" - "4th suit" {
                    "3S" - "doub"
                }
                "3S" - "was 8122/7141" {
                    "3N" - "to play"
                    "4C" - "S flag"
                }
            }
            "3D" - "was 1651 no alert (3H = was Hx [4C = was H flag])"
            "3H" - "was 8 hearts (4S = was AKJT9x and stiff heart, minimum, horrible bid)"
        }
        "2N" - "3+H (incl. 5332 18, 6322 17, 5314 16), cf 3H" {
            "3C" - "rel, any hand" {
                "3D" - "?"
                "3H" - "was 5314 16"
                "3S" - "6S-3H"
                "3N" - "was 5332 15"
                "4C" - "shows 53[32] 18+, cue"
            }
        }
        "3C" - "was 5134 16, 5044 19 (3S = sets S)"
        "3D" - "was 5152/5251, 5242 15, 6142 16 (3N to play, 4D = D flag, 4S = bad for slam)"
        "3H" - "3+H, 14+, may be 6-4, cues for H (3S = was Kxx [4C = was 5431 15, 3N = min])"
        "3S" - "SOL 7+suit any strength (cues)"
        "4H" - "was 5422 13, 6412 11"
    }
    "2S" - "2(+)-7(-) raise (with less and 3fit bid 1N)" {
        "(X) 3D" - "was dAKQx game try"
        "2N" - "relay" {
            "3C" - "was 3244 6"
            "3S" - "min"
            "3N" - "3(433) not min"
        }
        "3D" - "was short C GT"
    }
    "2N" - "raise, 5-9 4 crd, 7-9 3-crd, or 8-11 with sing." {
        overcall("X", "ignore")
        overcall("bid", "does not set up a forcing pass") {
            "3H" - "was 5S-4H GF (4H = to play was min)"
        }
        "3C" - "relay" {
            "3D" - "7-9, 3S" {
                "3H-3N-cues..." - "was 5S-5H no slam once, pd bid 4H as cue and they played 5-1 fit"
                "3N" - "c.o.g. 5(332)"
                "4C" - "was 6214 20 no H cue"
            }
            "3H" - "7-9, 4+S (4C = was serious cue x2)"
            "3S" - "5-6 with 4S (4C = serious cue)"
        }
        "3D" - "14-15 without 4+H, art (3S = min NF, 3N = 4S 7-9, 4S = 3S max)"
        "3H" - "was 5422 min/16, 5431 14, 5413 14/17 ()" {
            "3S" - "signoff"
            "4H" - "to play"
            "4S" - "was 4351 8, 4144 7, 3244 9"
        }
        "3S" - "5+S-4+H 11-13"
        "3N" - "was 5233 16, all side suits stopped"
        "4S" - "to play (5413 14 e.g.)"
    }
    "3C" - "5D-5H 10-15 (4S = misfit to play)"
    "3D" - "5C-5H"
    "3H" - "5D-5C 10-15?? (not sure actually, bid 2D many times with this)"
    "3N" - "was 5332 10"
    "4C/4D" - "D/H void splinter, 2/3 controls"

    overcall("X") {
        "XX" - "7+, but passed with 7 recently, maybe range was upped for XX since 1S mb light, may have 3+S" {
            "(2C) 2D" - "was min 5-5 (2N = invit was 8)"
        }
        "2C" - "to play"
        "2S" - "was 3crd 0-6 HCP, alerted"
        "2N" - "was 4342 6, 3226 7, 3235 8, probably same as if no int" {
            "3D" - "was 6232 14 and bid game with 8"
            "3S" - "signoff"
        }
    }
    overcall("1N") {
        "2N" - "was 4fit limit x2 (systems on)"
    }
    overcall("2C") {
        "X" - "negative, was 5"
        "2N" - "was 8 HCP 3fit"
        "3N" - "GF 4crd raise"
    }
    overcall("2D") {
        "X" - "neg or some GF, was 2245 GF, 1444 9" {
            "2H" - "was 5422 12" {
                "3N" - "was 2245 GF to play"
            }
            "2S" - "was 6S 14 and pd passed with 8 misfit"
        }
        "2H" - "was 6H 6 HCP, did not set up force"
        "2S" - "was 3334 6"
        "2N" - "3crd invit+ raise"
        "3D" - "was 5332 12, 3424 10 (3N = nat)"
        "4S" - "was 5233 6"
    }
    overcall("2H") {
        "X" - "negative, may be 3244 11, 2344 8, 2353 8" {
            "3D" - "was 5143 17"
            "3S" - "was GF" {
                "4S" - "to play had min doub"
            }
            "3N" - "was 19"
        }
        "2S" - "was 3334 with just Ace (4 HCP)"
        "2N" - "was 4S 7 HCP, 3S 8 HCP (even BPH)"
        "3D" - "was GF 1462"
        "3S" - "weak"
    }
    overcall("2S", "michaels") {
        "2N" - "was slammish 3fit (3D = was 5242 16 [3H = was slammish 3fit])"
        addBid(opener, "later opener's X", "extra strength/takeout")
        "3H" - "was 3fit GF"
    }
    overcall("2N", "minors") {
        "Pass" - "could have 7 (judgement)"
        "X" - "could have 6 (judgement)"
        "3S" - "was 3415 6 NF"
        "4S" - "mb 7 HCP 5crd"
    }
    overcall("3C") {
        "X" - "neg (3D = nat)"
        "4C" - "non-pree. raise to 4S, including 17"
    }
    overcall("3D") {
        "3N" - "to play"
        "4D" - "good raise, including 17, 5fit 10"
    }
    overcall("4H") {
        "5H" - "was 5062 9"
    }

    addPassHandAdjRow()
    "2C" - "can be bal 3crd 9-10 HCP, even with 3fit" {
        "2D" - "shows H, was 5413 19x2" {
            "2N" - "was 3433 12"
            "3H" - "was 2443 10, sets H"
            "3S" - "was 3343 11 sets S"
        }
        "2S" - "GF, was 6232 16, 5323 16 [no D stopper] (3S = was 4333 10, 4S = was 3424 9)"
        "2N" - "was 16 5332, 18 6223 (3S = was 3253 10, 4432 11 [3N = to play, 4C = cue])"
        "3C" - "was 5224 18 (3S = was 4333 10)"
        "4S" - "just wants to play 4S opp. PH"
    }
    "2D" - "semi-GF"
    "2H" - "GF (since if partner minimum then has 4+H)" {
        "4S" - "was bash 7222 13 good suit"
    }
    "2N" - "same"
    "4m" - "same"
}
