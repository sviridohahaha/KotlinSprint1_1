package lesson_15

abstract class WeatherStationStats() {
    abstract fun sendData(): String
}

class Temperature(val value: Double) : WeatherStationStats() {
    override fun sendData() = "The temperature is $value"
}

class PrecipitationAmount(val amount: Double) : WeatherStationStats() {
    override fun sendData() = "The precipitation amount is $amount"
}

class WeatherServer {
    fun sendWeatherData(weatherStats: WeatherStationStats) = println(weatherStats.sendData())
}

fun main() {
    val temperature = Temperature(-13.7)
    val precipitation = PrecipitationAmount(12.3)
    val weatherServer = WeatherServer()

    weatherServer.sendWeatherData(temperature)
    weatherServer.sendWeatherData(precipitation)
}