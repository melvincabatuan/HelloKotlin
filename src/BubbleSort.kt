import java.util.*

fun bubbleSort(A: Array<Int>) {
    for (i in 0 until A.size-1){
        for (j in 0 until A.size-i-1){
            if (A[j]>A[j+1]){
                val temp = A[j]
                A[j] = A[j+1]
                A[j+1] = temp
            }
        }
    }
}


fun main() {
    val myArray = arrayOf(70, 60, 30, 80, 50, 90)
    print("The sorted of ${Arrays.toString(myArray)} is ")
    bubbleSort(myArray)
    println("${Arrays.toString(myArray)}")
}