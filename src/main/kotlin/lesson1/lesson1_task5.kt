package lesson1

fun main() {

    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60

    val secondsRemaining = seconds % 60
    val minutesRemaining = minutes % 60

    var hoursForTimer: String = if (hours < 10) "0$hours" else "$hours"
    var minutesForTimer: String = if (minutesRemaining < 10) "0$minutesRemaining" else "$minutesRemaining"
    var secondsForTimer: String = if (secondsRemaining < 10) "0$secondsRemaining" else "$secondsRemaining"

    println("$hoursForTimer:$minutesForTimer:$secondsForTimer")
}