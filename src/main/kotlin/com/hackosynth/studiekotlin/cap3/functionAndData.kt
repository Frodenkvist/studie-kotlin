package com.hackosynth.studiekotlin.cap3

fun main() {
    println(square(5))
    println(squareVal(3))
}

fun square(x: Int): Int = x * x
val squareVal: (Int) -> Int = { x -> x * x }
