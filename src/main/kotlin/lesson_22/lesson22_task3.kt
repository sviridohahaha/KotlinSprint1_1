package lesson_22

data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val book = Book("1984", "George Orwell", 1949)

    val (title, author, year) = book

    println("Title: $title")
    println("Author: $author")
    println("Year: $year")
}
