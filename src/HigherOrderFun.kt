
fun main(){
    val x = 10
    val y = 20
    val total = { a : Int, b: Int -> a + b}
    fun getSumma(first: Int, second: Int, operation: (Int,Int) -> Int): Int {
        return operation(first, second)
    }
    println("The sum of ${x} and ${y} is ${getSumma(x,y,total)}.")
}