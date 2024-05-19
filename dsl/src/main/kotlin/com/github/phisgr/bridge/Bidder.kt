package com.github.phisgr.bridge

enum class Bidder {
    S, N, E, W;

    val next
        get() = when (this) {
            S, W -> N
            N, E -> S
        }
    val nextOpponent
        get() = when (this) {
            S, E -> W
            N, W -> E
        }
    val isOpponent
        get() = when (this) {
            N, S -> false
            E, W -> true
        }
}
