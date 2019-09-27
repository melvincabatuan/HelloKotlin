fun main() {
    while (true){
        print("Input an integer: ")
        val x = readLine()!!.toInt()
        if (x % 2 == 0){
            println("The number is even")
        }
        else {
            println("The number is odd")
        }
        if (x == 0) break
    }
}