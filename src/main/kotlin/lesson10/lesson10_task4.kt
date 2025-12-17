package lesson10

fun main() {
    val minNumber = 1
    val maxNumber = 6
    var userWins = 0
    var continuePlaying: String

    do {
        if (playRound(minNumber, maxNumber) == "user") userWins++
        println("Do you want to roll the dice again? yes/no")
        continuePlaying = readln()
    } while (continuePlaying == "yes")

    println("You won $userWins times!")
}

fun rollDice(min: Int, max: Int): Int {
    return (min..max).random()
}

fun playRound(minNumber: Int, maxNumber: Int): String {
    var winner = ""

    println("Player's turn:")
    val playerRoll = rollDice(minNumber, maxNumber)
    println("Player rolled: $playerRoll")

    println("Computer's turn:")
    val computerRoll = rollDice(minNumber, maxNumber)
    println("Computer rolled: $computerRoll")

    when {
        playerRoll > computerRoll -> {
            println("Humanity wins!")
            winner = "user"
        }

        computerRoll > playerRoll -> println("The machine wins!")
        else -> println("It's a tie!")
    }
    return winner
}