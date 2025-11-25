package lesson1

fun main() {
    val secondsPerMinute = 60
    val minutesPerHour = 60
    val seconds = 6480
    val minutes = seconds / secondsPerMinute
    val hours = minutes / minutesPerHour

    val secondsRemaining = seconds % 60
    val minutesRemaining = minutes % 60

    val time = String.format("%02d:%02d:%02d", hours, minutesRemaining, secondsRemaining)

    println(time)
}