package lesson7

fun main() {
    var passwordLength: Int
    do {
        println("Enter the password length (minimum 6 characters):")
        passwordLength = readln().toInt()
        if (passwordLength < 6) println("Password length must be at least 6 characters. Please try again:")
    } while (passwordLength < 6)

    val uppercaseLetters = 'A'..'Z'
    val lowercaseLetters = 'a'..'z'
    val numbers = '0'..'9'
    val randomCharacters = uppercaseLetters + lowercaseLetters + numbers

    val password = mutableListOf<Char>()
    password += uppercaseLetters.random()
    password += lowercaseLetters.random()
    password += numbers.random()

    repeat(passwordLength - 3) {
        password += randomCharacters.random()
    }

    password.shuffle()

    println("Your password: ${password.joinToString("")}")
}