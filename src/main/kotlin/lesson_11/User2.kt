package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {

    fun userInformation() {
        println("User details: ID - $id, Username - $login, Password - $password, Email - $email, bio - $bio")
    }

    fun updateBio() {
        println("Enter your bio:")
        bio = readln()
        println("Your bio has been updated")
    }

    fun changePassword() {
        println("Enter current password:")
        val currentPassword = readln()

        if (currentPassword == password) {
            println("Enter new password")
            password = readln()
            println("Your password has been changed. Your new password is $password")
        } else println("Current password is incorrect. Your password has not been  changed.")
    }
}

fun main() {
    val newUser = User2(
        7,
        "Cristiano Ronaldo",
        "7777777",
        "ronaldo@gmail.com",
        null
    )

    newUser.updateBio()
    newUser.changePassword()
    newUser.userInformation()
}