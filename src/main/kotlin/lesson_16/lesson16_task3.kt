package lesson_16

class User(val login: String, private val password: String) {
    fun validatePassword(inputPassword: String) = inputPassword == password
}

fun main() {
    val user = User("Travolta", "Swordfish2001")

    println("Please enter your password:")
    val inputPassword = readln()

    if (user.validatePassword(inputPassword)) println("Password is correct.")
    else println("Incorrect password.")
}