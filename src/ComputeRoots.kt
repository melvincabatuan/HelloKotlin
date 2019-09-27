import kotlin.math.sqrt

fun main() {
    println("Compute the roots of ax^2 + bx + c = 0")
    println("Input a = ")
    val a = readLine()!!.toDouble()
    println("Input b = ")
    val b = readLine()!!.toDouble()
    println("Input c = ")
    val c = readLine()!!.toDouble()
    val x1 = (-b + sqrt(b*b - 4*a*c))/(2*a)
    val x2 = (-b - sqrt(b*b - 4*a*c))/(2*a)
    println("The roots are $x1 and $x2.")
}