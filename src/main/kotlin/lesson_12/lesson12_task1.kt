package lesson_12

class WeatherDay {
    var dayTemperature = 0.0
    var nightTemperature = 0.0
    var precipitation = false

    fun printWeatherInfo() {
        val precipitationStatus = if (precipitation) "There was precipitation"
        else "No precipitation"

        println("Day temperature: $dayTemperature degrees. Night temperature: $nightTemperature degrees. $precipitationStatus.")
    }
}

fun main() {
    val weather1 = WeatherDay()
    weather1.dayTemperature = 23.7
    weather1.nightTemperature = 11.2

    val weather2 = WeatherDay()
    weather2.dayTemperature = 18.4
    weather2.nightTemperature = 10.1
    weather2.precipitation = true

    weather1.printWeatherInfo()
    weather2.printWeatherInfo()
}