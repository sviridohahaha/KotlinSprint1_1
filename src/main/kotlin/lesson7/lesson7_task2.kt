package lesson7

fun main() {
    while (true) {
        val code = (1000..9999).random()
        println("Your authorization code: $code")
        println("Enter your authorization code:")
        if (readln().toInt() == code) {
            println("Welcome!")
            break
        } else println("You entered the wrong code!")
    }
}