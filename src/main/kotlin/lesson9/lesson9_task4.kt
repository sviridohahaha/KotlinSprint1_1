package lesson9

fun main() {
    println("Enter 5 ingredients separated by a comma:")

    val ingredients = readln().split(", ")

    val sortedIngredients = ingredients.sorted()

    println(sortedIngredients)
}