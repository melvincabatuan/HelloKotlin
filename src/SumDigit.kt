fun main() {
    println("Compute the sum of the digits of a number.")
    println("Input an integer")
    var num = readLine()!!.toInt()
    var sum = 0
    while(num > 0){
        sum += num % 10
        num = num / 10
    }
    println("The sum is $sum.")
}