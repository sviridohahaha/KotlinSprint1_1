package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    val yearNow = 2025

    println("Введите Ваш год рождения:")

    val yearOfBirthday = readln().toInt()

    if (yearNow - yearOfBirthday >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуть пользователя на главный экран приложения")
}