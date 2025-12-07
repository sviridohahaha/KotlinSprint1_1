package lesson2

const val TOTAL_PERCENTS = 100

fun main() {
    var crystalOre = 7
    var ironOre = 11
    val buff = 20

    crystalOre = crystalOre * buff / TOTAL_PERCENTS
    ironOre = ironOre * buff / TOTAL_PERCENTS

    println("Бонусная кристаллическая руда: $crystalOre")
    println("Бонусная железная руда: $ironOre")

}