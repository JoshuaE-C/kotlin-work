// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

//s=0.5*(a+b+c)
//A=sqrt(s*(s-a)*(s-b)*(s-c))


fun main(args: Array<String>) {
    
    val a = args[0].toFloat()
    val b = args[1].toFloat()
    val c = args[2].toFloat()
    var s = 0.5*(a+b+c)
    var area = sqrt(s*(s-a)*(s-b)*(s-c))

    println("Area = %.5f".format(area))
}