package lesson_13

class Contacts(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printContactInfo() {
        val companyInfo = company ?: "<не указано>"

        println(
            """
            |Name: $name
            |Number: $phoneNumber
            |Company: $companyInfo
        """.trimMargin()
        )
    }
}

fun main() {
    val contactsList = listOf(
        Contacts("Alice", 1234567890, "Google"),
        Contacts("Bob", 2345678901, null),
        Contacts("Charlie", 3456789012, "Microsoft"),
        Contacts("David", 4567890123, "null"),
        Contacts("Eve", 5678901234, null)
    )

    val companies = contactsList.mapNotNull { it.company }

    companies.forEach { println(it) }
}