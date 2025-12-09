package lesson6

fun main() {
    println("How many seconds do I need to register?")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Seconds left: $seconds")
        Thread.sleep(1000)
        seconds--
    }
    println("Time's up!")
}