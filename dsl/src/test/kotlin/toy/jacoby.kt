@file:Suppress("LocalVariableName", "unused")

package toy

import com.github.phisgr.bridge.BiddingSystem
import com.github.phisgr.bridge.Major

private fun BiddingSystem.jacoby() {
    "1N" - "15-17 balanced" {
        "2C" - "Stayman"

        // equivalent to writing
        // "2D" - "transfer, 5+H" { ... }
        // "2H" - "transfer, 5+S" { ... }
        Major.suits.forEach { M ->
            "2${M.red}" - "transfer, 5+$M" {
                "2$M" - {
                    "2N" - "invite to both games"
                    // ...
                }
            }
        }
    }
}

fun main() {
    BiddingSystem {
        name = "Toy"
        author = "Example"
        jacoby()
    }
}
