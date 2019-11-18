package com.hackosynth.studiekotlin.cap2

fun main() {
    val animal = Animal(10)
    val cat = Cat(10, true)

    animal.makeSound()
    cat.makeSound()

    println(animal)
    println(cat)
}

open class Animal constructor(val age: Int) {
    protected var dead: Boolean

    init {
        dead = randomDead()
    }

    open fun makeSound() {
        println("no sound...")
    }

    private fun randomDead(): Boolean {
        return Math.random() > 0.5
    }

    override fun toString(): String {
        return "age: $age, dead: $dead"
    }
}

class Cat(age: Int, val indoor: Boolean) : Animal(age) {
    override fun makeSound() {
        if(dead) {
            println("...")
        } else {
            println("Meow")
        }
    }

    override fun toString(): String {
        return "${super.toString()}, indoor: $indoor"
    }
}
