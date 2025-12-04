package lesson4

const val SUNNY_WEATHER = true
const val TENT_OPEN = true
const val HUMIDITY_REQUIRED = 20
const val BAD_SEASON = "зима"

fun main(){
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"

    val areConditionsGood = isSunny == SUNNY_WEATHER && isTentOpen == TENT_OPEN &&
            humidity == HUMIDITY_REQUIRED && season != BAD_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsGood")
}