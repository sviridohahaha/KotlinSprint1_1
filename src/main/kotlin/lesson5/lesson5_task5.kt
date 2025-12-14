package lesson5

fun main() {
    val numberOfWinningNumbers = 3
    val randomNumber = 0..42
    val winningNumbers = mutableSetOf<Int>()
    val userNumbers = mutableSetOf<Int>()

    println("Welcome to the lottery game!")
    println("Please enter $numberOfWinningNumbers numbers between 0 and 42:")

    for (i in 1..numberOfWinningNumbers) winningNumbers.add(randomNumber.random())

    for (i in 1..numberOfWinningNumbers) userNumbers.add(readln().toInt())

    val matchedNumbers = winningNumbers.intersect(userNumbers)

    when (matchedNumbers.size) {
        numberOfWinningNumbers -> println("Congratulations! You've guessed all the numbers! You win the jackpot!")
        2 -> println("Great! You've guessed two numbers and won a big prize!")
        1 -> println("You've guessed one number! You win a consolation prize!")
        0 -> println("Sorry, you didn't guess any numbers.")
    }

    println("The winning numbers are: ${winningNumbers.joinToString()}.")
}