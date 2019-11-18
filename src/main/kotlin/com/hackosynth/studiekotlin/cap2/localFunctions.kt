package com.hackosynth.studiekotlin.cap2

fun main() {
    val number = 5

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    fun isDivisibleByThree(x: Int) = x % 3 == 0

    fun addNumber(x: Int) = x + number

    println(list.filter(::isDivisibleByThree).map(::addNumber).sum())
}