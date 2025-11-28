package lesson2

const val TOTAL_PERCENT = 100

fun main() {
    val years = 20.0
    val deposit = 70000
    val percentageRate = 16.7

    val futureValue = deposit * Math.pow(1 + percentageRate / TOTAL_PERCENT, years)

    println(String.format("%.3f", futureValue))
}