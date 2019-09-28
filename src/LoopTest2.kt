fun main() {
    val numbers = arrayOf(1,2,3,4,5)
    numbers.forEach { item -> println(item*item) }
    var sum = numbers.sum()
    print("sum = $sum")
}