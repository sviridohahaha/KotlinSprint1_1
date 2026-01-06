package lesson_13

class NewContact(
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