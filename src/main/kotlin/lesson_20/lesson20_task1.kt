package lesson_20

fun main() {
    val splashScreen: (String) -> String = { username: String -> "С наступающим Новым годом, $username!" }

    println(splashScreen("Валера"))
}
