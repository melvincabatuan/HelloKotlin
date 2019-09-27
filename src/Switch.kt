import java.util.*

fun main() {
    var choice = Random().nextInt(8)
    var food = ""
    when (choice) {
        0 -> food = "adobo"
        1 -> food = "kare-kare"
        2 -> food = "sisig"
        3 -> food = "kinilaw"
        4 -> food = "lechon"
        5 -> food = "bulalo"
        else -> food = "chicken"
    }
    println("I love to eat $food.")
}