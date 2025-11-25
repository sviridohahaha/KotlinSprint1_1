package lesson1

const val SECONDS_PER_MINUTE = 60
const val MINUTES_PER_HOUR = 60

fun main() {
    val seconds = 6480
    val minutes = seconds / SECONDS_PER_MINUTE
    val hours = minutes / MINUTES_PER_HOUR

    val secondsRemaining = seconds % SECONDS_PER_MINUTE
    val minutesRemaining = minutes % MINUTES_PER_HOUR

    println(String.format("%02d:%02d:%02d", hours, minutesRemaining, secondsRemaining))
}