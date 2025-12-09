package lesson7

fun main() {
    val passwordLength = 6
    var password = ""

    for (i in 1..passwordLength) {
        val part = if (i % 2 == 1) ('a'..'z').random()
        else (0..9).random()
        password += part
    }
    println(password)
}