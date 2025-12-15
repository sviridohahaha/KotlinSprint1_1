package lesson9

fun main() {
    val ingredients = mutableListOf("bun", "sausage", "sauce")

    println("The recipe has basic ingredients: $ingredients")
    println("Would you like to add more? (yes/no)")

    val userResponse = readln().equals("yes", ignoreCase = true)

    if (userResponse) {
        println("What ingredient do you want to add?")
        ingredients.add(readln())
        println("Now the recipe has the following ingredients: $ingredients")
    }


}