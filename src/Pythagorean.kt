import java.lang.Math.sqrt

fun main(){
    println("Computing Pythagorean Theorem: a^2 + b^2 = c^2")
    print("a = ")
    val a = readLine()!!.toDouble()    // !! non-null assert
    print("b = ")
    val b = readLine()!!.toDouble()
    val c =  sqrt(a*a + b*b)
    println("c = $c")
    println("$a^2 + $b^2 = $c^2")
}
