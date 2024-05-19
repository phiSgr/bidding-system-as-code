package lebensohl

import com.github.phisgr.bridge.BiddingTree

fun BiddingTree.fourthHandApplies() {
    if (explanation != "") {
        explanation += newLine
    }
    explanation += "This scheme also applies when it is a balancing double."
}
