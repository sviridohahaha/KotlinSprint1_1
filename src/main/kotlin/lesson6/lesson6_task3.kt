package lesson6

fun main() {
    println("How many seconds do I need to register?")
    val seconds = readln().toInt()
    var secondsForTimer = seconds

    while (secondsForTimer > 0) {
        println("Seconds left: $secondsForTimer")
        Thread.sleep(1000)
        secondsForTimer--
    }
    println("Time's up!")
}