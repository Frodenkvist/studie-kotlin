package com.hackosynth.studiekotlin.cap2

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val productList = list.filter {
        it % 2 == 0
    }.map {
        it * it
    }.fold(1) {a ,b ->
        a * b
    }

    println(productList)
}