package lesson2

fun main() {
    val years = 20.0
    val deposit = 70000
    val percentageRate = 0.167

    val futureValue = deposit * Math.pow(1 + percentageRate, years)

    println(String.format("%.3f", futureValue))
}