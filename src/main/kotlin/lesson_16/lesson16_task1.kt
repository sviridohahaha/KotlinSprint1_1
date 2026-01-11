package lesson_16

import kotlin.random.Random

class Dice {
    private val number = Random.nextInt(1,7)

    fun roll() = println("The number rolled on the dice: $number")
}

fun main() {
    val dice = Dice()

    dice.roll()
}