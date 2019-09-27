import java.util.*


fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}


fun hello(){
    println("Hello po! It's a beautiful ${randomDay()} morning!")
}


fun main(){
    hello()
}

