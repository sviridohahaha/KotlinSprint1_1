package lesson7

fun main() {
    println("Enter a number")
    val number = readln().toInt()

    val progression = 0..number step 2

    for (i in progression) println(i)
}