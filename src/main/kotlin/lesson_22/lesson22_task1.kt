package lesson_22

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("1984", "George Orwell")
    val regularBook2 = RegularBook("1984", "George Orwell")

    val dataBook1 = DataBook("1984", "George Orwell")
    val dataBook2 = DataBook("1984", "George Orwell")

    println("RegularBook comparison: ${regularBook1 == regularBook2}")
    println("DataBook comparison: ${dataBook1 == dataBook2}")
}
//Для обычного класса RegularBook сравнение объектов идёт по ссылке, а не по содержимому.
// regularBook1 и regularBook2 - это два разных экземпляра класса. Они не равны, даже если их свойства одинаковы.
// Для data class оператор == и equals сравнивают значения свойств, а не ссылки.
