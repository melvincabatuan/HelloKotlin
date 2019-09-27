

fun greet(place: String = "World"){
    println("Hello $place!")
}

fun main(){
    greet()
    greet("Universe")
    greet("Philippines")
}