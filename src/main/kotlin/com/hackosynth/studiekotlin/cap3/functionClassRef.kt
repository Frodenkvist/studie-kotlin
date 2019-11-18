package com.hackosynth.studiekotlin.cap3

fun main() {
    val bar = SuperClass()

    println(bar.add2(5))
    println(increaseBy2(5))
    println()
    println(SuperClass.add5(5))
    println(increaseBy5(5))
}

val foo = SuperClass()
val increaseBy2: (Int) -> Int = foo::add2
val increaseBy5: (Int) -> Int = (SuperClass)::add5

class SuperClass {
    companion object {
        fun add5(x: Int) = x + 5
    }

    fun add2(x: Int) = x + 2
}
