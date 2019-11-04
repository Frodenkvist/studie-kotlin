package com.hackosynth.studiekotlin

fun main() {
    val month = 2

    val monthName = if(month < 1 || month > 12) {
        "wrong month"
    } else {
        getMonthName(month)
    }

    println(monthName)
}

fun getMonthName(month: Int): String {
    val name = when(month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Not a month"
    }

    return name
}