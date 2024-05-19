package com.github.phisgr.bridge

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter
import java.io.File
import java.io.Writer

private val jsonFactory = JsonFactory()
    .disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET)
    .disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)


fun BiddingSystem.writeTo(writer: Writer) {
    toJson(
        jsonFactory
            .createGenerator(writer)
            .setPrettyPrinter(MinimalPrettyPrinter())
    )
}

fun BiddingSystem.writeTo(file: File) {
    file.bufferedWriter().use(::writeTo)
}

private val htmlWithoutSystem: Triple<String, String, String> by lazy {
    val html = BiddingSystem::class.java.classLoader.getResource("template.html")!!.readText()
    val systemSplit = html.split("""{name:"dummy",author:"file",description:"to be replaced",nextBids:[]}""")
    check(systemSplit.size == 2)
    val titleSplit = systemSplit[0].split("<title>bridge-system-viewer</title>")
    check(titleSplit.size == 2)
    Triple(titleSplit[0], titleSplit[1], systemSplit[1])
}

fun BiddingSystem.writeHtml(file: File) {
    val escapedTitle = name
        .replace("&", "&amp")
        .replace("<", "&lt")
        .replace(">", "&gt")

    file.bufferedWriter().use {
        val (beforeTitle, beforeSystem, after) = htmlWithoutSystem
        it.write(beforeTitle)
        it.write("<title>")
        it.write(escapedTitle)
        it.write("</title>")
        it.write(beforeSystem)
        writeTo(it)
        it.write(after)
    }
}

// Creating a JSON AST only to convert that to String is wasteful.
fun BiddingSystem.toJson(jsonGenerator: JsonGenerator) {
    jsonGenerator.writeStartObject()

    jsonGenerator.writeStringField("name", name)
    jsonGenerator.writeStringField("author", author)
    jsonGenerator.writeStringField("description", description)

    jsonGenerator.writeFieldName("nextBids")
    nextBids.toJson(jsonGenerator)

    jsonGenerator.writeEndObject()
    jsonGenerator.flush()
}

private fun BiddingTree.toJson(jsonGenerator: JsonGenerator) {
    jsonGenerator.writeStartObject()

    val bid = previousBids.last()
    jsonGenerator.writeStringField("bid", bid.bid)
    jsonGenerator.writeStringField("by", bid.bidder.toString())

    jsonGenerator.writeStringField("meaning", meaning)

    if (explanation != "") {
        jsonGenerator.writeStringField("explanation", explanation)
    }
    if (nextBids.isNotEmpty()) {
        jsonGenerator.writeFieldName("nextBids")
        nextBids.toJson(jsonGenerator)
    }

    jsonGenerator.writeEndObject()
}

private fun List<BiddingTree>.toJson(jsonGenerator: JsonGenerator) {
    jsonGenerator.writeStartArray()
    forEach { it.toJson(jsonGenerator) }
    jsonGenerator.writeEndArray()
}
