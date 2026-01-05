package lesson_12

class WeatherMeasurements(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var precipitation: Boolean
) {
    fun printWeatherInfo() {
        val precipitationStatus = if (precipitation) "There was precipitation"
        else "No precipitation"

        println("Day temperature: $dayTemperature degrees. Night temperature: $nightTemperature degrees. $precipitationStatus.")
    }
}

fun main() {
    val weather = WeatherMeasurements(3.2, -4.6, true)

    weather.printWeatherInfo()
}