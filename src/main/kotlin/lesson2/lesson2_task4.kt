package lesson2

fun main() {
    var crystalOre = 7
    var ironOre = 11
    val buff = 20

    crystalOre = crystalOre * buff / 100
    ironOre = ironOre * buff / 100

    println("Бонусная кристаллическая руда: $crystalOre")
    println("Бонусная железная руда: $ironOre")

}