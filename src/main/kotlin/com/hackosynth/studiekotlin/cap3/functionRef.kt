package com.hackosynth.studiekotlin.cap3

fun main() {
    println(triple(3))
    println(multiBy3(3))
}

fun triple(x: Int) = x * 3
val multiBy3: (Int) -> Int = ::triple
