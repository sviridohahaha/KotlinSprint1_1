package lesson5

const val USERNAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("I'm glad to welcome you aboard our spaceship \"Heart of Gold\"!!!")
    println("Enter your username:")

    val username = readln()

    if (username != USERNAME) {
        println("Let's register! Enter your username:")
        val login = readln()
        println("Enter your password:")
        val password = readln()
        println("User $login registered successfully!")
    } else {
        println("Enter your password:")
        if (readln() == PASSWORD) println("User $USERNAME, you are allowed to board the spaceship \"Heart of Gold\"!")
        else println("Sorry, your password is incorrect")
    }
}