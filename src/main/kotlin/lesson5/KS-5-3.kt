package lesson5

fun main() {
    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()

    println("Введите два числа от 0 до 42:")

    val number1 = readLine()?.toIntOrNull()
    val number2 = readLine()?.toIntOrNull()

    if ((number1 == winNumber1 || number1 == winNumber2) && (number2 == winNumber1 || number2 == winNumber2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == winNumber1 || number1 == winNumber2) || (number2 == winNumber1 || number2 == winNumber2)) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("Выигрышные числа: $winNumber1 и $winNumber2")

}