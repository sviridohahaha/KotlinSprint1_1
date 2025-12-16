package lesson10

fun main() {
    println("Enter your username:")
    val username = readln()

    println("Enter your password:")
    val password = readln()

    if (!validateLength(username) || !validateLength(password)) {
        println("Username or password is too short")
    } else {
        println("Welcome to the application!")
    }
}

fun validateLength(input: String): Boolean {
    return input.length >= 4
}