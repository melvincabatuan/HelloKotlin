fun main() {
    println("Input an integer:")
    val first = readLine()!!.toInt()
    println("Input another integer:")
    val second = readLine()!!.toInt()
    println("Input the last integer")
    val third = readLine()!!.toInt()
    val sum = first + second + third

    println("The sum is $sum.")
}