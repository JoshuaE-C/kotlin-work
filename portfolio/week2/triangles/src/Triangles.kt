// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double> (3,4,5)

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val a = triangle.first + triangle.second
    val b = triangle.second + triangle.third
    val c = triangle.first + triangle.third
    if(a > triangle.third && b > triangle.first && c > triangle.second) {
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    val a = triangle.first
    val b = triangle.second
    val c = triangle.third
    val s = 0.5*(a+b+c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    return area
}