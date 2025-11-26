package lesson2

const val MINUTES_PER_HOUR = 60

fun main() {
    val routeStartHours = 9
    val routeStartMinutes = 39
    val routeTimeMinutes = 457

    val finishTimeInMinutes = routeStartHours * MINUTES_PER_HOUR + routeStartMinutes + routeTimeMinutes

    val finishTimeHours = finishTimeInMinutes / MINUTES_PER_HOUR
    val finishTimeMinutes = finishTimeInMinutes % MINUTES_PER_HOUR

    val finishTime = String.format("%02d:%02d", finishTimeHours, finishTimeMinutes)

    println(finishTime)
}