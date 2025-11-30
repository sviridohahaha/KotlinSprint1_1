package lesson5

fun main() {
    val winNumber1 = 13
    val winNumber2 = 29

    val number1 = readLine()?.toIntOrNull()
    val number2 = readLine()?.toIntOrNull()

    if ((number1 == winNumber1 || number1 == winNumber2) && (number2 == winNumber1 || number2 == winNumber2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == winNumber1 || number1 == winNumber2) || (number2 == winNumber1 || number2 == winNumber2)) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

}