package lesson10

const val USERNAME = "admin"
const val PASSWORD = "password123"

val cartItems = listOf("Laptop", "Phone", "Headphones", "Tablet")

fun main() {
    println("Enter username:")
    val username = readln()

    println("Enter password:")
    val password = readln()

    val token = authorize(username, password)

    if (token != null) {
        println("Authorization successful! Your token is: $token")
        val cart = getCart(token)
        if (cart != null) println("Your shopping cart contains: ${cart.joinToString(", ")}")
    } else {
        println("Invalid login or password. Access denied.")
    }
}

fun generateToken(): String {
    val upperCaseLetters = 'A'..'Z'
    val lowerCaseLetters = 'a'..'z'
    val digits = '0'..'9'

    val allCharacters = upperCaseLetters + lowerCaseLetters + digits

    val token = mutableListOf<Char>()

    for (i in 1..32) token.add(allCharacters.random())

    return token.joinToString("")
}

fun authorize(username: String, password: String): String? {
    return if (username == USERNAME && password == PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): List<String>? {
    return if (token != null) {
        cartItems
    } else {
        null
    }
}