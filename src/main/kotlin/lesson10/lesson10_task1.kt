package lesson10

fun main() {
    val minNumber = 1
    val maxNumber = 6

    println("Player's turn:")
    val playerRoll = rollDice(minNumber, maxNumber)
    println("Player rolled: $playerRoll")

    println("Computer's turn:")
    val computerRoll = rollDice(minNumber, maxNumber)
    println("Computer rolled: $computerRoll")

    when {
        playerRoll > computerRoll -> println("Humanity wins!")
        computerRoll > playerRoll -> println("The machine wins!")
        else -> println("It's a tie!")
    }
}

fun rollDice(min: Int, max: Int): Int {
    return (min..max).random()
}