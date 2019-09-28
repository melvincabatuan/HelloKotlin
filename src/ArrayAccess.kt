fun access(A: Array<Int>, i:Int): Int = A[i]    // O(1)

fun main() {
    val myArray = arrayOf(10, 60, 30, 80, 10, 90)
    println(access(myArray, 2))
}