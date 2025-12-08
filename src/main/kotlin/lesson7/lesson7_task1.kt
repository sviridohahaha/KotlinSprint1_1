package lesson7

fun main() {
    val part1 = ('a'..'z').random()
    val part2 = (0..9).random()
    val part3 = ('a'..'z').random()
    val part4 = (0..9).random()
    val part5 = ('a'..'z').random()
    val part6 = (0..9).random()

    val password = "$part1$part2$part3$part4$part5$part6"

    println(password)
}