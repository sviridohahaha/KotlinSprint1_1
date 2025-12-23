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

    fun updateBio(newBio: String) {
        bio = newBio
        println("Your bio has been updated")
    }

    fun changePassword(currentPassword: String, newPassword: String) {
        if (currentPassword == password) {
            password = newPassword
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

    newUser.updateBio("I'm the best football player in the world!")
    newUser.changePassword("7777777", "I'm the best of the best")
    newUser.userInformation()
}