package lesson6

const val MILLISECONDS_PER_SECONDS = 1000

fun main() {
    println("How many seconds do I need to register?")
    val seconds = readln().toInt()

    Thread.sleep((seconds * MILLISECONDS_PER_SECONDS).toLong())

    println("$seconds seconds have passed")
}