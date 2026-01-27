package lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return count { it in vowels }
}
