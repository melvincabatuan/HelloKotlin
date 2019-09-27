

fun main() {
    print("Enter your name: ")
    val input = readLine()
    println("Hello $input")
    print("How old are you?")
    val age = readLine()!!.toInt()  // !! non-null assert
    println("You are $age yrs. old.")
}