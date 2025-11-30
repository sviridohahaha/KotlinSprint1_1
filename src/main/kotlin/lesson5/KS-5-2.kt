package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    val yearNow = 2025
    val yearOfBirthday = readLine()?.toIntOrNull()

    if (yearNow - yearOfBirthday!! >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуть пользователя на главный экран приложения")
}