package com.hackosynth.studiekotlin.cap2

fun main() {
    val sum = Util.add(10, 20)
    val message = Util.getMessage()

    println("the message is: $message, the sum is: $sum")
}

object Util {
    fun add(x: Int, y: Int) = x + y

    fun getMessage() = "A funny message"
}