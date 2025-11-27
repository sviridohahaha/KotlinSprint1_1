package lesson2

const val TOTAL_PERCENT = 100

fun main() {
    var crystalOre = 7
    var ironOre = 11
    val buff = 20

    crystalOre = crystalOre * buff / TOTAL_PERCENT
    ironOre = ironOre * buff / TOTAL_PERCENT

    println("Бонусная кристаллическая руда: $crystalOre")
    println("Бонусная железная руда: $ironOre")

}