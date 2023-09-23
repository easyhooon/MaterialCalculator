package com.kenshi.materialcalculator.domain

import java.lang.IllegalArgumentException

enum class Operation(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    Multiply('x'),
    DIVIDE('/'),
    PERCENT('%'),
}

val operationSymbols = Operation.values().map { it.symbol }.joinToString("")

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid symbol")
}