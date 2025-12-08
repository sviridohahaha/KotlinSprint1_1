package lesson4

const val DAMAGE = true
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val REQUIRED_COUNT_OF_BOXES = 50
const val GOOD_WEATHER = true

fun main() {
    println("Есть ли повреждения корпуса? true/false")
    val hasDamage = readln().toBoolean()

    println("Число членов экипажа:")
    val crewSize = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val foodBoxes = readln().toInt()

    println("Погода благоприятная? true/false")
    val isWeatherGood = readln().toBoolean()

    val areConditionsGood = (hasDamage != DAMAGE && crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE &&
            foodBoxes > REQUIRED_COUNT_OF_BOXES) || (hasDamage == DAMAGE && crewSize == MAX_CREW_SIZE &&
                    isWeatherGood == GOOD_WEATHER && foodBoxes >= REQUIRED_COUNT_OF_BOXES)

    println("Корабль может отправиться в плавание: $areConditionsGood")
}