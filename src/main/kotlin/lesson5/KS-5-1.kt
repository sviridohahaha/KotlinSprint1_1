package lesson5

fun main() {
    val number1 = 3
    val number2 = 5

    println("Решите пример: $number1 + $number2 =")

    val result = readLine()?.toIntOrNull()

    if (result == number1 + number2) println("Добро пожаловать!") else println("Доступ запрещён!")
}