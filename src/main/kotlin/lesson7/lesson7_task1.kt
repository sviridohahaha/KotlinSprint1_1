package lesson7

fun main() {
    val passwordLength = 6
    var password = ""
    val letter = ('a'..'z')
    val number = (0..9)

    for (i in 1..passwordLength) {
        val part = if (i % 2 == 1) letter.random()
        else number.random()
        password += part
    }
    println(password)
}