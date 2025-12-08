package lesson7

fun main() {
    println("How many seconds do I need to register?")
    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("Seconds left: $i")
        Thread.sleep(1000)
    }

    println("Time's up!")
}