package lesson_13

class CreatedContacts(
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
    println("Enter name:")
    val newName = readln()


    var newPhoneNumber: Long? = null
    do {
        try {
            println("Enter phone number:")
            newPhoneNumber = readln().toLong()
        } catch (e: NumberFormatException) {
            println("Invalid input! Phone number must be contain only digits!")
        }
    } while (newPhoneNumber == null)

    println("Enter company:")
    val newCompany = readln()

    val newContact = CreatedContacts(newName, newPhoneNumber, newCompany)
    newContact.printContactInfo()
}