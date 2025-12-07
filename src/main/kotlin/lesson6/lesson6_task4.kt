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
/*
Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9. Игроку дается
5 попыток, чтобы угадать это число.
 – если игрок угадывает число, выводится сообщение “Это была великолепная игра!” и программа завершает
 работу;
 – если не угадывает, то отображается "Неверно" или что-то на твое усмотрение и оставшееся количество
 попыток;
 – после истечения попыток выводится сообщение “Было загадано число N”.
 */