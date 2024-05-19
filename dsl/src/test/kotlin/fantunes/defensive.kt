package fantunes

import com.github.phisgr.bridge.Bidder
import com.github.phisgr.bridge.BiddingSystem

fun BiddingSystem.defensive() {
    "DEFENSIVE BIDDING" - {
        explanation = """Two-suited overcall strength minimum varies by vul, from good 6 fav to good 10 unfav.\
                        |Jump overcall one-suiters are vul-dependent too, weak NV, intermediate V.""".trimMargin()
    }
    opponentOpen("1C", "std, short, or multi") {
        opponent("1D", "neg") {
            "1N" - "nat"
        }
        opponent("1D", "H") {
            "1H" - "normal takeout of 1H response"
        }
        opponent("1H", "S") {
            "2H" - "normal constructive 2H overcall of a 1S response"
        }
        opponent("1S", "not S") {
            "X" - "S"
        }
        "X" - "t/o" {
            "(1H) X" - "was 3S-6D constructive, so takeoutish"
            "(1S) X" - "takeout!"
            "1H" - "nat" {
                "(1S) 2C" - "as below"
                "2C" - "any GF, or 18+ with 3+fit (2D = was 3442 5)"
                "2H" - "was av 13 4fit NF"
            }
            "1S" - "nat" {
                "1N" - "18-20 may have 3fit"
            }
            "2C" - "general force, inc. 5413 9 (2H = 4M may have 4D [3C = general GF])"
        }
        "1D" - "nat" {
            "(X) XX" - "cards, 2N = nat"
            "(X [=H]) 2S" - "weak, 2N = was great 4fit"
            "(1H) X" - "had 5S strong hand, 4423 8 BPH, 1S = had 5S-3D 9"
            "(1S) X" - "was negative with 4H-3D, 2S = shows 4fit was 14, 3C = mixed"
            "(2C) 4C" - "splinter"
            "NS" - "NF, 1M mb 4 cards"
            "2C" - "general force, may be GF with 5+M"
            "2N" - "nat"
            "3C" - "mixed, prob."
            "3D" - "pree"
        }
        "1H" - "nat (denies 4S unless 7-4 or v. minimum)" {
            opponent("X") {
                "1S" - "was 4333 14 no alert" {
                    "2H" - "4S-6H weak"
                }
                "2C" - "was 3fit limit+"
                "3D" - "was mixed as belowx2"
            }
            opponent("1S") {
                "2C" - "was 3fit limit"
                "2D" - "nat"
            }
            "(2D) 2N" - "3+H invit+"
            "NS" - "NF (1S = 5crds usually unless 4S-1H, can raise with 3crds)"
            "1N" - "up to 11"
            "2C" - "general force, need not have fit, incl. 3-crd lim raise (2H = min [2N= inv])"
            "2H" - "as strong as 10 3fit"
            "2N" - "was 8-10 4-crd raise"
            "3C" - "was AT9x T98x QJx Q9, promises fit"
            "3D" - "about 5-7 4-crd raise"
            "3H" - "pree"
        }
        "1S" - "nat (denies 4H unless 6+-4 or v. minimum)" {
            opponent("X") {
                "1N" - "nat constructive"
                "2D" - "nat"
                "3C" - "4S good raise"
                "3D" - "mixed raise"
            }
            "(2C) 2D" - "was 5D-3S by a passed hand"
            "2C" - "general force, need not have fit, incl. 3crd limit raise" {
                "2D" - "nat"
                "2S" - "min (2N = was 15 bal)"
            }
            "NS" - "NF"
            "2S" - "as strong as 10 3fit"
            "2N" - "lim 4+crd raise"
            "3D" - "mixed 4-crd raise"
            "3S" - "pree"
        }
        "1N" - "15-18(-)"
        "2C" - "5-4 or 6-4 majors" {
            explanation = """to show C, pass then bid C like std\
                            |\* recently bid 1S with 6S-4H, then 3H later, so maybe this is 5-4 exact""".trimMargin()

            opponent("X") {
                "XX" - "asks which longer (but was 1435 10 once so think is equiv to 2D relay below)"
                "Pass" - "had 6 clubs (2D = frag)"
                "2D" - "prob. natural"
            }
            opponent("2S") {
                "X" - "was constructive hand 3-3 majors, maybe it asks for 5crd major to compete"
            }
            "2D" - "relay, asks longer or some invite, may be 4-4 majors (2M = longer [2N = invite])"
            "2M" - "3+M clear pref, but no game interest"
            "3M" - "pree/mixed"
        }
        "2D" - "5+H-5+S" {
            "2H" - "to play (2S = 6-5 extras NF)"
            "2S" - "to play (3C = was 5503 15 [3D = was 3271 constructive])"
            "2N" - "relay"
            "3D" - "self-suff suit"
        }
        "2M" - "weakish (3C = cue raise)" {
            "(X) XX" - "may be limit 4fit (raise later), new suit = lead-direct"
        }
        "2N" - "5D-5H (3C = relay, 3S = self-suff suit)"
        "3C" - "5D-5S (3H = relay or nat)"
        "3D" - "weak"
        "3M" - "weak"
    }
    opponentOpen("1C", "strong artif") {
        opponent("1D") {
            "X" - "lead-direct D (2C = nat)"
            "1M/2C/2M/3m" - "nat, tends to be weak but vul could be solid"
        }
        opponent("1H", "S") {
            "X" - "lead-direct H"
        }
        "X/1D/1N" - "C/RA/SH (p/c responses, even jumps [pree], even over [X])"
        "1H" - "nat (2H = pree)"
        "1S" - "nat" {
            "(X = double-neg) XX" - "was 2344 10"
            "2N" - "4+fit 8+ (3C = not horrible)"
            "3S" - "pree"
        }
        "2C" - "nat"
    }
    opponentOpen("1D", "standard") {
        "X" - "takeout" {
            "(XX) 2S" - "pree"
            "(1H) X" - "was 3244 8 (denies 4S I think since pd did not compete 2S with 4)"
            "(2C [weak]) X" - "takeout"
            "(2D) 3H" - "was 5crd constructive"
            "(2H [weak]) X" - "takeout"
            "1H" - "normal" {
                "2D" - "was 4333 18 no stopper, 3532 18 with stopper" {
                    "2H" - "was 3424 3"
                    "3H" - "was 5H xtras"
                }
            }
            "1S" - "normal (2D = was 1345 21 [3S = was 6crd 5 HCP, 2S = was 4315 13)"
            "2S" - "was 5134 9 NF"
            "3S" - "pree, 6suit v. weak"
        }
        "1H" - "nat" {
            opponent("X") {
                "2C" - "nat"
                "2D" - "was 11 3fit"
                "2N" - "4+crd limit"
                "3C" - "mixed raise"
                "3D" - "was 2434 10"
            }
            opponent("1S") { "2S" - "was 7 4fit" }
            opponent("1N") { "2S" - "to play, not too weak" }
            opponent("2C") { "3C" - "4crd raise, was 5422 9" }
            opponent("2D") { "3D" - "was mixed raise" }

            "NS" - "NF (1S = 5crds usually unless 4S-1H, can raise with 3crds)"
            "2D" - "likely lim raise or invite+ balanced, was GF 4crd raise"
            "2H" - "as strong as 10 3fit"
            "2N jump in comp" - "4H limit+, not as strong as 3D"
            "3C" - "mixed raise"
            "3D" - "v. strong limit (better than 2N, maybe GF I think)"
        }
        "1S" - "nat" {
            opponent("X") {
                "XX" - "was 2623 12 3532 13 [does not set force]"
                "3C" - "was 4fit 7-8 (mixed?)"
                "3D" - "was 5323 8/12, 4423 11 (lim?)"
            }
            "(2H) 3H" - "was 3fit limit"
            "NS" - "NF"
            "2D" - "lim raise or invite+ NT - was lim 4crd raise, 3crd 9-10 HCP BPH, 2434 17, 2425 15" {
                "2H" - "was nat 8 HCP (promises non-junk)"
                "2S" - "was 4/6 (2N = was 2425 15 NF, 3N = was 2434 17)"
                "3S" - "counter-invite, was 6 trumps"
            }
            "2H" - "nat, constructive (3D = general force)"
            "2S" - "was as strong as 10 HCP 3fit"
            "3C" - "mixed raise"
            "3D" - "was GF 5-crd raise, 9 4fit, 5323 10 (3H = ART countertry)"
        }
        "1N" - "15-18 (thought I saw a few 12-14's NV but then counterexample so who knows)"
        "2C" - "nat (2M = NF, even over X, may be light [2S = nat])"
        "2D" - "5H-5S" {
            "(X) XX" - "was 2335 10"
            "2H" - "s/o (2N = was great 15 5-5 no D stop [3N = to play had 2H])"
            "2N" - "relay"
            "3C" - "self-suff suit)"
        }
        "2M" - "weak" {
            opponent("X") {
                "XX" - "was limit 4fit (later 3S)"
                "new suit" - "lead-direct"
            }
        }
        "2N" - "5C-5H (3D = relay [3H = min NF], 3S = self-suff suit)"
        "3C" - "5C-5S min or intermediate (3D = relay)"
        "3D" - "5C-5S max"
        "3S" - "weak"
    }
    opponentOpen("1D", "[precision, 1+crds] ** might just treat this as normal above, it seems") {
        "X" - "takeout, normal"
        "2C" - "normal"
        "2D" - "same as normal (to show D, pass then bid D later)"
        "3C" - "same as normal"
    }
    opponentOpen("1H") {
        "1S" - "nat" {
            opponent("X") {
                "XX" - "was 3244 11"
                "2S" - "was 3343 5"
                "2N" - "limit+ 4fit"
                "3H" - "was 10 4fit"
            }
            opponent("2H") {
                "2N" - "was lim 3fit"
                "3H" - "was limit 4fitx2"
            }
            opponent("2S") {
                "X" - "was 2344 8 no S honor"
                "2N" - "lim+ 3fit"
                "3H" - "was 4fit 8 unbal"
            }

            "(3H) 4H" - "was slammish 4fit"
            "NS" - "NF"
            "1N" - "normal (later X is takeout)"
            "2H cue" - "3crd limit+ (2S = min [2N = was 15])"
            "2N jump" - "4S limit+"
            "3H" - "think mixed, but was 4fit lim recently"
        }
        "1N" - "15-18"
        "2C" - "nat" {
            "2D" - "5+S"
            "2H" - "5+D"
            "2S" - "4S exactly [F1]"
            "2N" - "nat"
            "3H" - "asks stop"
            "3S" - "FSJ"
            "(X) XX" - "cards, even with 5+S"
            "(2H) X" - "takeout, was 5S-4D"
        }
        "2D" - "nat" {
            "XX" - "cards"
            "2H" - "5+S"
            "2S" - "4S exactly [F1]"
            "2N" - "nat"
            "3C" - "?"
            "3D" - "semipree"
            "3H" - "asks stop"
            "3S" - "FSJ"
        }
        "2H" - "5S-5C" {
            "XX" - "some limit+, had nice club raise"
            "2N" - "relay"
            "4C jump" - "pree"
        }
        "2S" - "weak"
        "2N" - "5C-5D" {
            "3H" - "relay"
            "3S" - "self-suff suit"
            "4m" - "pree"
            "(X) Pass" - "asks pref"
        }
        "3C" - "5D-5S, incl. v. strong" {
            "3H" - "relay incl invit (4S = was 6052 average, good S suit [5D = to play])"
            "4C" - "self-suff suit"
        }
        "3D" - "weak"
        "4D" - "weak"
    }
    opponentOpen("1S") {
        "X" - "takeout" {
            "2H" - "nat, < 9 cf below (2S = incl. 3244 GF, 1435 18)"
            "2S" - "was 3424 9 (3D = was 4H-5D [3H = was 4H NF])"
            opponent("2S") {
                addBid(Bidder.S, "X", "reopen") {
                    "2N" - "scramble"
                }
                "3D" - "weak"
                "3H" - "weak"
            }
        }
        "1N" - "15-18" {
            opponent("X", "normal xfer runouts")
            "(2S) 3S" - "was 1543 GF (pd bid 4H with 3 hearts)"
            "2S" - "was 2533 Qx stopper"
            "4C" - "SAT to H"
        }
        "2C" - "nat" {
            "2D" - "5+H"
            "2H" - "4H (3C = weak NF)"
            "2S" - "5+D"
            "2N" - "nat"
            "3H" - "FSJ, 3S = asks stop"
            "(X) XX" - "was 4414 10"
        }
        "2D" - "nat" {
            "3D" - "was constr. raise Vul"
            "2N" - "nat"
        }
        "2H" - "nat" {
            "2S" - "was 4-crd 8 HCP raise"
            "2N" - "nat"
            "3H" - "pree"
            "3N" - "good 4-crd raise"
            opponent("X") {
                "XX" - "cards 9+"
                "3H" - "pree"
            }
            "(2S) 4m" - "splinter (but recently was FSJ or spl other m)"
        }
        "2S" - "5H-5C, no upper limit" {
            "2N" - "invit+  (3C = was min, 4D = was strong 3505)"
            "3C/H" - "to play"
            "3D" - "self-suff suit"
            addBid(Bidder.S, "later maverick X by overcaller", "was 19 sing in their suit")
        }
        "2N" - "5D-5C (3C = relay)"
        "3C" - "5H-5D, mb 11"
        "3D" - "?"
        "3H" - "weak"
        "4m" - "pree"
    }
    opponentOpen("1N", "strong") {
        explanation = "in balancing seat BUPH they doubled with 12 against 14-16 NV, so maybe some treatment there"
        opponent("2red", "transfer") {
            "3red" - "nat"
        }
        "X" - "5m-4M (2C = p/c, 2D = asks major, 2M = to play)" {
            opponent("XX", "2C = same")
        }
        "2C" - "4+H-4+S" {
            "(X) XX" - "was 3-3 majors"
            opponent("2D") {
                "Pass" - "suggests really does not care to play in a major at all"
                "X" - "asks pick best major mb 3-3"
            }
            "2D" - "asks pref, and/or some invite" {
                "2M" - "pref, even stronger suit if 5-5 (3M = invite)"
            }
            "2M" - "to play (3m = was 5440 with 5M-4m)"
        }
        "2D" - "6+M, or 5-5 v. strong" {
            "(X) 2S/2N" - "same as before"
            "(2S) 4H" - "assumes pd has hearts"
            opponent("2N", "Leb") {
                "3C" - "was pree 3-3 majors, alerted"
                "3S" - "was strong p/c NF"
            }
            "(3C) 3D" - "was invit 3523"
            "2H" - "p/c (2N = 5+S-4+m strong, 3m = 5+H-4+m strong)"
            "2S" - "p/c, invit+ for H (2N = 6+S strong, 3m = 5+S-4+m strong, 3H = H min, 4H = H max)"
            "2N" - "invit+ ask (3C = H, 3D = S, 3N = was SOL S nothing else gambling)" {
                opponent("3m") {
                    "Pass" - "minimum"
                    "3M" - "maximum (3M = p/c)"
                }
            }
            "3D" - "invit, 3+ 3+ majors, I think"
            "3H" - "p/c, length both majors"
        }
        "2M" - "5+M-4+m (2N asks m)" {
            "(2S) X" - "was pen but had H fit, pd showed minor, adv leaped to game over weak NT"
        }
        "2N" - "5-5 minors (3m = to play, 3M = stop for NT or cue for a m)"
        "3m" - "nat"
        "3M" - "constructive"
    }

    opponentOpen("1N", "weak, as above but") {
        "X" - "equal or better (hopefully mostly better)" {
            explanation = """later inverted doubles once re shows strength,
                            |else takeout (BPH might be Woolsey as above)
                            |
                            |vs. 9-12, 11 is not enough to double""".trimMargin()
            opponent("Pass", "forces XX") {
                "Pass" - "shows strength, sets up pen X's" {
                    opponent("XX", "forced") {
                        opponent("2C", "scramble") {
                            "X's" - "penalty"
                        }
                    }
                    opponent("2C") {
                        "Pass" - {
                            "X" - "penalty"
                        }
                    }
                }
            }
            opponent("XX", "art runout") {
                "Pass" - "cards (later X takeout)"
                "2S" - "to play but not too weak (3H NF)"
                "3S" - "was 6 spades 7 HCP"
            }
            opponent("2H", "s/o") {
                "X" - "takeout was 4252 8, passable with 4 trumps"
            }
            "(3S) 4H" - "to play"
            "2C" - "5+ crds or (4333) or lower of 4-4 (can later XX to indicate 4333's if X'd)"
            "2D/H" - "5+crds or lower of 4-4"
            "2S" - "5+S weak"
        }
        explanation =
            """double of Stayman or transfer shows good hand, not lead-direct BUPH (must "cue" to show suit)"""
    }
    opponentOpen("2C", "strong artif") {
        "X/2D/2N" - "C/RA/SH"
        "2M/3m" - "natural pree"
    }
    opponentOpen("2C", "nat") {
        "2D" - "nat (3D pree)"
        "2H" - "nat (3D = nat F1)"
        "2S" - "nat (3C = was 2533 GF [3S = was 6232 11 -pd raised with doub])"
        "3C" - "was 5-5 majors (3D = was R but they had misunderstanding)"
        "3D" - "nat, good disruptive bid, range vul/seat dependent"
    }
    opponentOpen("2C", "multi incl. weak 2D") {
        "2M" - "nat"
    }
    opponentOpen("2D", "multi - defense is to assume they have S") {
        remark(Bidder.W, "any p/c bid is assumed nat")
        addBid(Bidder.S, "(2H)-(2S) X", "is full strength by 4th seat")
        opponent("2H", "p/c") {
            "Pass" - "may have takeout of S" {
                opponent("2S", "S") {
                    "Pass" - {
                        "X" - "takeout of S"
                    }
                }
            }
            "X" - "takeout of H I think, includes 5215 strong, 21+ bal (3D = was 3253 6)"
            "3H" - " natural"
        }
        opponent("2S", "p/c") {
            "2N" - "nat"
        }
        "Pass" - "may contain takeout of hearts (later X H bid)"
        "X" - "takeout of S, or strong, can be KQxxxxx Jx KQ Kx (rebid S), can be 2443 14, 2335 20" {
            remark(Bidder.S, "doubler can double either M later for takeout")
            remark(Bidder.S, "doubler can rebid 2N later as 19-21")
            remark(Bidder.N, "advancer can double H later for penalty")
            "(XX) 2H" - "nat (2S = general GF cue)"
        }
        "2H" - "nat" {
            "2N" - "was 3433 7 prob ART constr. raise, but NAT by passed hand"
            "4H" - "was 2533 10 does not set forcing pass"
        }
        "2S" - """nat (3C = nat, constructive, 3H = " cue " don't think they knew what doing)"""
        "2N" - "nat (transfers with superaccepts)"
        "3m" - "nat, solid opening strength (3D = seminat forcing, 3S = nat)"
        "4m" - "6m-5H"
    }
    opponentOpen("2D", "strong art") {
        "2H" - "nat"
        "3C" - "nat"
    }
    opponentOpen("2D", "short D precision") {
        remark(Bidder.S, "Passed with 1354 13, balanced X over pree (3S), slowly")
        "4D" - "pree/to play"
    }
    opponentOpen("2H", "majors weak") {
        "X" - "includes 19 bal"
    }
    opponentOpen("2H", "weak") {
        "X" - "t/o (3C = weak to play, 4S = long suit not too strong)"
        "2S" - "nat" {
            "(3H) 4H" - "was 4333 13"
            "2N" - "lim+ S raise"
            "3D" - "nat"
        }
        "2N" - "15-18 (3C = Puppet Stayman, 3H = transfer)"
        "3H" - "Michaels"
        "4m" - "6m-5S"
    }
    opponentOpen("2S", "weak") {
        "X" - "t/o" {
            "2N" - "s/o, or good 4H bid with 5 trumps (remove 3C to 4H) or 3N with a stopper (remove 3C to 3N)"
            "3C" - "was constructive NF"
            "3D" - "was constructive NF"
            "3S" - "asks stopper (3D = extras, 5+suit)"
        }
        "direct or bal 2N" - "strong" {
            "3C" - "Puppet Stayman"
            "3D" - "xfer"
        }
        "3C" - "nat (3H = nat)"
        "3S" - "Michaels (3N = to play, 4N = was asking minor)"
        "4m" - "6m-5H"
    }
    opponentOpen("2N", "strong") {
        "3H" - "6-5 majors"
    }
    opponentOpen("3C") {
        "X" - "takeout (4C = scramble or great 4S bid)"
        "4C" - "5-5 D + major"
    }
    opponentOpen("3C", "D transfer preempt") {
        "X" - "takeout of diamonds (includes)"
    }

    opponentOpen("3H") {
        "4D" - "nat"
    }

    opponentOpen("3S") {
        "4N" - "minors"
    }

    opponentOpen("3N") {
        "4C" - "H+m"
        "4D" - "S+other"
        "4M" - "nat"
    }

    opponentOpen("4H") {
        "X" - "was 4144 21"
    }

    opponentOpen("4S") {
        "X" - "takeout"
    }

    "Balancing" - ""
    opponentOpen("1y", opener = Bidder.W) {
        addBid(Bidder.S, "1N", "11(+)-15(-), mb no stopper, if BPH then 9-11 nat") {
            "2C (after 1C op)" - "cue baron-like"
            "2H (after 1S op)" - "nat s/o"
            "2H (after 1H op)" - "was 4243 11 with Qx - pd bid 3N with 3244 14 with hKx)"
        }
        addBid(Bidder.S, "X", "8-11 nebulous, or 15+ any")
    }
    "(4S) P (P) X" - "takeout"

    "OBAR" - ""
    opponentOpen("1D)-(1H") {
        "1S" - {
            "(X) 2C" - "nat (no transfer advances opposite sandwich)"
        }
    }
    opponentOpen("1D)-(1N") {
        "2D" - "5-5 majors"
    }
    opponentOpen("1H)-(2D", "ART weak raise or others") {
        "X" - "t/o of hearts"
    }
    opponentOpen("1H)-(2H") {
        "X" - "t/o (over 3C/3D [weak], 3D = D-S not strong, 3S = strong)" {
            "2N" - "mb invite with 4S exact"
        }
        "2N/3C/3D" - "6+C/D/S transfer"
        "3H" - "Michaels"
        "4C" - "5-5 minors NF"
        "4D" - "5-5 minors GF"
    }
    opponentOpen("1S)-(2S", "as over (1H)-(2H)") {
        "2N" - "was minors BPH"
    }
    opponentOpen("2H)-P-(3H") {
        "4C" - "nat"
    }
    "Sandwich" - ""
    opponentOpen("1C)-(1D") {
        "1N" - "nat (2D = xfer)"
    }
    opponentOpen("1C)-(1H") {
        "X" - "takeout" {
            "1S" - {
                "(bid) cue" - "includes 20 HCP 4fit"
            }
        }
        "1S" - "nat (2C = good S raise)"
        "2H" - "Michaels takeout" {
            "(X) XX" - "cards"
        }
    }
    opponentOpen("1C)-(1H", "S") {
        "X" - "hearts, but recently was takeout of C-S"
        "2H" - "more hearts"
    }
    opponentOpen("1C)-(1S") {
        "2H" - "nat" {
            "(2S) 2N" - "was 4fit limit"
        }
    }
    opponentOpen("1C)-(1S", "art") {
        "X" - "spade overcall"
    }
    opponentOpen("1m std)-(1N") {
        "2C" - "majors, may be 5-4 (2D = asks longer)"
        "2D" - "probably shows 5-5 majors"
        "2M" - "nat"
    }
    opponentOpen("1m mb short)-(1N") {
        "2C" - "natural constructive"
    }
    "(1D)-P-(1H)-1S" - {
        "(X) 3D" - "mixed raise, art"
        "(1N)-2H" - "was 4fit 11 bal"
    }
    opponentOpen("1H)-(1S") {
        "1N" - "nat"
        "2H" - "was 5S-5m if 1S not S"
    }
    opponentOpen("1M)-(1N") {
        "2D" - "nat"
        "2M" - "as (1M)-2M Ghestem (2S = H + minor)"
        "3D" - "pree"
    }
    opponentOpen("1M)-(2C", "Drury") {
        "2H" - "5S-5D"
    }
    opponentOpen("1M)-(splinter") {
        "X" - "X'd suit + another (p/c responses)"
    }
    opponentOpen("2H)-(2S") {
        "2N" - "nat"
    }

    "Passed Hand Overcalling" - ""
    "P-P-(1S)-P-(P)-1N" - "nat 8-11"
    "P-P-(1S)-1N" - "5-5 minors"
}
