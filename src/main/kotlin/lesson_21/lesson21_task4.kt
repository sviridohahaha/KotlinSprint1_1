package lesson_21

import java.io.File

fun File.writeToStart(word: String) {
    val lowerCaseWord = word.lowercase()

    val existingContent = this.readText()

    val newContent = "$lowerCaseWord\n$existingContent"

    this.writeText(newContent)
}
