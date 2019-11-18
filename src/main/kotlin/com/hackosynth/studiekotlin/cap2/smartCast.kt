package com.hackosynth.studiekotlin.cap2

fun main() {
    val shapes: List<Shape> = listOf(Rectangle(10, 5), Circle(5))

    for(shape in shapes) {
        if(shape is Rectangle) {
            println("X: ${shape.x}, Y: ${shape.y}")
        } else if(shape is Circle) {
            println("R: ${shape.r}")
        }
    }
}

abstract class Shape

class Rectangle(val x: Int, val y: Int): Shape()
class Circle(val r: Int): Shape()