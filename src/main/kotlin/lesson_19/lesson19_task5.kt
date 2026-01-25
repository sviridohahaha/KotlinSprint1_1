package lesson_19

enum class Gender {
    MALE,
    FEMALE,
}

class Person(val name: String, val gender: Gender)

fun main() {
    val peopleList = mutableListOf<Person>()

    println("Welcome to the \"Card Catalog\" app! Please enter the name and gender of a person")
    println("You need to enter data for 5 people")

    for (i in 1..5) {
        println("Enter name (Person $i):")
        val name = readln()
        var genderInput: String
        var gender: Gender

        do {
            println("Enter gender (male or female) for $name:")
            genderInput = readln().uppercase().trim()
            gender = when (genderInput) {
                "MALE" -> Gender.MALE
                "FEMALE" -> Gender.FEMALE
                else -> {
                    println("You entered incorrect data! Invalid gender input!")
                    Gender.MALE
                }
            }
        } while (genderInput != "MALE" && genderInput != "FEMALE")

        peopleList.add(Person(name, gender))
    }

    println("\nList of people in the catalog:")
    peopleList.forEach {
        println("Name: ${it.name}, Gender: ${it.gender}")
    }
}
