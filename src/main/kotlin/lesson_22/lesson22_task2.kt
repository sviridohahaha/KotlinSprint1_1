package lesson_22

class OrdinaryBook(val title: String, val author: String)

data class DataClassBook(val title: String, val author: String)

fun main() {
    val regularBook = OrdinaryBook("1984", "George Orwell")
    val dataBook = DataClassBook("1984", "George Orwell")

    println("RegularBook object: $regularBook")
    println("DataBook object: $dataBook")
}
/*
Для обычного класса `RegularBook` при выводе объекта на экран, по умолчанию выводится строковое
представление объекта, которое содержит имя класса и хеш-код объекта в памяти (например, `RegularBook@5b2133b1`).
Для `data class` вывод автоматически форматируется с использованием значений свойств класса. Он выводит
свойства с их значениями (например, `DataBook(title=1984, author=George Orwell)`).
*/
