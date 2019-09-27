fun main(){
    var index = 0
    println("This is a while loop: ")
    while (index < 10){
        print("index = $index ; ")
        index++
    }
    println()
    println("This is a do-while loop: ")
    do{
        print("index = $index ; ")
        index --
    } while(index > 0)
    println()
    println("This is a for loop: ")
    for (i in 1..10) print("$i ")
    println()
    for (i in 10 downTo 1) print("$i ")
    println()
    for (i in 1..10 step 2) print("$i ")
    println()
    for (i in 10 downTo 1 step 2) print("$i ")
}