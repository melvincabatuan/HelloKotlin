fun binarySearch(A: Array<Int>, key: Int): Int {
    var loc = -1
    var i = 0
    var j = A.size - 1
    while (i < j) {
        val mid = (i+j)/2
        if(A[mid] < key)
            i = mid + 1
        else
            j = mid
    }
    if (A[i] == key)
        loc = i
    return loc
}

fun main() {
    val myArray = arrayOf(10, 20, 30, 40, 60, 80, 90, 110, 150, 180)
    val firstQuery = 180
    val secondQuery = 200
    println("Location of $firstQuery is ${binarySearch(myArray, firstQuery)}")
    println("Location of $secondQuery is ${binarySearch(myArray, secondQuery)}")
}