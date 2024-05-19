package fantunes

import com.github.phisgr.bridge.Bidder
import com.github.phisgr.bridge.BiddingSystem

fun BiddingSystem.slamBidding() = addBid(Bidder.S, "SLAM BIDDING", "") {
    explanation = """
### Negative 3N

3N cue shows minimum after major set as trumps, bypassing shows extras (unless signing off)

### Cue-bidding

Cue up the line: bypassing a suit denies 1/2 rd control (don't cue shortness in pd's length)
 - if partner does not immediately sign off after a cue is denied, it promises control of that suit
 - if there is just one cue left below game, and a suit has been bypassed, it merely shows control of the bypassed suit

Repeating a cue guarantees 1st rd control but need not have 2nd

Bypassing a cue and then cue-bidding it later shows the Queen (or maybe doub too not sure)

### Turbo 4N/5N

in cue-bidding, 4N just shows even # of KC's and bypassing shows odd

if clubs is trumps, 4D is Turbo, not 4N

5N involves the Queen - bypassing shows the Queen, bidding 5N denies the Queen (exception if minor trump below)
 - over 5N, pd once bid 6D (cue) without the trump Q but with the J

if minor is already set as trump
 - 4m is Turbo for the Queen of trumps (bypass shows Queen)

If a cue is doubled
 - XX by either side shows 1st rd ctrl
 - Pass of doubled cue-bid was 2nd rd control once
 - Bidding immediately over doubled cue-bid was no control twice (alerted)

### RKC
(rare) Jump to 4NT in fit auction is RKC
"""
}

fun BiddingSystem.general() = addBid(Bidder.S, "GENERAL", "") {
    explanation = """
If opponents cue-bid our overcall, X by either side asks for different lead.
Over X of our preemptive (weak) opening/overcall, new suit may be lead direct.

### SPECIAL ARTIFICIAL AND COMPETITIVE DOUBLES/REDOUBLES

A DBL in our side suit when it's not important to engage a competitive auction
discourage lead in that suit; in the same situation PASS
encourage lead in that suit; [note: even when a double could mean a raise, it's not]

We play two-way doubles in some situations: i.e. 4?-X, 1?-4?-X, NEVER at
low level;

In forcing game situations opener's double often shows minimum and BAL/SEMIBAL hands;

We play splinter double: a double of an opponent's splinter bid send the
message "Do not make your normal lead, i.e. in dummy's fragment suit";
"""
}
