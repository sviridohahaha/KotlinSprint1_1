package lesson5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()

    println("Решите пример: $number1 + $number2 =")

    val result = readLine()?.toIntOrNull()

    if (result == number1 + number2) println("Добро пожаловать!") else println("Доступ запрещён!")
}