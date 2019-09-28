import java.util.*

fun findMax(A: Array<Int>): Int {
    var max = A[0]
    for (i in 1..(A.size-1))  // Note: index starts at 0
        if (A[i] > max)
            max = A[i]
    return max
}


fun main() {
    val myArray = arrayOf(10, 60, 30, 80, 10, 90)
    println("The maximum of ${Arrays.toString(myArray)} is ${findMax(myArray)}.")
}