package lesson7

fun main() {
    var passwordLength: Int
    do {
        println("Enter the password length (minimum 6 characters):")
        passwordLength = readln().toInt()
        if (passwordLength < 6) println("Password length must be at least 6 characters. Please try again:")
    } while (passwordLength < 6)

    val password = mutableListOf<Char>()
    val uppercaseLetters = 'A'..'Z'
    val lowercaseLetters = 'a'..'z'
    val numbers = '0'..'9'
    val randomCharacters = uppercaseLetters + lowercaseLetters + numbers

    do {
        for (i in 1..passwordLength) password.add(randomCharacters.random())

    } while (password.intersect(uppercaseLetters).isEmpty() &&
        password.intersect(lowercaseLetters).isEmpty() && password.intersect(numbers).isEmpty()
    )

    println("Your password: ${password.joinToString("")}")
}