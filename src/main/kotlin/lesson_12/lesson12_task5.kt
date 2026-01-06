package lesson_12

import kotlin.random.Random

class CurrentWeather(kelvinDayTemperature: Int, kelvinNightTemperature: Int, precipitations: Boolean) {

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

fun averageTemperature(temperatures: List<Int>): Double {
    return temperatures.average()
}

fun main() {
    val weatherData = mutableListOf<CurrentWeather>()

    for (i in 1..30) {
        val kelvinDay = Random.nextInt(290, 310)
        val kelvinNight = Random.nextInt(270, 300)
        val hasPrecipitation = Random.nextBoolean()

        weatherData.add(CurrentWeather(kelvinDay, kelvinNight, hasPrecipitation))
    }

    val dayTemperatures = weatherData.map { it.dayTemperature }
    val nightTemperatures = weatherData.map { it.nightTemperature }

    val averageDayTemperature = averageTemperature(dayTemperatures)
    val averageNightTemperature = averageTemperature(nightTemperatures)

    val daysWithPrecipitation = weatherData.count { it.precipitation }

    println("Average Day Temperature: ${averageDayTemperature}°C")
    println("Average Night Temperature: ${averageNightTemperature}°C")
    println("Days with Precipitation: $daysWithPrecipitation")
}