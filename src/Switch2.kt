import java.util.*

fun getFood(choice: Int): String {
    return when (choice) {
        0 -> "adobo"
        1 -> "kare-kare"
        2 -> "sisig"
        3 -> "kinilaw"
        4 -> "lechon"
        5 -> "bulalo"
        else -> "chicken"
    }
}

fun main() {
    var choice = Random().nextInt(8)
    print("I love to eat ${getFood(choice)}")
}