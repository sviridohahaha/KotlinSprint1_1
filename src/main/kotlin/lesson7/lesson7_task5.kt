package lesson7

fun main() {
    var passwordLength: Int
    do {
        println("Enter the password length (minimum 6 characters):")
        passwordLength = readln().toInt()
        if (passwordLength < 6)  println("Password length must be at least 6 characters. Please try again:")
    }
    while (passwordLength < 6)

    var password = ""
    val uppercaseLetters = ('A'..'Z')
    val lowercaseLetters = ('a'..'z')
    val numbers = (0..9)
    val randomCharacters = uppercaseLetters + lowercaseLetters + numbers

    for (i in 1..passwordLength) {
        val part = randomCharacters.random()
        password += part
    }

    println("Your password: $password")
}