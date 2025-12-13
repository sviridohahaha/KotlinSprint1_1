package lesson7

fun main() {
    var passwordLength: Int
    do {
        println("Enter the password length (minimum 6 characters):")
        passwordLength = readln().toInt()
        if (passwordLength < 6) println("Password length must be at least 6 characters. Please try again:")
    } while (passwordLength < 6)

    var password: MutableList<Char>
    val uppercaseLetters = ('A'..'Z')
    val lowercaseLetters = ('a'..'z')
    val numbers = ('0'..'9')
    val randomCharacters = uppercaseLetters + lowercaseLetters + numbers

    do {
        password = mutableListOf<Char>()
        for (i in 1..passwordLength) {
            val part = randomCharacters.random()
            password.add(part)
        }
    } while (!(password.contains(uppercaseLetters.random()) &&
                password.contains(lowercaseLetters.random()) && password.contains(numbers.random()))
    )

    print("Your password: ")
    password.forEach { print(it) }
}