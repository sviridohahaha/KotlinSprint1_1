package lesson7

fun main() {
    var code: Int

    do {
        code = (1000..9999).random()
        println("Your authorization code: $code")
        println("Enter your authorization code:")
        val enteredCode = readln().toInt()

        if (enteredCode != code) println("You entered the wrong code!")
    }
    while (enteredCode != code)
    println("Welcome!")
}