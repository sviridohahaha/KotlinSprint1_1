package lesson6

fun main() {
    println("How many seconds do I need to register?")
    val seconds = readln().toInt()
    var secondsForTimer = seconds

    while (secondsForTimer > 0) {
        Thread.sleep(1000)
        secondsForTimer--
    }
    println("$seconds seconds have passed")
}