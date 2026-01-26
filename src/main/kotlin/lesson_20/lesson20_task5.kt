package lesson_20

import kotlin.random.Random

class Robot {
    val phrases = listOf(
        "Hello, how are you?",
        "I am a robot, and I love playing FIFA",
        "It is a nice day to play a few games!",
        "I prefer to play for \"Atletico\" Madrid",
        "I will win you!"
    )

    var currentPhrase = phrases[Random.nextInt(phrases.size)]

    fun say() = println(currentPhrase)

    fun setModifier(modifier: (String) -> String) {
        currentPhrase = modifier(currentPhrase)
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier { phrase -> phrase.split(" ").reversed().joinToString(" ") }
    robot.say()
}
