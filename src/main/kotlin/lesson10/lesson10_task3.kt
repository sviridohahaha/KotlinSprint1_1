package lesson10

fun main() {
    println("Enter the password length:")
    val passwordLength = readln().toInt()

    if (passwordLength < 2) {
        println("Password length is too short.")
    } else println("Your password: ${generatePassword(passwordLength)}")
}

fun generatePassword(length: Int): String {
    val digits = '0'..'9'
    val specialChars = "!\"#$%&'()*+,-./ "

    val password = mutableListOf<Char>()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.add(digits.random())
        } else {
            password.add(specialChars.random())
        }
    }
    return password.joinToString("")
}