package com.hackosynth.studiekotlin.cap2

fun main() {
    val person = Person.createDefaultPerson()

    println(person)
}

data class Person(val age: Int, val firstName: String, val lastName: String) {
    companion object {
        fun createDefaultPerson() = Person(23, "Nisse", "Hult")
    }
}
