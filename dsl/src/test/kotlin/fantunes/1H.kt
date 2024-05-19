package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.oneHeart() {
    "1S" - "4+S, 0-9" {
        overcall("2C") {
            "2S" - "was 4531 13"
            "3C" - "good fit was 4522 18, 4630 16"
        }
        overcall("2D") {
            "X" - "supp"
            "3D" - "huge S raise (3S = superneg, 3N = eh, 4y = good)"
        }
        "1N" - "15-17 balanced" {
            "2D" - "to play"
            "2S" - "to play"
        }
        "2C" - "Gazzilli - 14-17 natural, or any 18+" {
            "2D" - "6-9 relay" {
                "2H" - "5+H-4+C 14-17" {
                    "2S/games" - "s/o"
                    "2N" - "invit (3C = 5-5 to play)"
                }
                "2S" - "18+, 3S" {
                    "2N" - "relay" {
                        "3C" - "was 3514"
                        "3H" - "was 3631 (4H to play)"
                    }
                    "3H" - "sets H, was 5341 9 (4H to play)"
                    "3S" - "sets S"
                }
                "3C" - "18+ nat, denies 3S, was 1624 20 (3N = to play but had 2H)"
                "3D" - "was 2542 18, 1543 18x2/20x2 (3H = had 3H, 3N = to play but had 2Hx2, 4D)"
                "3H" - "was 1732 21, 2713 18, good H" {
                    "4m" - "cue with at least doubleton H was 9 HCP"
                    "4H" - "s/o attempt"
                }
            }
            "2H" - "0-5, 2-3H (2N = art, 22+ force [3H = double neg])"
            "2S" - "0-5, was 5143 5 (3H = NF was 18 good 7H)"
        }
        "2D" - "5+H-4+D, max 17, preferred with 0544" {
            "2H" - "s/o attempt, may be 7 with doub"
            "2N" - "invite"
            "3C" - "4SF (3N = was 0544 14)"
            "3D" - "invite"
            "3H" - "invite"
            "3S" - "invite"
        }
        "2H" - "6+H, max 17" {
            "2S" - "was 6142 6, to play"
        }
        "2S" - "raise, was 4crds 11/13 HCP" {
            "(3C) X" - "was bal 10 (3H = was 4612 13)"
            "2N" - "R (3m = sing, 3H = 6H-4S, 3S = 4522 min, 3N = 4522 max)"
            "3NS" - "trial"
            "3S" - "general invite"
        }
        "2N" - "18+, 5-5 or 6+-4" {
            "3C" - "relay, was 5 HCP" {
                "3D" - "was 2650 16 (4C = cue for D with just 3D so 3D 5-5?)"
            }
        }
        "3m" - "5H-5m, good 16-17, more based on tricks (3N = to play)"
        "3H" - "16-18 value based on good H"
        "3S" - "16-18 value based on distribution"
        "4N" - "RKC S!"
    }
    "1N" - "no 4M, 0-9, NF" {
        "(X) 2D" - "was 2641 15 (3C to play)"
        "(2C) X" - "was 4531 19, prob just 18+;  re's X = cards"
        "(2D) X" - "was 4504 21, prob just 18+"
        "(2S) 3C" - "was 2524 17"
        "Pass" - "was 4531 16"
        "2C" - "Gazzilli - 14-17 natural (4513 ok), or any 18+" {
            "2D" - "6-9 relay" {
                "2H" - "H-C or 4513, 14-17"
                "2S" - "3/4S, 18+" {
                    "2N" - "R may have a 5m" {
                        "3S" - "4crd S was 4522 (3N = to play)"
                        "3N" - "was 3523 min"
                    }
                    "3D" - "nat (3H = was 4S-6H with C stop)"
                }
            }
            "2H" - "0-5, 2-3H"
            "2N" - "0-5, 5-5 minors"
        }
        "2D" - "14-17" {
            "2S" - "inv. with 4+D (3D = to play)"
            "3C" - "was 3145 7 (3D = to play)"
            "4D" - "freak invite"
        }
        "2H" - "14-17 (4H = was sharp 9 with Kx H)"
        "2S" - "?"
        "2N" - "18+, 5-5 or 6+-4" {
            "3C" - "relay, was 3244 8" {
                "3D" - "was 2551 good 18 (4C = cue for D was 3244 8)"
            }
        }
        "3m" - "5H-5m, good 16-17, more based on tricks"
    }
    "2C" - "10+ HCP, balanced OR clubs OR H raise (mb 3154)" {
        overcall("X", "clubs") {
            "Pass" - "was 1534 min"
            "2D" - "was normal showing spades but no C stop"
        }
        overcall("2S") {
            "Pass" - "could have AJx minimum" {
                "reopening X" responder
                        "was 3145 with xxx = not sure how they penalize or if this is inverted doubles"
            }
        }
        "(3D) 3H" - "was 6H"
        "2D" - "4+S, 11+ HCP, not yet GF (may be 5-6)" {
            "2H" - "was 3343 10, 2245 10, 3226 10, 3235 11 (NF probably opp 11-13)" {
                "2N" - "was 4522 19 GF"
                "3C" - "was 4513 15/18 (3N = to play, 4C = was 2245 10 [promises 5+C, had no D stop])"
                "3D" - "was 4540 14"
            }
            "2S" - "NF, was 3154 10, 3145 11 (3D = was made up 4522 no C stop)"
            "2N" - "GF relay, was 3424 12, 2344 18, 4234 15, 2335, 3244 11" {
                "3C" - "was 15+ 4504/4513 (promised club fragment at least)" {
                    "3D" - "relay" {
                        "3S" - "was 15+ 4504/4513 promised C length (3N to play, 4C cue for H)"
                    }
                    "3N" - "to play was 3244"
                }
                "3D" - "45(31) minimum, 12-14" {
                    "3H" - "relay? (3N = was 4513 14, then cues for H)"
                    "games" - "to play"
                }
            }
            "3H" - "(over X) = was 2533"
            "4H" - "was 2425 11"
            "4S" - "bal, minimum, to play (C not natural)"
        }
        "2H" - "14+, 1-suiter or H-C (14-17? cf 3C), GF" {
            "2S" - "?"
            "2N" - "relay" {
                "3C" - "4+C, was 1624 14, 1534 15x2, 2524 14" {
                    "3D" - "R asks short" {
                        "3H" - """was 2524 14 but recently "short D" 3514""" {
                            "3N" - "to play"
                            "4D" - "ART slamtry H had other cues so think only flag"
                        }
                    }
                    "3H" - "sets H, had 4C bal, cues...)"
                }
                "3D" - "was 2533/2523/1633/3613 14/16, so must promise 3 clubs (cf 3H/3S/3N)" {
                    "(X) Pass" - "had 4D, probably just inquiring (3H = had 6H - then cues for H)"
                    "3H" - "asks (3S = cue with 6H?, 3N = was 2533)"
                }
                "3H" - "6+H, 0-2C, minimum (or 1723) - now cues for H (4H = was doubleton H)"
                "3S" - "was 2623 18, prob 6H-3C extras (4H = to play)"
                "3N" - "shows 3532 (4H = s/o)"
            }
            "3C" - "was 2245 10" {
                "3H" - "was 3712"
            }
            "3D" - "was 2245"
            "3H" - """"forcing", was 1336x2, 4342 10, 4423 11, 4414 11/13, 1444 13 (cues, and minimum 3N)"""
            "3N" - "was 4144 min"
            "4H" - "no slam, e.g. bal 10 3fit"
        }
        "2S" - "14+, 4+D, GF, denies 4S" {
            "2N" - "R, was 3442 10, 4333 10, 4234 10/13, 4225, 1147" {
                "3C" - "was 3541 17, probably shows any extras" {
                    "3D" - "R (was 3442 10 pd must still be unlimited)" {
                        "3H" - "was 3541 17, not a cue (pd bid 4H with 3442 10)"
                    }
                }
                "3D" - "was 3541 13/14" {
                    "3H" - "was 4234 10 (3S = alerted was 3541)"
                    "4D" - "sets D"
                }
                "3H" - "was 1660 alerted, they f'd it up;"
                "3S" - "was 1552 min"
                "3N" - "was 2542 min (4H = to play)"
            }
            "3D" - "nat (3S = 4th suit)"
            "3H" - "nat, was 3316 13"
        }
        "2N" - "any 18+ 5332, GF *but recently was 2524 15 but that was a mistake*" {
            "3D" - "was 3154 promises C fit"
            "3H" - "sets H"
        }
        "3C" - "was 3514/2524 18 (3H = was 4333 11 sets H ... cues, 3N = was 11 to play)"
        "3H" - "was 3631 23 solid suit, 1732 14 great suit (cues for H, 4D had 13 4fit )"
    }
    "2D" - "10+ HCP, 5+D or 4D-5H" {
        "(3C) 3D" - "was 4531 11"
        "2H" - "GF, was 26(32)/1534/3613x2/3523 min, 3622 21" {
            "2S" - "4S, was 4252/4162" {
                "3D" - "was 2632 (3H = had doub)"
            }
            "2N" - "relay, was 2254, 4252 10 - cf 3C, promises 2+H?" {
                "3C" - "was 1534 min" {
                    "3D" - "relay" {
                        "3S" - "was 1534"
                    }
                }
                "3H" - "was 3613 min (3N to play)"
                "3N" - "was 3523 min"
            }
            "3C" - "was 3154/2164" {
                "3D" - "was 3622"
                "3H" - "was 2623 17! (4H = was to play with sing and no S stop)"
            }
            "3D" - "was 3073 (3N = was 3613 to play)"
            "3H" - "was 3451 14 (cues, incl. the 3N minimum cue)"
        }
        "2S" - "4S, any strength" {
            "2N" - "relay, incl. 5D-5C 10, S fit" {
                "3D" - "45(31) or 45(40) 11-15" {
                    "3H" - "R (3S = short C, 3N = short D)"
                }
                "3H" - "was 4612, 4603 11 (3S = flag, 4C = cue for H)"
                "3S" - "was 4513 18 (3N = to play)"
            }
            "3C" - "4th suit forcing, was 3163 no C stop (descriptive cont's)"
            "3H" - "sets H, says nothing about relative D-H length, cues (incl. 3N = minimum)"
            "3S" - "sets S, was 4270 NS3NT/cues"
            "4H" - "min, was bal"
        }
        "2N" - "18+ bal, 5+H" {
            "3C" - "R" {
                "3D" - "3crd D" {
                    "3H" - "strength/length relay (3S/3N/4C/4D = 18-19 5H/20+ 5H/6H same/6H same)"
                }
            }
        }
        "3H" - "was 7 SOL 13 (3S = cue for H)"
    }
    "2H" - "2(+)-7(-) raise" {
        "2S" - "relay, was 4522 18 x2, 4504 16 (3C = was 3343 5, 3H = was 3fit min NF, 3N = max 3(433))"
        "2N" - "some sort of invite, was 2542 19" {
            "4H" - "was 4423 4"
        }
        "3C" - "long suit game try (1525 17)"
        "3S" - "was 0535 slammish, promises short S (cues)"
    }
    "2S" - "10+, 5+S, GF" {
        "(3C) 3S" - "was fit min"
        "2N" - "relay, was 2533/2542/4531" {
            "3D" - "was 6133/6124 14, 7312 11/5233" {
                "3H" - "had 3S with H cue, cues"
                "3S" - "had xx S but good controls, or recently 3fit"
                "3N" - "was 2533 17 then cues for S"
            }
            "3H" - "4C, 10-12 (3N = may have 2S [cue = 6-4 12])"
            "3S" - "was 6313 9, promises minimum"
        }
        "3C" - "was 2524/1615" {
            "3D" - "was 5242/5233 min (4th suit?)" {
                "3H" - "promises 6H, was 1616 (4H = to play was doubleton 11)"
                "3N" - "was 2524"
            }
        }
        "3D" - "was 1552 18, 2641, 2641 14, 2542 16/19" {
            "3H" - "H fit, cues..."
            "3S" - "was 7015 great S, huge hand, 6142 11" {
                "4C" - "ART sets S, was 2542 16 (cues)"
                "4S" - "stiff S, to play (cues)"
            }
            "3N" - "even had 6S but good club stops, may have 2H or 4D"
        }
        "3H" - "was 1633x2, promises 6+H"
        "3S" - "3-4crd, not 5332 I think, incl. 4513 18, 35(41) 16, 4531 11 (11 would cooperate) - possibly denies 3S-6H since recently that bid 2N" {
            "3N" - "minimum, artif., cues or s/o"
            "4m" - "max, cue"
        }
        "3N" - "was 2533 15 probably an NFU" {
            "4C" - "was 5134 15, blundered way into a lucky 6S on 5-2 making"
        }
    }
    "2N" - "5-9 4crd raise, 7-9 3crd, or 8-11 with sing., may have 5+S" {
        overcall("X", "ignore")
        overcall("3C") {
            "X" - "was 3523 18 (4C = was 4441 8)"
            "4H" - "distrib. minimum, was 1552 13, sets Forcing Pass"
        }
        "(3D)" - "alerted, was 4522 12"
        "3C" - "asks which, tk 17+" {
            "3D" - "7-9, 3crd (cues)"
            "3S" - "was 7-9 4fit (cues)"
        }
        "3D" - "14-16 invite, was 4522 14 twice / 2524 15 / 3523 15 / 4621 14 / 2542 15" {
            "3H" - "declines invite"
            "3S" - "was 6511"
        }
        "3H" - "was 11-13 with 4S (mb 12-13 with 5H-4S)"
        "3S" - "?"
        "3N" - "was 3523 17 (4H = was 4crd unbal)"
        "4H" - "was 2524/4513/1543 16, 0526 11"
    }
    "3C" - "5-5 10-16 with spades (which minor?) - was 5125" {
        "3S" - "sets S, was 4513 (cues)"
    }
    "3D" - "5-5 10-16 (which suits?)"
    "3H" - ("v. weak, distributional (4 unbal or 5 bal, e.g.), " +
            "but recently was 3433 8 Vul and pd accepted with 16 so maybe constr?")
    "3N" - "was 3460 9"
    "4C" - "2-3 ctrls, void in D, raise"

    overcall("X") {
        "XX" - "6+ may be 6223/3154 GF, 2263 7" {
            "(1S) Pass" - "was 4612 14 (2D = was 6D 7 [2H = was 4612 14 NV])"
            "4H" - "minimal"
        }
        "1S" - "?, maybe not strong"
        "1N" - "no longer necessary with weak hand, can Pass with 3 HCP"
        "2C" - "to play"
        "2D" - "?? (passed with good 6crd D suit and 5 HCP recently) (XX'd with 6D 7 HCP recently)"
        "2H" - "wk raise, not hopeless"
        "2N" - "was 3415 6, 1534 7, 4432 9 some sort of lim raise (3C = asks [3S = was 4fit 9])"
        "3H" - "was v. weak 3541/1453, vul-dependent but still weak"
        "4H" - "was KQxxx bal w/ side jack"
    }
    overcall("1S") {
        "X" - "was 3343 10 (1N = was 4513 16)"
        "2C" - "was 6+ good C but 8 HCP (F1 but not GF)" {
            "2H" - "was min 6H (3C = NF)"
            "2S" - "generic 18+ even with S stop so 2N prob NF)"
        }
        "2D" - "was GF, promises another bid at least" {
            "(2S) X" - "was 0724 15 xtra trix"
            "2H" - "was 6H 18"
        }
        "2H" - "v. weak"
        "2S" - "limit or slam ** now mixed **" {
            "3D" - "6-4?"
            "3S" - "void (3N = slamtry not limit)"
        }
        "2N" - "was lim+ 3-crd raise ** cf 2S ** (3H = was minimum like 15)" {
            "(4S) P  re doubled with 8 3fit and pd passed since minimum" - ""
        }
        "3D" - "was art mixed raise (4 HCP)"
        "3H" - "v. weak (1 HCP?)"
        "3N" - "GF 4-crd raise"
        "4H" - "was 2461 7, 5440 6, no alert"
    }
    overcall("1N") {
        "Pass" - {
            "2m" - "5-5"
        }
    }
    overcall("2C") {
        "X" - "neg, was 4252 7"
        "2H" - "about 4-7 HCP"
        "2S" - "5+S, F1"
        "3C" - "was 4crd 7-8 HCP raise, 4441 6"
        "3N" - "H raise, was 4432 9"
    }
    overcall("2D") {
        "X" - "was 2245 13 (??)" {
            "2S" - "was 4513 11 (3N = was 2245 13)"
        }
        "2N" - "was 3-crd 9 HCP raise"
        "3C" - "nat GF *WITH TOLERANCE(+) FOR HEARTS*"
        "3D" - "was 4-crd 8 HCP raise"
        "3H" - "v. weak pree (4414 0)"
        "3N" - """to play 4H "not weak" e.g 4414 10"""
    }
    overcall("2H") {
        "2N" - "was 3fit 9 HCP, promises fit"
        "3D" - "nat, was 4351 14 (possibly GF with TOL for hearts as above)"
        "3N" - "raise to 4H with cards, 4+H"
    }
    overcall("2S") {
        "2N" - "was 0355 12, 3424 7" {
            "(3S) Pass" - "NF, was 4522 11 (4m cue for H)"
        }
        "3C" - "nat GF, had H tolerance"
        "3D" - "nat GF, had 3H"
        "3H" - "v. weak (cf 2N)"
        "3N" - "raise to 4H with cards, was 4H with 8, 13"
    }
    overcall("3D") {
        "X" - "was 6313 6, 4234 8" {
            "3H" - "was 3523 16 and was passed there, making 4"
            "4D" - "was 3712 19 (4H = was 4234 8 signoff)"
        }
    }

    addPassHandAdjRow()
    "1N" - "NF, mb 3145 9"
    "2/1" - "invit"
    "2C" - "5+C, or 4144, may have 3H or 4S" {
        "(2D) Pass" - "was 4531 13 (2H = was 5C-3H 10 NF)"
        "2H" - "GF, was 2533/3622 16" {
            "2N" - "as normal R"
            "3D" - "was 2245 10" {
                "3N" - "had 6-2 fit but played it 3N"
            }
            "3H" - "was 4342 10"
        }
        "2S" - "4+D (3H = nat inv)"
        "3H" - "was 2821 9.5 tricks (4C = was cue for H but had S cue)"
    }
    "2D" - "nat, stronger than 3163 8 (bid 1N with that), may have H fit" {
        "2N" - "was 2533 17 (3H = sets H, cues)"
    }
    "2N" - "same"
}
