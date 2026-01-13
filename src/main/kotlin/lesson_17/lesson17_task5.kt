package lesson_17

class NewUser(var login: String, private var userPassword: String) {
    val password: String
        get() = "*".repeat(userPassword.length)

    var newLogin: String
        get() = login
        set(value) {
            login = value
            println("Login has been successfully changed to: $login")
        }

    var passwordChange: String
        get() = "*".repeat(userPassword.length)
        set(value) {
            println("You cannot change the password.")
        }
}

fun main() {
    val user = NewUser("Olesia", "password123")

    user.newLogin = "Alesia"
    user.passwordChange = "newpassword123"

    println("Current login: ${user.newLogin}")
    println("Current password: ${user.password}")
}