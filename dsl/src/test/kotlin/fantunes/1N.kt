package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.oneNoTrump() {
    explanation = "With 4441 14, opening 1D may be chosen instead of 1N."

    "2C" - "Stayman, at IMPs any 10 HCP will do, also may be a psyche with v. weak hand (rare)" {
        overcall("X") {
            "Pass" - "C stopper (re redoubles and continue normal)"
            "XX" - "to play (re 2D is garbage)"
            "bids" - "normal but no C stopper (X by Stayman bidder is takeout)"
        }
        overcall("2D") {
            "(3D) X" - "had cards with xx D"
            "2H" - "had 4H with AQ D (twice!), not 4S"
        }
        overcall("2H") {
            "X" opener "takeout (since had 5 great H and passed)"
        }
        overcall("2S") {
            addBid(responder, "X", "was penalty")
        }
        overcall("3C") {
            "3M" - "good 5crds"
        }
        "2D" - "no M" {
            "2H" - "relay to 2S, could be 5+S-4+H weak, or GF 3415 et al" {
                "2S" - "forced" {
                    "Pass" - "5+S-4+H weak"
                    "2N" - "was 1354/4414 minimum GF *** this is new I think ***" {
                        "3C" - "was 2335 with Ax S, 2353 - asking" {
                            "3H" - "was 1354, but recently 4414 it shows"
                        }
                    }
                }
            }
            "2S" - "relay, was 17+ bal, 19 4414, 4315 13, 5422 15" {
                "2N" - "was 3235 min" {
                    "3S" - "was 5422 15 (cues for S with 3fit)"
                }
                "3C" - "was 3352, but recently was 3235 showing C, but then again 3352 14" {
                    "3D" - "?  at some pt D was set, was 4315 13" {
                        "3S" - "was 3352 14 (3N  to play)"
                    }
                    "4C" - "sets C, was 4414 19"
                }
                "3S" - "was 3244 max (4D sets D)"
            }
            "2N" - "invite, might not have 4M (was 5314 inv in BBowl)"
            "3C" - "nat GF, was 2425, 3406 14 (3N = was 3352, 4C = big fit)"
            "3D" - "was 2461 GF/15, 3262 16 SOL D" {
                "3H" - "was 3235 no S stopper and pd bid 5D with xx S"
                "3N" - "was KQT Ax xxx Kxxxx or other 3fits with M stoppers"
            }
            "3H" - "5+H GF, 1-suiter or 4S-5H (was 45[22/(31)] 12-13, 2812 13, 3532 16, 1633 16)" {
                "3S/4m" - "cues with H fit"
                "3N" - "no fit (4C = auto-cue for H)"
            }
            "3S" - "was 5422/5404/7114/5305 GF, 5233 16" {
                "3N" - "doubleton spadex2"
                "4C" - "was 2344, ended in S"
                "4D" - "was AJx xx AQTxx xxx (4S = to play was bare min)"
            }
            "3N" - "to play"
            "4S" - "to play, 6S-4+other for whatever reason"
        }
        "2H" - "4+H, incl 1444" {
            "2S" - "relay, asks strength/shape, may be invit+ with 4S, may be slammish, may be 7141 slammish" {
                "(X) Pass" - "no agreement, think 3/4 S"
                "2N" - "min, not 4S, NF" {
                    "3C" - "relay, may have 4H if slammish" {
                        "3D" - "was 2443/3442/1444" {
                            "3H" - "was 4234 slammish mb looking for 5D? [3N = was 2443]"
                            "3N" - "was looking for C fit"
                            "4S" - "was 6322"
                        }
                        "3H" - "5H (3S = cue for H [3N min])"
                        "3N" - "4 clubs (4H = to play)"
                    }
                    "3H" - "H flag (had long spades too) - cues"
                    "3S" - "was 7141 14 (4C = cue for S was 3fit)"
                    "3N" - "to play"
                    "4H" - "to play"
                }
                "3C" - "max, 4+C" {
                    "3S" - "was 6313 slammish (3N = was doubleton spade [4S = to play even though had cues])"
                }
                "3D" - "max, 4+D" {
                    "3H" - "sets H, cues"
                    "3S" - "was 4144/4333 no alert (looking for S fit if op 4441?)" {
                        "3N" - "was 2452 (4C = cue for D)"
                        "4H" - "was 2542, misunderstanding"
                    }
                }
                "3H" - "max, 5H (even 2524) or 3433(3S = might ask [4C = 5H], 3N/4H = to play, 4C cue for H)"
                "3S" - "min, 4-4 majors, not 44(41) (4C = sets H)"
                "3N" - "max, 4-4 majors, not 44(41) (4C was 2245 slammish, 4D = S flag not cue)"
            }
            "2N" - "inv, no major"
            "3C" - "was 3235 18, 1327 13, solid clubs slammish" {
                "3D" - "was 2542, or 3442 with good side stops (4N = quant, 5m = to play)"
                "3H" - "was 2524 no alert (4C = C flag since had S cue)"
                "3S" - "was 3433 min (3N = was mild slamtry)"
            }
            "3D" - "nat GF, enc raise" {
                "3S" - "4-4 majors"
                "3N" - "to play [4C = was 5D-4C slamtry]"
                "4D" - "was 4fit"
            }
            "3H" - "invite"
            "3S" - "was 6+S balanced slammish x3, 5143 mild slammish (3N to play, 4C = was 3442 cue)"
            "3N" - "no major, was 3136"
            "4m" - "great hand, H fit, cheapest cue (short or honor or length ok), Turbo"
        }
        "2S" - "4+S" {
            "(3C) 3S" - "pree"
            "2N" - "invit (3S = max, 5S)"
            "3C" - "GF relay, may have S fit or minors" {
                "3D" - "4+D, may have 5S (3H = was 3325 16 [3N = was 4243], 3S = sets S, 4D = sets D)"
                "3H" - "4333 (4m = sets m)"
                "3S" - "was 5(332) (4C = S cue, 4D = was 4054 slammish [4H = was last train for S])"
                "3N" - "was 4225/4(32)4 any strength (4C = sets C, 4D = cue for S even with C cue, 4N = quant)"
            }
            "3D" - "was 2461 11, 3451 16, no alert (3N = to play may have 3D)"
            "3H" - "6+H, at least mild slam interest" {
                explanation = "** but was 3541 no slam recently (4H - 3fit)"
                "3s" - "5S (4C = cue)"
                "3N" - "to play (auto-cues)"
            }
            "3S" - "invite"
            "4m" - "great hand, cheapest cue (short or honor ok), Turbo"
            "4H" - "to play, was 1651"
            "5m" - "to play, does not promise 4H, probably short H"
        }
        "2N" - "was 4441 minimum x2, def. short C (4M = to play)"
        "3C" - "was 4414 minimum (4M = to play)"
    }
    "2D" - "transfer, 5+H, or 5M GF, or 4H-5+m invite (recently was 5422 10, 5134 15 also)" {
        overcall("X") {
            "XX" - "D.N.E. I think"
            "Pass" - "2H (XX = retransfer, or later free 3H = to play)"
            "2H" - "3-4H, or maybe Ax"
        }
        overcall("2H") {
            "X" - "had max, Axx H"
        }
        "2H" - "accepts transfer" {
            "Pass (any) -Pass-  X" responder "takeout (2N = scramble)"
            "(2S) X" - "cards"
            "2S" - "transfer to 2N" {
                "2N" - "forced" {
                    "3C" - "5M-3oM-1D-4C, GF (3D = relay [3S = 5S])"
                    "3D" - "5M-3oM-4D-1C, GF" {
                        "3H" - "relay (3S = 5S)"
                        "4S" - "to play, 5S"
                    }
                    "3H" - "was 5422 GF x2, promises 5S" {
                        "4S" - "had 4/5S"
                    }
                    "3S" - "51(43), c.o.g"
                    "3N" - "15(43), c.o.g."
                }
            }
            "2N" - "invite"
            "3m" - "4H-5+m invite"
            "3H" - "invite (had 4S but so did op and they weren't mentioned)"
            "3S" - "5+S-5+H slamtry (3N = to play was 2-2 majors [4H = to play], 4D = sets S?, 4S = s/o)"
            "3N" - "c.o.g."
            "4C" - "5+-5+ H-C slamtry (4D = cue, had C fit)"
            "4D" - "5+-5+ H-D slamtry (4H = to play)"
            "4H" - "to play, was aceless bal 14, was it looking for perfecto superaccept?"
        }
        "2S" - "4-5H, short C - probably short C (2N = was 2524 mild slamtry [3H min], 4D = retransfer)"
        "2N" - "was 4414 min, prob short D (4H = to play)"
        "3C" - "was 2452 (Ax clubs) avg, soft 14 KJxx C, 1444 12/13 (3D = retransfer then cues), prob short S"
        "3H" - "min 4H, or max 4333" {
            "3S" - "5S, not hearts, GF not nec slam interest (3N = doubleton S to play)"
            "4C" - "probably just ART H slamtry [good?]not cue" {
                explanation = "was 2524 with S ctrl, alerted as denying S ctrl so Nunes thought nat? so now 4D = S ctrl"
            }
        }
    }
    "2H" - "5+S transfer (could be 4S-5+other invite)" {
        overcall("X") {
            "Pass" - "2S (2S = to play, XX = retransfer)"
            "XX" - "was 1444 (3D = was 5242 11 and pd passed)"
            "2S" - "3S or maybe Ax (3m = still 4S-5m invite, 4S = s/o)"
        }
        "2S" - "accepts transfer" {
            "(X) 3D" - "weak 5-5"
            "(3C) 3N" - "need not have C stop"
            "2N" - "5S invite (3D = declines, was 2452)"
            "3m" - "4S-5+m invite"
            "3H" - "4S-5+H invite"
            "3S" - "invite"
            "3N" - "c.o.g."
            "4m" - "5+S-5+m slamtry"
            "4H" - "5+S-5+H c.o.g."
        }
        "2N/3m" - "working doubleton next higher suit, 4S (3H retransfer)"
        "3S" - "was 5233 sub-minimum, 4342 max with xx clubs"
    }
    "2S" - "transfer, many possible hands, incl. 5-5 minors GF, 5H-5D invit, 5S-5H 11" {
        addBid(responder, "(X) later X by responder", "takeout invite 5-5")
        "2N" - "forced" {
            "(3S) Pass" - "forcing invite with 5H most likely (5-5)"
            "3C" - "5H-5C inv?"
            "3D" - "5H-5D inv"
            "3H" - "5S-5D inv?"
            "3S" - "was 5S-5C inv"
        }
    }
    "2N" - "transfer: signoff minor, or 5-5 non-touching invite" {
        overcall("X") {
            "Pass" - "was max, Axx D"
            "3C" - "was equal minors average"
        }
        "3C" - "forced" {
            "Pass" - "C s/o"
            "3D" - "D s/o (4S = cue with bid D fit)"
            "3H" - "H-C invite 5-5 (4C s/o)"
            "3S" - "S-D invite 5-5 (4D s/o)"
            "3N" - "was 16 with 6 SOL clubs no short, NF (4S = was 3fit with 5 good S)"
        }
    }
    "3C" - "asks 5-crd major or 5422, not used if just looking for 4-4 fit" {
        "(X) Pass" - "C stopper (XX continues), bids = normal without C stopper"
        "3D" - "denies 5m-4M" {
            "3H" - "3H, may have 3S (had various 5m332's not nec slammish)" {
                "3S" - "5S"
                "3N" - "no 5M (4D = 5crd F [particularly over X of 3C])"
                "4C" - "cue with 5H"
                "4H" - "was good 14 with 5H suprised didn't cue"
            }
            "3S" - "3S, denies 3H (usu. sing or bad doub)" {
                "3N/4S" - "to play"
            }
        }
        "3H" - "5C-4M"
        "3S" - "was 2452"
    }
    "3M" - "splinter, 5+-4 minors, GF - recently was 1246" {
        "(X) 3N" - "had great stops"
        "4oM" - "to play 5crd"
    }
    "4m" - "South African Transfer to 4M" {
        "(X) 4M completion" - "was misfit with control"
    }

    overcall("X", "pen") {
        "Pass" - "asks partner to pass if 4333, may be weak no 5crd suit, or any 8+ (these bid later)" {
            overcall("2any") {
                "Pass" opener "had 5crds in their natural runout once" {
                    "X" - "takeoutish, usu. 2-3 crds, 8+, may be 5-4"
                    "2N" - "minors (if over a major)"
                    "(2S) X" - "takeoutish 8+, was 3523 and pd bid 2N with xx AQxx AQxx xxx no stoppers anywhere"
                    "(3D) X" - "takeoutish was 4225 and passed 3H"
                }
                "X" - "was 5crds in their suit, pd raised with 4 to play"
            }
            overcall("3any") {
                "Pass" - {
                    "X" - "forward going, was takeout with 2crds 11"
                }
            }
            "Pass" - "any 4333"
            "XX" - "any 44 or 54, later XX by either side SOS" {
                "Pass" - "8+"
                "2C" - "weak C+higher, or any 4333 (2D = p/c)"
                "2D" - "weak D+higher"
                "2H" - "4+S 4+H weak"
            }
            "2y" - "5-crd suit 1-suiter, may judge to do this if good 5 card suit and weak 4 card suit"
        }
        "XX/2C/D/H" - "transfer to 5+crd suit, may be 2-suited, usually signoff (may superaccept with 5[4] crds)" {
            explanation = "*\\[runouts may be natural opposite a 1N overcall:  (1D)-1N-(X)-2C = nat]"
            "(X) complete transfer" opener "mb 2 cards (mb Pass shows 1444?)"
            remark(responder, "later responder can compete to 3-level non-invite, even reverse with 6-5")
            remark(
                opener,
                "later NT bidder can XX after completing transfer to indicate maybe 4441 short pd's suit"
            )
        }
    }
    overcall("X", "pen", balancing = true) {
        "Pass" - {
            overcall("2H") {
                overcall("2S") {
                    "Pass" - {
                        "X" - "cards takeout oriented"
                    }
                }
            }
            "XX" responder "scrambling"
            "2m" responder "natural"
        }
        "2C" opener "judged to bid NV with 2335 great suit"
        "2D" opener "judged to bid NV with 4252 eh suit"
        "2H" opener "judged to bid NV with 2524/2542, V with 3532"
        "2S" opener "judged to bid NV with 5233"
    }

    overcall("2C", "any suit[s]") {
        "X" - "values"
        "4M" - "to play"
    }
    overcall("2C", "majors") {
        "Pass" - "mb 8+ waiting without pen for both majors (cf X)" {
            overcall("2M", "pref") {
                "Pass" - {
                    "X" - "was 8-10 cards not stack (even sing), pd passed with sA98x max"
                }
            }
        }
        "X" - "stack for at least one major?  was KQx Qxx xxx Kxxx (3C by op NF 5 crds)"
        "2D/3C/3D" - "to play"
        "2H" - """clubs, lim+ (later cue M you "show" stopper in)"""
        "2S" - "diamonds, lim+ (3D = neg)"
        "2N" - "nat, had no major stack (Kx xx), but recently was 5-5 minors weakish"
    }
    overcall("2C", "H + another") {
        "X" - "was 4252 10, cards likely (does not set force)"
    }
    overcall("2C", "S + another") {
        "2D" - "to play"
    }
    overcall("2D", "D + major") {
        "2H" - "nat s/o"
    }
    overcall("2D", "majors") {
        "X" - "general strength (activates pen X's)"
    }
    overcall("2D", "H") {
        "Pass then 2NT" - "minors"
        "X" - "values but not F (later X takeout both sides), but recently BPH was takeout of hearts (bid bid 4crd S freely at 3-level)" {
            "Pass" - "had 2542"
        }
        "2H" - "was 5233 12 no H stopper, 3235 9, probably takeoutish" {
            "2S" - "was 3crd NF"
        }
        "2S" - "to play"
        "2N" - "was C signoff, probably Leb"
        "3H" - "5+S GF, no H stopper (*but see 2H recently)"
        "3N" - "has stopper"
    }
    overcall("2D", "multi") {
        "Pass" - "mb strong takeout of H or penalty of S" {
            "(2M p/c) X" - "takeout both sides, except pen X by Re: behind o/c'er"
        }
        "X" - "cards (was 3-4/3-2/2-4 majors), sets up pen X's, may be as light as 8" {
            overcall("(2H", "p/c") {
                "Pass" - "had 4144 and sat for pd's penalty double, or AQJ and didn't penalize" {
                    "3C" - "was 3235 10, pd bid 3N with 12 but hAQJ"
                }
                "X" - "had 5S-3H max, pd sat with Q9xx hearts and 8 HCP"
            }
        }
        "2S" - "s/o"
        "3D" - "nat, F"
        "4m" - "South African Texas as normal, sets forcing Pass"
    }
    overcall("2H", "nat") {
        addBid(opener, "P (P) X", "takeout")
        "X" - "takeout, may be GF with 5S, does not set up forcing pass"
        "2N" - "was long good D suit (forces 3C then bids 3D), prob. invit."
    }
    overcall("2H", "S") {
        "X" - "4+H, was 10+ HCP and pd can raise to 4H over 2S (2N = to play)"
        "3S" - "5+H GF, no S stopper"
        "3N" - "has stopper"
    }
    overcall("2S", "nat") {
        "X" - "neg (must pass with penalty, mb opener will reopen with t/o X), might have 5H BAL" {
            explanation = """might have 3H-3S showing flexible GF\
                            |does not set up forcing pass""".trimMargin()
            "(3S) X" - "takeout"
            "3D" - "had hKxxx dAJxx"
            "3H" - "had 4H (3N = had sAxx and hQJx)"
        }
        "2N" - "puppet to 3C, includes GF with long D (rebid 3D)"
        "3S" - "5H (was 5H short S - pd bid 4H with 3 hearts)"
        "3N" - "had stoppers"
        "4C" - "SAT transfer as normal (hearts)"
    }

    overcall("2y", balancing = true) {
        "X by both sides" - "passable takeout X's"
        "X over art 2y" opener "natural X (Kxxxx ok)"
    }

    overcall("3C") {
        "X" - "takeout"
        "3D" - "nat GF"
        "3S" - "was 4S-5H GF (pd bid 4H with 3)"
    }
    overcall("3D") {
        "X" - "takeout"
        "3H" - "5+S, invite+, was 5S-4H GF, 6322 10 (3S = 3+S NF)"
        "4D" - "5-5 majors"
    }

}
