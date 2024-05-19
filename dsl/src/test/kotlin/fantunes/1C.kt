package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.oneClub() {
    "1D" - "4+H, 0-9 (10-12 ok if bal nonpositional for NT)" {
        overcall("X") {
            "XX" - "18+, cards (takeout doubles)"
        }
        overcall("1S") {
            "Pass" - "15-18(-)" {
                "X" - "cards, says nothing about S length" {
                    "1N" - "nat may have 3H"
                }
                overcall("2S") {
                    "X" - "was cards once, cards+ takeout another"
                }
            }
            "1N" - "18+-20, may have 3H, balancing double takeout" {
                "2D" - "retransfer"
                "2N" - "inv"
            }
            "3H" - "was 2434 19"
        }
        overcall("2m") {
            "X" - "18+"
            "Pass" - "may have 3fit (no supp X's)" {
                "X" - "takeout"
            }
        }
        overcall("2S") {
            "Pass" - "had 3235 15" {
                "3D" - "was 3550 6 HCP NF"
            }
            "X" - "was 1426 17" {
                "3S" - "was 2452 10"
            }
        }
        overcall("2N", "minors") {
            "3H" - "competitive, was 17 bal"
        }
        "1H" - "4+H 14-20/GF, or 23+ NT - forcing" {
            overcall("X") {
                "2m" - "as normal"
            }
            "1S" - "relay: was 3433/2533/24(43)/1525/1444/2524/14(53) 6-9 - probably short S at this pt" {
                "1N" - "was 3433 22, 3343 23" {
                    "2C" - "was 1444 6 (3H = was 3433 22, cues...)"
                    "2N" - "was 8 no 5suit (3N = was 3343 23)"
                }
                "2C" - "was 4423 20" {
                    "3C" - "was 1525 (etc etc)"
                }
                "2H" - "4fit, was 15 4H bal x4, promises minimum (4H to play)"
                "4H" - "to play (esp opp PH)"
            }
            "2C" - "short C:  5+ if sing. or 7+ if doub. (if doub denies S doub, may have D doub)" {
                "2D" - "ask" {
                    "2H" - "5+H" {
                        "2S" - "ask" {
                            "2N" - "3532" {
                                "3C" - "C for H"
                                "3D" - "5D sets D with 23+ BAL"
                                "3H" - "sets H, no C cue"
                                "3S" - "1st rd S cue, H supp, no C cue"
                                "3N" - "to play"
                            }
                        }
                    }
                    "2N" - "was 3442 9"
                    "3C" - "6+D sing C (and 4H)" {
                        "3H" - "sets H"
                    }
                }
                "2H" - "4H, min not turned on, but was 18" {
                    "2S" - "4S F1, 2N = was 23 2fit"
                    "3H" - "was extra trump invite"
                }
                "3C" - "was 4H-5C 19"
            }
            "2D" - "short D:  5+ if sing. or 7+ if doub. (if doub, denies cheaper doub)" {
                "2H" - "15-16 4H, may have 4S (2S = 4S F1)"
                "2S" - "4S, was 4432 18, implies 17+ (cf 2H, 2N)" {
                    "2N" - "was 3424 9, thk promises balanced (4H = to play)"
                    "3S" - "sets S GF"
                }
                "2N" - "was 4324 24" {
                    "3D" - "shows 5+H, was 4513"
                }
            }
            "2H" - "double-negative: 0-4 with sing, 0-6 with doub" {
                "2S" - "was 4432 18/20 (3D = was max with 5D, 3H = was 2443 1 s/o)"
            }
        }
        "1S" - "natural, was 4(31)5 19, 4144 14-21, 4225 16/20, 4126 13/14" {
            "1N" - "semipos NF?"
            "2C" - "signoff attempt"
            "2D" - "4th suit F, was 4432/3442/2434/3433 10, 2632 9" {
                overcall("X") {
                    "XX" - "was 4315 19, think shows 18+ any" {
                        "3N" - "was to play with 3433 10"
                    }
                }
                "2H" - "?"
                "2S" - "was 4135 19 (4S = to play)"
                "2N" - "?"
                "3D" - """was 4144 18, 4225 D stop 20 ("good hand")"""
                "3N" - "max, D stop, was 4144 20 (4C = sets C)"
            }
            "2H" - "signoff, as much as 3622 6"
            "2S" - "was 4531 2"
            "2N" - "inv (was 3451 8)" {
                "3D" - "was 4144 21, promises 4D (4D = was 5fit)"
            }
            "3S" - "inv (was 7/8, 4S-4H)"
            "3N" - "was 2443 9 great stoppers"
            "4S" - "was 4531 9 BPH, 4522 8 BPH"
        }
        "1N" - "15-18(-), denies 4H, may have 4S, not 18 with 3H" {
            "2C" - "invit+ relay, incl. 4/5H-4S (if X, Pass = stopper [XX back on path], bid = no stopper)" {
                "2D" - "17-18" {
                    "2H" - "was 4414 7" {
                        "2S" - "promises 4S (4S = to play)"
                    }
                    "2N" - "GF relay, 3514/44(32)/4531/4522x2/4612" {
                        "3C" - "was 3235 but suit-oriented, 3244 tk denies 4S/3H (3N = was 4522/4432)"
                        "3H" - "3crds (games to play, 3N = 4S-4H NF)"
                        "3S" - "was 4243 (games to play)"
                        "3N" - "was 3235"
                    }
                }
                "2H" - "15-16, 3H, may have 4S" {
                    "2S" - "was 4441 9" {
                        "2N" - "was 3343"
                    }
                    "3N" - "was 4414 10 (implies 4S prob)"
                }
                "2S" - "15-16, 4S, may have 3H (?)"
                "2N" - "15-16, denies 4S or 3H (3C = to play)"
            }
            "2D" - "retransfer (forces 2H)" {
                "2H" - "forced (2N/3H = inv, 3N = c.o.g. mb with 6H bal)"
            }
            "2H" - "4S-4/5H, s/o (Pass = H are better/longer than S, 2S = 3S-2H)"
        }
        "2C" - "14-17, NF, 6+C or 4D-5C" {
            "2D" - "5+H F, was 2542 7, 4531 10, 3541 7" {
                "2H" - "was 3fit min (recently 1fit min) (3N = c.o.g. promised 5H)"
                "2N" - "was 3226 av [3C NF])"
            }
            "2S" - "was 4432 9, 3433 10 (mb shows stop)" {
                "2N" - "was 1345 min"
                "3N" - "was max good C with D stop"
            }
        }
        "2D" - "18+, nat or C 1-suiter, was 3145 24 x 2, 3145 20" {
            "2H/3C" - "0-5, NF signoff attempt (3N to play)"
            "2S" - "6+, GF, art" {
                "2N" - "was 3145 20/24, never really showed 24" {
                    "3C" - "was 6H-3C" {
                        "3D" - "was 3145 20 (3N = was 3613 10 to play)"
                    }
                    "3H" - "was 6crd no m fit"
                }
            }
        }
        "2H" - "18-20 3crd raise, may have 4S" {
            "2S" - "transfer to 2N, incl. 4414 GF, 4H-5+C GF, signoff in 3NT" {
                "2N" - "forced" {
                    "3C" - "5+C or 4414 GF (3N = was 4342 NF and missed 4-4 S fit, 4C = nat)"
                    "3N" - "to play, was 3433"
                }
            }
            "3C" - "6+C GF"
            "3D" - "6+D GF"
            "3H" - "promises 4 spades, was 4-4 x2 (3S = S fit, 3N = to play)"
            "4C" - "splinter or cue"
        }
        "2S" - "was 2227 21" {
            "2N" - "asks" {
                "3C" - "was 2227 21 (3D = was 1651, they messed up)"
            }
        }
        "2N" - "18(+)-20, denies 3H, may have 4S" {
            "3C" - "GF relay" {
                "3D" - "was 3253" {
                    "3S" - "was 4531"
                }
                "3H" - "was 3334 (3N = was 4432 no slam)"
                "3N" - "4S-4C (4234/4144)"
            }
            "3D" - "transfer, 5+H" {
                "3H" - "forced" {
                    "3N" - "choice of games"
                }
            }
        }
        "3C" - "14-17 but lots of tricks, long good C" {
            "3N" - "to play (4C = insists then cues)"
        }
    }
    "1H" - "4+S, 0-10 maybe more if just 4S (was 13 bal in BBowl, 5224 12 in EuroClub08, 4144 13 in '10 Vandy)" {
        overcall("X") {
            "Pass" - "15-16, < 4 S, bal"
            "XX" - "was 4432 18 (later 2S NF)"
            "1S" - "3S (e.g. 3415 15)" {
                "2H (cue)" - "good hand"
            }
            "2S" - "14-17 4fit"
        }
        overcall("2C", "Michaels for reds") {
            "3S" - "was 4144 19"
        }
        overcall("2red") {
            "Pass" - "may have 3 spades (don't play support doubles)" {
                "X" - "was 5152 8 (2S = 3fit)"
                "3C" - "was 6C weak"
            }
            "X" - "18+ no 4fit (3D = general GF asks nat bids)"
            "2H" - "was 2416 17"
        }
        "1S" - "4S 14-20/ GF, 4144 19 or 23+ NT - forcing" {
            "(X) Pass" - "was bal 0 HCP"
            "1N" - "5-9, 6S" {
                "2C" - """R, was 23 bal with 2S, 4315 16, "23+"""" {
                    "2D" - "no short" {
                        "2N" - """23+ bal without 4S "2443"""" {
                            "3S" - "minimum but was setting S (4C = cue for S)"
                        }
                    }
                    "2N" - "9 HCP, was BAL"
                }
            }
            "2C" - "short C:  5+ if sing. or 7+ if doub., OR catchall bal 9-11" {
                "2D" - "was 4S 20 bal twice, was 4243, 4315 21, 4225 19" {
                    "2S" - "invite, 1-2 C"
                    "2N" - "was 4342 6" {
                        "3C" - "was 4225 19, not sure they knew what they were doing"
                    }
                    "3D" - "was 4162, 4252 max (tk cuebidding for S now)"
                }
                "2S" - "was 4423 16 (Qxx C), 4333 17 (Axx C)" {
                    "3D" - "was 4333 9 good fragment (4S = was 4423 16)"
                    "3N" - "c.o.g."
                }
                "4S" - "no slam"
            }
            "2D" - "short D:  5+ if sing. or 7+ if doub." {
                "2H" - "R, was 21+ bal with 3S, 24 with 2S" {
                    "2S" - "was 5314 max" {
                        "2N" - "was 2353 24" {
                            "3C" - "was 5314 max (at this point promises at least 8 HCP)"
                        }
                    }
                    "3C" - "was 4315"
                }
                "2S" - "was 4333 15 (3N = c.o.g.)"
                "4S" - "was 4144 19, 4234 17, 4432 19"
            }
            "2H" - "short H:  5+ if sing. or 7+ if doub." {
                "2S" - "was 4432 15 twice, 4333 16 NF (3S = invit, 3N = c.o.g.)"
                "2N" - "was 4423 16 (3D = was 4D 10)"
                "3D" - "was 4432 19 no C cue, they had mixup and stopped in game with cold grand"
                "3S" - "was 4342 20, hAQx (cues), happened after 3D so maybe not clear agreements here"
                "4S" - "was 19 bal"
            }
            "2S" - "double-negative: 0-4 with sing, 0-6 with doub" {
                "2N" - "GF relay"
                "3S" - "was 5233 4"
                "3S" - "was 4333 19, 4225 20 (3N = was 4333, played; 4S = to play)"
                "3N" - "to play (esp. opposite PH, < 3 S)"
            }
            "3C" - "was 5530 4 but other thought showed 5440 so off the rails"
        }
        "1N" - "15-18(-), denies 4S, could be 1444, not 18 with 3S" {
            "(2C) 2H" - "5+S as normal"
            "2C" - "invit relay, even with 4S or 5S-4H" {
                "2D" - "17-18, could have 3S or 4H" {
                    "2H" - "was 5S-4H 7 (2S = was 3S-3H promises 3S)"
                    "2N" - "was 5431 6 [3N = had 2S-3H]"
                    "3N" - "to play, no M interest"
                }
                "2H" - "15-16, 4H, may have 3S" {
                    "2S" - "NF 5S"
                    "2N" - "NF 4S"
                    "3S" - "GF, was 5S-5C"
                    "3N" - "to play, was 4153 and pd corrected to 4S with AKx ATxx xx Axxx"
                }
                "2S" - "15-16, 3S, denies 4H"
                "2N" - "15-16, denies 4H or 3S"
            }
            "2D" - """"transfer to 2S", was 6S-4H 8 - cf 2C-2D-2H above""" {
                "2S" - "was 3S-3H (3H = was 6S-4H 8 [4S = was 3S-3H 17])"
            }
            "2H" - "5+S, any strength (cf 2D, maybe changed?), puppet" {
                "(X) Pass" - "was Ax AJxx ATx KTxx alerted (XX was 5134 10, prob retrans - pd bid 2S with Ax)"
                "2S" - "forced" {
                    "Pass" - "s/o"
                    "2N" - "was 8 probably really balanced since pd bid 3NT with 3334"
                    "3C" - "invit with 5S-4+C, was 5044 7, 5304 8 (3S = was 3S min NF, 4S = was 3442 max)"
                    "3D" - "5S-4D GF (? cf 3C)"
                    "4S/3N" - "to play/c.o.g."
                }
            }
        }
        "2C" - "14-17, could have 4red-5C and/or 3S" {
            "(X) XX" - "cards"
            "2D" - "** new ** transfer to S, may have 4H" {
                "2H" - "probably 4H"
                "2S" - "had stiff Q without 4H" {
                    "2N" - "inv (3C = to play)"
                }
            }
            "2H" - "had 5S-4H 6x2" {
                "2S" - "to play, was 2362 min, 3145 15" {
                    "3C" - "NF"
                }
            }
            "2S" - "s/o, but recently was an invite NT bid with just 4S (2N = inv)"
            "2N" - "invit, had 4S"
            "3C" - "pree"
        }
        "2D" - "Gazzilli, 18+ C/C-D, F" {
            "2H" - "GF relay, 6+" {
                "2S" - "3S"
                "2N" - "H stopper, 5+C-4D, denies 3S"
                "3C" - "21-23 1-suiter"
                "3D" - "6+C-4D"
                "3S" - "was 3145 21 (4S = to play)"
                "3N" - "was 1345 23 with H stoppers"
            }
            "3N" - "was 5431 8 HCP (UPH), great H stoppers, I'm guessing forgot since pd had 3S and passed"
        }
        "2H" - "was 2326 good 20, 1435 22" {
            "2S" - "was 5323 4" {
                "2N" - "was 2326 good 20" {
                    "3S" - "was 5323 4, they got to a 5-2 spade game when 3N cold"
                }
            }
            "3C" - "was signoff attempt"
        }
        "2S" - "18-20 3crd raise, was 3226/3433" {
            "2N" - "relay, was 5242 8" {
                "3C" - "was 3433 18 with xxx C"
            }
            "3S" - "transfer to 3NT, just 4crd S"
            "4H" - "5-5 c.o.g."
        }
        "2N" - "18(+)-20 bal or 1444, denies 4S (denies 3S now?)" {
            "3C" - "was 5125" {
                "3H" - "was 2434 (3N = was 5125)"
            }
            "3D" - "was 5431 GF" {
                "3H" - "was 2443 (3N = was 5431 and pd passed with 4H in bad contract, mistake)"
            }
            "3H" - "5+S, any strength (3S = accepts even with 1 crd [3N c.o.g.])"
            "3S" - "4S-5+m, sing. H (3N = to play)"
        }
        "3C" - "18-20 1-suiter?"
    }
    "1S" - "no M, 0-11 (or 5440), may be stronger if doesn't want to declare NT (later X = 7+ general)" {
        overcall("X", "can bid normal 1N/2N if have S stopper")
        overcall("1N", "natural") {
            "Pass" - "general (re's X = cards)"
        }
        overcall("1N", "majors") {
            "X" - "was good 18 bal"
            "2D" - "was nat min"
        }
        overcall("2D") {
            "2N" - "was 19 BAL"
        }
        overcall("2H") {
            "X" - "18+" { "3C" - "was 5C 4 HCP" }
            "Pass" - "was 4135 14, 3235 18" {
                "X" - "7+ even at 3-level"
            }
            "2S" - "was 4117 15"
        }
        overcall("2S") {
            "Pass" - "was 2344 16 (partner's X was 3055 4 [2N = no 5m])"
        }
        "1N" - "15-18(-), may be 4414" {
            "2C" - "to play, 5+C"
            "2D" - "to play, 5+D"
            "2H" - "7-11, no H stopper" {
                "2S" - "H val not S" {
                    "2N" - "min w/ S stop"
                }
                "3C" - "to play" {
                    "3D" - "NF"
                }
            }
            "2S" - "7-11, no S stopper (2N = s/o attempt)"
            "2N" - "invit."
            "3D" - "invit. 6crds"
            "3H" - "GF, sing. H, 5-4 minors"
            "3S" - "GF, sing. S, 5-4 minors"
        }
        "2C" - "5C-4other unbal, or 6+C, 15-17 (once xx xxx KQJx AKQx)" {
            "(2S) X" - "cards, even with fit and short S"
            "2H" - "no stop H (poss no S stop too), invit+" {
                "2N" - "was majors stopped 16"
                "3C" - "to play"
            }
            "2S" - "H stop, no S stop, invit+ (they forgot 2nd time)" {
                "3C" - "s/o no S stop mb 5crds"
                "3D" - "nat no S stop"
            }
            "2N" - "invit"
            "3N" - "tip top, prob C help, major stoppers"
        }
        "2D" - "4+C-4+D, was 4144 17/20, NF" {
            "2S" - "was 2362 10 (3S = was 4144 no alert [4D = sets D])"
            "3C" - "was 2335 3 (3S = was 4144 20)"
        }
        "2H" - "23+ HCP NT or 6+C-0/2 D 18-20, or 21+ with C" {
            "2S" - "relay, any strength" {
                "2N" - "23-24(-) bal" {
                    "3D" - "was 3352 7" {
                        "3H" - "had D fit, no S stop (4N = quant)"
                    }
                    "3H" - "was 3154 7 (3N = to play)"
                }
                "3N" - "24(+)-26 bal, may have 4M (4N = 4-4 minors quant.), but was 23 3253 once" {
                    "4C" - "was 2245 (4D = was 3253)"
                }
            }
        }
        "2S" - "was 2245 18" {
            "2N" - "was 3253 max" {
                "3D" - "was 2245 18 (4D = sets D)"
            }
        }
        "2N" - "18(+)-20" {
            "3H" - """"short H", was 3163 8"""
            "3S" - "short S (may have 6 card minor)"
            "4D" - "slamtry D, necessarily mild (was 2362 9), cues for D"
            "4S" - "was 2272 SOL diamonds (over X, XX = 1st rd)"
        }
        "3H" - "was 2416 3 losers (5C to play)"
        "3N" - "was 3532 9 tricks"
    }
    "1N" - "10+, any 4432/4333/5m332, GF, perhaps optional to respond 1red or 1NT if positional considerations" {
        overcall("2H") {
            "Pass" - "was 4324 15" {
                "X" - "was 4342 12, passed"
            }
        }
        "(2S) Pass" - "had xxx S min"
        "2C" - "balanced/4441, or 17+ 1-suiter (3226 20 once, 4135 16 recently)" {
            "2D" - "13+" {
                "2H" - "15-17, 4H" {
                    "2S" - "4S (3S = sets S)"
                    "3C" - "was 3235 13 [3H = was cue mild C fit]"
                    "3H" - "sets H"
                }
                "2S" - "15-17, 4S, denies 4H (3S = flag, 3N = min, to play)"
                "2N" - "18+ any shape, (3C = Baron, 3H = 5C [3S ok with cue])"
                "3C" - "no 4M, was 3325 17 x2, limited to 17 (cf 2N) (3N = to play mb 14)"
                "3H" - "was 2344 15-17 (4C = sets C)"
                "3S" - "was 3244 17"
                "3N" - "33(34) 15-17 (4C = 4+C asks fit [4D = yes and cue])"
            }
            "2H" - "10-12, 4H" {
                "2S" - "was 4333, 4144 18, 4234 17" {
                    "2N" - "was 3433/2443 10 (3D = was 4144 18, 3N = to play)"
                    "3D" - "was 2452"
                }
                "3C" - "was 3226 20 (3N = was 3442 12 [4C sets C for cues or mb Q Turbo (only C poss)])"
                "3H" - "was 3433 16, promises H"
                "3N" - "to play, denies 4S"
            }
            "2S" - "10-12, 4S was 4333"
            "2N" - "10-12, denies a major, was 2335"
            "3C" - "10-12 5C" {
                "3D" - "was nat not sure why bid as had minimum with great M stops"
                "3N" - "to play"
            }
            "3H" - "was 2344 12, denies a major"
            "3N" - "33(43) 10-12"
        }
        "2H" - """"14-17", was 2425 minimum x3, 2416 18""" {
            "2S" - "relay, was 4324, maybe shows C fit (see below)" {
                "3C" - "was 2425 minimum" {
                    "3D" - "?" {
                        "3H" - "was 2425 minimum"
                    }
                }
            }
            "2N" - "relay, was was 3343/4333 13" {
                "3S" - "was 2416 18 (4C sets C)"
                "3N" - "was 2425 minimum"
            }
            "3H" - "sets H, was 4432"
        }
        "2S" - "was 4S any strength, 5+C ?" {
            "2N" - "relay" {
                "3C" - "was 4(xx)5 17, 4126 15" {
                    "3D" - """cue with C fit "ask"""" {
                        "3H" - "was 4126 15"
                        "3S" - "was 4135 17"
                    }
                }
                "3D" - "was 4342 minimum"
                "3N" - "was 4225 minimum"
            }
            "3C" - "was 2353" {
                "3D" - "was 4225 18"
            }
        }
        "2N" - "14-16, 5C-4D"
        "3C" - "14-16, 6+C 1-suiter" {
            "bid stoppers" - ""
            "3N" - "to play"
            "4C" - "was huge 4432 no cQ"
        }
        "3D" - "6C-4D 17-20 (4C = fit)"
    }
    "2C" - "GF 5+D" {
        "2H" - "was 4414 17" {
            "3D" - "was 3172 13"
        }
    }
    "2D" - "GF 5+H" {
        "2H" - "was 2353 15" {
            "2N" - "was 2533 slammish with S cue, so this is shape or relay" {
                "3H" - "was 2353 15 with C cue so this is relay response or setting H"
            }
        }
        "3C" - "was 2128 min (4C = C flag)"
    }
    "2H" - "GF 5+S" {
        "2S" - "was 3244/2335" {
            "3D" - "was 5242 14, 5143 11, promises D" {
                "3S" - "was 3244 17 promises 3S (4C = knew about S fit max, so cue)"
            }
        }
        "3C" - "was 2336 18" {
            "3H" - "was 5422"
        }
    }
    "2S" - "5+C GF" {
        "2N" - "R" {
            "3C" - "was 3226 13, promises extras (4C = sets C)"
        }
    }
    "2N" - "GF 5M-332" {
        "3C" - "asks which" {
            "3D" - "5H, 10-12"
            "3H" - "5S, 10-12" {
                "3S" - "was 3325, 3244" {
                    "3N" - "was 3532 (4S = quant to 4N? think they had a mixup)"
                }
                "3N" - "to play"
            }
            "3S" - "5H, 13-15 (4C = H flag/cue)"
            "3N" - "5S, 13-15 (4C = S flag/cue)"
            "4C" - "5H, 15+"
            "4D" - "5S, 15+ (4S = to play)"
        }
    }
    "3C" - "GF 5C-5other 10-14" {
        "3D" - "asks which" {
            "3S" - "S was min (4C = sets C, 4D = cue for S)"
            "3N" - "D"
        }
    }
    "3D" - "5H-5S 10-14" {
        "3M" - "fit (cues)"
        "3N" - "to play (4M = freak with longer M, to play)"
        "4C" - "nat, no fit (4N = s/o)"
    }
    "3H" - "GF 5S-5D 10-14 (3S = S flag [3N = was min 5251], 4C = nat no fit for pd)"
    "3S" - "GF 5H-5D 10-14"
    overcall("X") {
        "Pass" - "was 4234 bust, 3(42)4 6, 2353 4, 2326 4, 4432 2, 2335 (force not set up at any level)" {
            "(1S) 1N" - "was good 18 bal"
        }
        "XX" - "6+, may have 5S or 5D bal, activates inverted doubles" {
            overcall("1y") {
                "Pass" - "neutral BAL (re's 2z NF)"
                "3C" - "minmum but extra tricks"
            }
        }
        "1D" - "4+H, 0-9 (1S = 5+C-4S [2C = signoff attempt]), no retransfers"
        "1H" - "4+S, 5-9 (1S = 4crds), no retransfers"
        "1S" - "5+C , 6-9, denies 4M (but was 0454 8 recently)"
    }
    overcall("1D") {
        "Pass" - "0-5" {
            "later X" opener "takeout or 18+" {
                "cue" - "GF"
            }
            "balancing 1N" - "just 15-18"
            "free 1N/2N" - "19-20"
            "free 1S" - "unbal C-S"
        }
        "X" - "6+ HCP, 0 or 1 majors" {
            "(1H) 1S" - "nat 14-17 mb bal"
            overcall("1S") {
                "Pass" - "may have perfectly normal 1N rebidx2, so maybe 1N implies more?" {
                    "reopening X" responder "cards/takeout"
                }
                "2N" - "was 19 no 4M" {
                    "3C" - "nat NF no major"
                }
            }
            overcall("2D", "opener does not bid a major with an average hand (X by re: = bid something)")
            overcall("3D") {
                "X" - "was extras takeout"
                "4S" - "was 5116"
            }
            "1H" - "was nat 15-18 even 4414" {
                "1S" - "was 4234 8" { "1N" - "was 3433 16 NF" }
                "2D" - "was 9 no M" { "2S" - "other 4suit" }
            }
        }
        "1H" - "5+S, may be 6S-4red" {
            "(X) Pass" - "was 2335 17 no H stop (later 4D cue by Re xfers to 4S)"
            "(2D) 2S" - "was 4fit (later X by opener was takeout)"
            "1S" - "was 3433 17 (shows 3fit) (2H = general GF)"
            "2C" - "was 1228/2416 min [2D = was nat GF, 2S was s/o]"
            "2D" - "general great hand, was 3fit 19 (2S = was 5S 6 HCP [4S = signoff])"
            "2S" - "4fit"
        }
        "1S" - "5+H, normal resp strength, F1" {
            "2C" - "nat"
            "2H" - "was 15 3fit"
            "2N" - "18[+]-20 (3S nat), later retransfer to H possible"
        }
        "2C" - "5+C, F1, was ATxx Jxx x AJTxx"
        "2D" - "both majors, 4+ 4+, competitive or better (2M = 3+crds s/o)"
    }
    overcall("1D", "ART") {
        "2D" - "nat F"
    }
    overcall("1H") {
        "Pass" responder "0-5" {
            "later X by opener" - "takeout or 18+"
            addBid(responder, "later X by responder", "takeout 3-5")
            "balancing 1N" - "just 15-18 [either 5m ok)"
            "free 1N" - "19-20"
            "jump" - "distr min"
        }
        "X" - "4-5S, does not set a forcing pass" {
            "(XX) 1S" - "normal"
            overcall("2H") {
                "Pass" - {
                    "X" - "cards (2S = 3 spades [3C = F with 4S -5+C])"
                }
                "X" - "was 3145 min, tk shows 3S"
                "3H" - "was GF 4fit"
                "4S" - "was 4117 min, no support X/XX"
            }
            overcall("3H") {
                "3S" - "was 3136 13 (pd may have known but bid Moysian anyways)"
                "4H" - "was 4036 16 (5D = was cue for spades)"
            }
            "1S" - "3crds NF"
            "1N" - "15-18[-] 1-2S, or bad 3S with H stopper (2N invit)"
            "2S" - "4crds NF (3D HSGT)"
            "3D" - "was 1246 17"
        }
        "1S" - "denies 4+S, could have H stopper, promises enough for game opposite 18" {
            "(2H) X" - "takeout"
            "1N" - "15-17 NF" {
                "2D" - "weak"
            }
            "2C" - "could be good 4 if no H stopper (3C NF)"
            "2H" - "general GF, even with H stop, had 3433 24 (3C = was 5C no H stop)"
            "2N" - "was 4333 18"
            "3N" - "was 20"
        }
        "1N" - "was 3442 7 with good H stops"
        "2C" - "5+C, F1 (2S = was 4144)" {
            "later X" - "takeout"
        }
        "2D" - "5+D, F1 (2N = was 15 with D and stops, 3C = was 6C min)"
        "2H" - """6+S, can be weak, (BPH must be weak) "+ cue bid H" - had void""" {
            "(3H) 3S" - "was 3244 17, 4N = Turbo for S"
            "2S" - "was 2fit"
            "3S" - "was 3fit 19"
            "4S" - "was 3415 16"
        }
        "2S" - "GF bal, half or full H stopper (2N = had stopper twice)"
    }
    overcall("1S") {
        "Pass" responder "0-5" {
            "later X by opener" - "takeout or 18+ [2N by re scramble]"
            addBid(responder, "later X by responder", "takeout 4-6")
            "1N" - "just 15-18 [either 5m ok]"
            "free 1N" - "19-20"
        }
        "X" - "4 or 5 H, 6+ HCP, possibly 6H 4-7 HCP, 3541/2551 8 (no supp X)" {
            explanation = "but recently was 3163 6, not strong enough for 2D"
            overcall("2S") {
                "2N" - "2335 18" {
                    "3H" - "was 2542"
                }
                "3C" - "min NF"
                "3H" - "min NF"
                "4H" - "was 17 bal"
                addBid(responder, "later X by responder", "takeoutish")
            }
            "1N" - "nat, had 3H (2D = was 6D 6 without 4H [2N = was 17 with 3H])"
            "2C" - "nat, may have 4D-5C, min (2D = was 5-5 reds s/o, 2S = was 4531 8 no stop)"
            "2H" - "was 4414 16"
            "2S" - "general GF, better than 20 if BAL (3C = nat)"
            "2N" - "18+-20"
            "3C" - "was nat 19 (3S = had 5H)"
            "3H" - "18+-20, fit"
        }
        "1N" - "nat"
        "2C" - "5+C, F1"
        "2D" - "5+D, F1, mb as weak as 7" {
            "(2S) 3D" - "was strong NT 15-17 NF"
            "2H" - "nat (2S = general GF)"
            "2N" - "had D fitx2 but S stoppers, 15-17"
            "3D" - "was 4fit 17 still NF"
        }
        "2H" - "was 6H 8-10 HCP, forcing, 5H-4C 9 (7-10 HCP has X'd instead, hmm)" {
            "3C" - "was min sol suit"
            "3H" - "was 17 4fit, 14 3fit, think GF since 3N is now nonserious"
        }
        "2S" - "tk invit+ NT: was 4342 9 with good S stops, 3343 10 with stop, 3244 11 no stop, 3343 9/10 no stop, 4324 9 stop" {
            "2N" - "was 15/16 bal with stop"
            "3N" - "was 3433 17 with stops, 3352 17 no stops, 3424 18 with stop"
        }
    }
    overcall("1N", "strong") {
        "X" - "7+, but does not set up forcing passes"
        "2C" - "majors (forgotten by Nunes of course)"
        "2D" - "one major (forgotten by Nunes of course)"
    }
    overcall("1N", "art") {
        "X" - "7+, was 3613 9"
    }
    overcall("2C", "majors") {
        "X" - "was 3442 7 (does not set up a force, op must cue to do so)"
        "2H" - "limit+ C raise"
        "3C" - "was 7crd 4 HCP"
    }
    overcall("2C", "natural") {
        addBid(opener, "Pass (Pass) 2D", "natural 5D-(332) 15-18 NF")
        "X" - "neg"
    }
    overcall("2D", "natural") {
        "X" - "was 5521 1 so prob negative" {
            "(3D) X" - "cards"
        }
    }
    overcall("2D", "majors") {
        "X" - "cards, was 1354 8, 3343 8"
        "2S" - "was 1354 7 (2N = nat, 3C = NF)"
        "3C" - "was 6C 8 HCP"
    }
    overcall("2D", "multi for a major") {
        "X" - "was 5323 10, 3433 9" {
            "(3H [p/c]) 4D" - "was 1345 20"
        }
    }
    overcall("2H") {
        addBid(opener, "Pass-(Pass)-reopening 2S", "was 4405 21")
        "X" - "neg (does not set up force, so 2N NF, 3N = was 19-20), had weak 5S once"
        "2S" - "F (3D = was 4D-6C GF)"
        "3D" - "F was lite (later 4N= pick a minor)"
        "3H" - "6+S GF, was 6124 9 (3S sets S)"
    }
    overcall("2S") {
        "Pass" - {
            "2N" - "18-20 (3C = Stayman)"
        }
        "X" - "negative, says nothing about H, sets forcing pass (later X's takeout)" {
            "3C" - "was min (pd bid 3D with 2452 7?)"
            "3H" - "minimum NF (3N = to play, had C fit)"
        }
        "3H" - "was 2722 12, 2632 10 (3S = punt [4S = was autocue long H])"
        "4C" - "long hearts, was weak"
    }
    overcall("3C", "nat") {
        "3D" - "nat, GF"
    }
    overcall("3D") {
        "X" - "neg, says nothing about majors (4D = pick a M)"
        "3H" - "5+S, F1 (pd thought 6S and jumped to 4S with doubleton, 4C = nat)"
        "3S" - "5+H GF (4D = H flag)"
        "4D" - "5-5 majors"
    }
    overcall("3S") {
        "X" - "neg (was 3433 10, 3523 8)" {
            "4S" - "intended pick a suit, was 1345 18"
        }
        "4H" - "was 2632 6, alerted"
    }
    overcall("4S") {
        "X" - "was neg 7 HCP"
    }

    addPassHandAdjRow()
    "1N" - "10-11, same 2C relay"
    "2/1" - "invitational"
    "2H" - "normal"
    "3S" - "5H-5D GF"
}
