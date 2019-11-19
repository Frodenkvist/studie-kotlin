package com.hackosynth.studiekotlin.cap2

fun main() {
    val message1: String by lazy { getMessage() }
    println("foo1")
    val message2: String by lazy { message1 }
    println("foo2")

    println(message1)
    println(message2)
    println(message1)
    println(message2)
}

fun getMessage(): String {
    println("getting the message!")
    return "This is a message"
}