package lesson_12

class WeatherToday(kelvinDayTemperature: Int, kelvinNightTemperature: Int, precipitations: Boolean) {

    var dayTemperature = kelvinDayTemperature - CELSIUS_TO_KELVIN
    var nightTemperature = kelvinNightTemperature - CELSIUS_TO_KELVIN
    var precipitation = precipitations

    fun printWeatherInfo() {
        val precipitationStatus = if (precipitation) "There was precipitation"
        else "No precipitation"

        println("Day temperature: $dayTemperature°C. Night temperature: $nightTemperature°C. $precipitationStatus.")
    }

    init {
        printWeatherInfo()
    }
}

fun main() {
    val weather = WeatherToday(298, 287, false)
}