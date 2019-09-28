enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun main() {
    var choice = Color.INDIGO
    when (choice) {
        Color.BLUE -> println("Blue")
        Color.RED -> println("Red")
        Color.GREEN -> println("Green")
        Color.ORANGE -> println("Orange")
        Color.YELLOW -> println("Yellow")
        Color.VIOLET -> println("Violet")
        Color.INDIGO -> println("Indigo")
        else -> println("No Color")
    }
}
