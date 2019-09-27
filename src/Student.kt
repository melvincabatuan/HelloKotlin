class Student (var id: Int = 11111111, var name: String = "Juan Dela Cruz", var age: Int = 18) {
        init {
            println("student enrolling")
        }

    val id_age: Int
        get() = id + age

}