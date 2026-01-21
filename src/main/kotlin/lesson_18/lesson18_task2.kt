package lesson_18

import kotlin.random.Random

open class Die(val sides: Int) {
    open fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("$sides-sides die rolled: $result")
    }
}

class Die4 : Die(4)

class Die6 : Die(6)

class Die8 : Die(8)

fun main() {
    val diceList: List<Die> = listOf(Die4(), Die6(), Die8())

    diceList.forEach { it.roll() }
}
