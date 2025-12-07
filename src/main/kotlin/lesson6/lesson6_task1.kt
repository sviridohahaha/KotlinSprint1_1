package lesson6

fun main() {
    println("Введите логин:")
    val registeredLogin = readln()

    println("Введите пароль:")
    val registeredPassword = readln()

    println("Регистрация прошла успешно")

    var isAuthenticated = false

    while (!isAuthenticated) {
        println("Введите логин для входа:")
        val login = readln()

        println("Введите пароль для входа:")
        val password = readln()

        if (login == registeredLogin && password == registeredPassword) {
            println("Авторизация прошла успешно")
            isAuthenticated = true
        } else println("Неверный логин или пароль")
    }
}