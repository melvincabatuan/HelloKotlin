fun main() {
    var pi_4 = 0.0
    var alt = 1.0
    var count = 0
    for (i in 1..20000){
        if (i % 2 == 1){
            pi_4 += (alt / i)
            //print("$alt/$i+")
            alt = -alt
            count++
        }
    }
    val pi = 4.0*pi_4
    println("pi is approximately = $pi, with $count terms.")
}