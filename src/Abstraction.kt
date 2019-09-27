abstract class Person {
    abstract val race: String
}


interface PersonAction {
    fun eat(food: String)
}

class Filipino : Person(), PersonAction {
    override val race = "Asian"
    override fun eat(food: String) {
        println("Always eats $food.")
    }
}

fun main() {
    val me = Filipino()
    println(me.race)
    me.eat("Sushi")
}