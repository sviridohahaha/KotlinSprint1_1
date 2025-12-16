package lesson9

fun main() {
    println("Enter 5 ingredients:")

    val ingredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Enter the name of ingredient $i")
        ingredients.add(readln())
    }

    val sortedIngredients = ingredients.sorted()

    val formattedIngredients = sortedIngredients.joinToString(", ") {
        if (it == sortedIngredients.first()) it.replaceFirstChar { char -> char.uppercase() }
        else it
    }

    println(formattedIngredients)
}