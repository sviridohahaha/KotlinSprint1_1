package lesson6

fun main() {
    val winningNumber = (1..9).random()
    var attempts = 5

    while (attempts > 0) {
        println("Enter a number")
        val number = readln().toInt()
        if (number == winningNumber) {
            println("It was a great game!")
            attempts = 0
        } else {
            attempts--
            println("Wrong! Remaining number of attempts: $attempts")
            if (attempts == 0) println("The number $winningNumber was conceived")
        }
    }
}