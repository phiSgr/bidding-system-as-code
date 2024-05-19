package com.github.phisgr.bridge

/**
 * AKA denomination
 */
sealed interface Strain {
    val fullName: String
        get() = when (this) {
            N -> "notrump"
            C -> "club"
            D -> "diamond"
            H -> "heart"
            S -> "spade"
        }
}

sealed interface Suit : Strain, Comparable<Suit> {
    val prev: Suit get() = SUITS[(index() + 3) % 4]
    val next: Suit get() = SUITS[(index() + 1) % 4]
    override operator fun compareTo(other: Suit): Int =
        compareValuesBy(this, other, Suit::index)

    /**
     * shorthand for creating pairs to pass to [distribution]
     */
    operator fun times(length: Int): Pair<Suit, Int> = Pair(this, length)

    val fullNamePlural: String get() = "${fullName}s"
}

data object N : Strain
sealed interface Red : Suit {
    companion object {
        val suits: List<Red> get() = listOf(D, H)
    }
}

sealed interface Major : Suit {
    companion object {
        val suits: List<Major> get() = listOf(H, S)
    }

    /**
     * The red suit below this major
     */
    val red: Red get() = prev as Red
    val correspondingMinor: Minor get() = Minor.suits[index() - 2]
}

sealed interface Minor : Suit {
    companion object {
        val suits: List<Minor> get() = listOf(C, D)
    }

    val correspondingMajor: Major get() = Major.suits[index()]
}

data object S : Major
data object H : Major, Red
data object D : Minor, Red
data object C : Minor

fun other(major: Major): Major = (Major.suits - major).single()

fun other(minor: Minor): Minor = (Minor.suits - minor).single()

val SUITS: List<Suit> = Minor.suits + Major.suits
val STRAINS: List<Strain> = SUITS + N

private fun Suit.index(): Int = when (this) {
    C -> 0
    D -> 1
    H -> 2
    S -> 3
}

/**
 * shorthand for creating pairs to pass to [distribution]
 * See [Suit.times]
 */
operator fun Int.times(suit: Suit) = suit * this
