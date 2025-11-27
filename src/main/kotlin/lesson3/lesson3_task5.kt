package lesson3

fun main() {
    val moveInfo = "D2-D4;0"

    val parts = moveInfo.split("-",";")

    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2].toInt()

    println(from)
    println(to)
    println(moveNumber)
}