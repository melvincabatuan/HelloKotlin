fun main() {
    println("Input an integer:")
    var num = readLine()!!.toInt()
    while (num > 0){
        print(num%10)
        num=num/10
    }
}