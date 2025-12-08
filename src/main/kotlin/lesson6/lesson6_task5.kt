package lesson6

fun main() {
    var attempts = 3

    while (attempts > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        println("How much is $number1 + $number2?")
        if (number1 + number2 == readln().toInt()) {
            println("Welcome!")
            attempts = 0
        } else {
            println("It's wrong!")
            attempts--
            if (attempts == 0) println("Access is denied!")
        }
    }
}