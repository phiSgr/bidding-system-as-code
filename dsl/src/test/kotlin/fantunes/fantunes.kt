package fantunes

import com.github.phisgr.bridge.BiddingSystem
import com.github.phisgr.bridge.writeHtml
import java.io.File

fun main() {
    val system = BiddingSystem {
        name = "Fantoni-Nunes"
        author = "Dan Neill"
        description =
            """[Original notes](https://bridgewithdan.com/wp-content/uploads/2019/07/Fantoni_Nunes.txt) by [Dan Neill](https://bridgewithdan.com/).
              |
              |Upgrade often.\
              |2-bid openers will often bid again where a std. weak two bidder could not,
              |e.g. after being raised or with extra length,
              |or with a takeout double if short in the opponents' suit.\
              |2/1 GF (2C 3-way), unless opener has 5-4+ majors.\
              |Third/Fourth Seat - 2-bids are (6)8-12 (mb 5332 or 5-4 majors) with nat responses,
              |1-bids 13+, 2/1 not GF, 4-level pree vul-appropriate
              |
              |X/XX by wide-range hand (that has already bid previously)
              |shows cards while bids all show minimums, even jumps.\
              |X by 0-9 hand later is takeout.\
              |Most all other doubles are takeout.""".trimMargin()

        "1C" - "15+ balanced (4333/4432/5m332), or 14+ value 5+C/444-1red, F1" { oneClub() }
        "1D" - "14+ value 5+D or 444-1black, F1" { oneDiamond() }
        "1H" - "14+ value 5+H (12+ if 4S), F1, may have 6H-5S, 5H-6m" { oneHeart() }
        "1S" - "14+ value 5+S (12+ if 4+H), F1" { oneSpade() }
        "1N" - "12-14 (11+ NV), all 5422's included except both M's, 6m ok, all 4441's included (!)" { oneNoTrump() }
        "2C" - "10-13 value, 5C-4other unbalanced, or 6+C (5C-5S, 5H-6C has opened 2C before)" { twoClubs() }
        "2D" - "10-13 value, 5D-4M/4+m unbalanced, or 6+D" { twoDiamonds() }
        "2H" - "10-13 value, 5H-4+m unbalanced, or 6+H" { twoHearts() }
        "2S" - "10-13 value, 5S-4+m unbalanced, or 6+S" { twoSpades() }
        "2N" - "21-22 bal" { twoNoTrump() }
        "3C" - {
            "3S" - "F1 (4red = cue with S fit)"
            "games" - "to play"
        }
        "3D" - {
            "(X) 3H" - "was nat"
        }
        "3S" - {
            "4C" - "likely ART slamtry S because had no C or D ctrl"
        }
        "3N" - "solid 7+crd minor nothing much else"

        defensive()
        slamBidding()
        general()
    }
    val file = File("build", "fantunes.html")
    system.writeHtml(file)
    println("Written HTML to ${file.absolutePath}")
}
