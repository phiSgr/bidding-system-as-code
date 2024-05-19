# Bridge System DSL

This DSL aims to provide a natural, concise, expressive syntax
for defining bridge bidding systems.
This is possible thanks to three Kotlin features:
[extension functions](https://kotlinlang.org/docs/reference/extensions.html),
[operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html) and
[lambdas with receiver](https://kotlinlang.org/docs/reference/lambdas.html#function-literals-with-receiver).

Additionally, [Kotlin's trailing lambda syntax](https://kotlinlang.org/docs/lambdas.html#passing-trailing-lambdas)
makes writing in this DSL almost as clean as writing in plain text.

### Lambdas with Receiver

Receiver lambdas and extension functions provide a dynamic `this` within their scope.
This allows context to be implicitly tracked.
They have been used with great success in building nested data structures
like [HTML](https://github.com/Kotlin/kotlinx.html)
and [user](https://developer.android.com/compose) [interfaces](https://github.com/edvin/tornadofx).

A bidding system is inherently a tree.
Every bid branches into multiple continuations depending on what came before.
The same strength that lets Kotlin DSLs build complex layouts
will help you to cleanly describe your bidding system.

### Operator Overloading

This DSL defines a `minus` operator for `String`.
Writing `"2C" - "Stayman"` adds the bid and its meaning to
the bidding tree at the current level.

A [block of code](#lambdas-with-receiver) that further describes the bidding tree can also be added.

```kotlin
"2C" - "Stayman" {
    "2D" - "no 4cM" {
        "2M" - "5M4OM inv"
        // ...
    }
    // ...
}
```

### Readability for Deep Sequences

Deep in the bidding tree, it can be difficult to see who the bidder is
when all you see is `"bid" - "meaning" {`.
The DSL provides `opener` and `responder` infix functions
as alternatives to `-`.

The above example can be equivalently written as:

```kt
"2C" - "Stayman" {
    "2D" opener "no 4cM" {
        "2M" responder "5M4OM inv"
        // ...
    }
    // ...
}
```

It is definitely more verbose[^1], so I recommend using them
only when the bidding is deep inside artificial sequences.
This is only about the source code readability,
and has no effect on the JSON/HTML output.

If you got the bidder wrong,
say changing the `responder` above to `opener`,
you'll get `Exception in thread "main" java.lang.IllegalArgumentException: It is not South's turn to bid.`[^2]

[^1]: I have considered using other operators like `/` and `%`,
but they don't help with readability at all.

[^2]: The utility functions all assume South is the opener/overcaller.

## Developing your System

Add the `"com.github.phisgr:bidding-system-as-code:0.0.0"` dependency with your favourite build tool.

To build an all-in-one HTML file:

```kt
val system = BiddingSystem {
    name = "Your System"
    author = "Your Name"
    description = "Description in [Markdown](https://github.github.com/gfm/)."
    "1C" - "" {
        "1D" - ""
    }
}

system.writeHtml(File("build", "system.html"))
```
