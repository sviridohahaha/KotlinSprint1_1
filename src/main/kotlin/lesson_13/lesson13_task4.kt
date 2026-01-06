package lesson_13

class CreatedContact(
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
    val contactsList = mutableListOf<CreatedContact>()
    var createMore = "yes"
    var newName: String
    var newPhoneNumber: Long?
    var newCompany: String?
    var newContact: CreatedContact

    do {
        println("Enter name:")
        newName = readln()

        println("Enter phone number:")
        newPhoneNumber = readln().toLongOrNull()
        if (newPhoneNumber == null) {
            println("Invalid phone number. This contact will not be added")
            continue
        }

        println("Enter company:")
        newCompany = readln()

        newContact = CreatedContact(newName, newPhoneNumber, newCompany)
        contactsList.add(newContact)

        println("Would you like to create another contact? yes/no")
        createMore = readln()
    } while (createMore.lowercase() == "yes")

    contactsList.forEach { it.printContactInfo() }
}