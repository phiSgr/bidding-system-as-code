package fantunes

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.twoSpades() {
    "2N" - "asks for minor (may be semigambling with short S both m's), or constr. 4crd raise, or invit+ relay" {
        "(X) 3H" - "5+S-5+D (as before)"
        "(3H) Pass" - "may have minimum 5134 takeout"
        "3C" - "4+C, even 5044" {
            "(3H) 3S" - "was GF fit"
            "3D" - "was 2452/3451/1462/1552/2353/2434 GF, 1723 15, 4432 17" {
                "3H" - "5-5 (3N = s/o), but recently 5314"
                "3S" - "was 5314 x4 any strength (3N = to play, else cues for S, except recently 4D = ART C flag)"
                "3N" - """"short H 3D", was 5134x3, 5044 (4C = sets C, 4D = D flag, 4H = S flag)"""
                "4C" - "promises 6S, was 6304/6214, 6C-5C (4D = sets C, 5C = to play)"
            }
            "3S" - "was 2443 inv (NF), 3352 light invite"
            "3N" - "to play but enough S tolerance for op to go back with unbalanced 6S"
            "4C" - "was a distributional invite, taken as slamtry"
        }
        "3D" - "4D exactly, may be 6-4, was 5044 once but that was prob wrong" {
            "3H" - "relay" {
                "3S" - "5341 exactly" {
                    "4D" - "was 3S-4D, with C cue, unsure what is happening"
                    "4H" - "to play"
                }
                "3N" - "5143 exactly, was 5044 recently and had mistake (4C = cue for S)"
                "4C" - "was 6142 (4S = to play)"
            }
            "3S" - "was just 4324 8"
            "4D" - "invite?"
        }
        "3H" - "5+D (4C = cue for D, games to play)"
        "3S" - "6+S no minor, any strength, incl. 7132, 6313 min (3N = to play, else cues for S)"
        "3N" - "was 6313 max"
    }
    "3C" - "5+H, invit+, support-ask" {
        "3D" - "2 H"
        "3H" - "0-1 H (3N = to play but had 2S when 4S was so much better, hmmm)"
        "3N" - "H fit, was 6331 min"
    }
    "3D" - "nat, F1 (3S = was 6214 [4D = was F nat no fit (5D = to play was 6124 soft)])"
    "3H" - "6+C, F1"
    "3S" - "pree (op may re-raise with 7crds)"
    "4C" - "was 5404 13"
    "4H" - "to play"
    "4S" - "to play (op can compete to 5S with 6 and dist)"
    "5S" - "asked for good trumps"

    overcall("X") {
        "XX" - "10+, says nothing about S length (will compete with 3S, later penalty X by XX'er, but does not set up a force)"
    }
    overcall("3C") {
        "X" - "was 2362 10, implies invit+ values and S tol since pd jumped to 4S with 6232 12"
    }
    overcall("3D") {
        "3H" - "nat, F"
        "3S" - "pree, was 3334"
    }
    overcall("3H") {
        addBid(responder, "reopening X", "takeout but could be 2632 great H max (2N = nat assuming pd has 1543ish)")
    }

    addPassHandAdjRow()
    remark(opener, "6-12 HCP, mb 5332 at times, vul-dependent")
    overcall("X") {
        "XX" - "was 3325 11 but did not compete 3/3"
    }
    "2N" - "ask (was 4fit limit)" {
        "3S" - "mb 5332"
    }
    "3S" - "pree, was 4333 10"
}
