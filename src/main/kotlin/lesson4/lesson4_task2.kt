package lesson4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main() {
    val weight1 = 20
    val volume1 = 80
    val weight2 = 50
    val volume2 = 100

    println("Груз весом $weight1 кг и объёмом $volume1 л соответствует категории 'Average': " +
            "${(weight1 > AVERAGE_MIN_WEIGHT) && (weight1 <= AVERAGE_MAX_WEIGHT) && (volume1 < AVERAGE_VOLUME)}")
    println("Груз весом $weight2 кг и объёмом $volume2 л соответствует категории 'Average': " +
            "${(weight2 > AVERAGE_MIN_WEIGHT) && (weight2 <= AVERAGE_MAX_WEIGHT) && (volume2 < AVERAGE_VOLUME)}")
}