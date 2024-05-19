package lebensohl


import com.github.phisgr.bridge.BiddingSystem
import com.github.phisgr.bridge.BiddingTree
import com.github.phisgr.bridge.FurtherBidding
import com.github.phisgr.bridge.writeHtml
import org.intellij.lang.annotations.Language
import java.io.File

fun BiddingTree.leb(
    slow: FurtherBidding,
    fast: FurtherBidding,
    not3C: FurtherBidding = {},
    @Language("Markdown")
    explanation: String = "",
) {
    "2N" - "Lebensohl, asks partner to bid 3C" {
        this.explanation = explanation
        "3C" - "as requested" {
            slow()
        }
        not3C()
    }
    fast()
}


fun main() {
    val system = BiddingSystem {
        name = "Comprehensive (Almost-Always Transfer) Lebensohl"
        author = "George Leung"
        description = """
            Abbreviate to CAATL and pronounce it "cattle" if you want.
            
            Some ideas are taken from https://bridgewinners.com/article/view/lebensohl-an-optimized-approach/.

            Uses transfers because at this point it's easier for me to remember than not.

            In strong auctions, if no fit is identified, and we don't have the stopper to bid 3N,
            scramble to a 7-card fit, we might stop below game.
        """.trimIndent()

        "1N" - {
            natMajorOvercall()
            bothMajorOvercall()
            majorAndDiamondOvercall()
            natDiamondOvercall()
        }
        opponentOpen("2D", "weak") {
            lebOverWeak2D()
        }
        opponentOpen("2M", meaning = "weak") {
            lebOverWeakTwo()
        }
    }


    val file = File("build", "leb.html")
    system.writeHtml(file)
    println("Written HTML to ${file.absolutePath}")
}

