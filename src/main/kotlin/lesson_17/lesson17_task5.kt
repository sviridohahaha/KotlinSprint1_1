package lesson_17

class NewUser(login: String, userPassword: String) {
    var password = userPassword
        get() = "*".repeat(field.length)
        set(value) {
            println("You cannot change the password.")
        }

    var newLogin = login
        get() = field
        set(value) {
            field = value
            println("Login has been successfully changed to: $newLogin")
        }
}

fun main() {
    val user = NewUser("Olesia", "password123")

    user.newLogin = "Alesia"
    user.password = "newpassword123"

    println("Current login: ${user.newLogin}")
    println("Current password: ${user.password}")
}
