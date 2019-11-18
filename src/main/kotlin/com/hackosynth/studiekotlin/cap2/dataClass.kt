package com.hackosynth.studiekotlin.cap2

fun main() {
    val vector = addVectors(listOf(Vector3D(1, 2, 3), Vector3D(5, 4, 3), Vector3D(7, 5, 3)))

    println(vector)
}

fun addVectors(vectors: List<Vector3D>): Vector3D {
    var xSum = 0
    var ySum = 0
    var zSum = 0

    for((x, y, z) in vectors) {
        xSum += x
        ySum += y
        zSum += z
    }

    return Vector3D(xSum, ySum, zSum)
}

data class Vector3D(
        val x: Int,
        val y: Int,
        val z: Int
)
