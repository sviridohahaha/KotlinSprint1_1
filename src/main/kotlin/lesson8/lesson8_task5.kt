package lesson8

fun main() {
    println("Enter the number of ingredients:")
    val size = readln().toInt()

    val ingredients = Array(size) { "" }

    for (i in ingredients) {
        println("Enter an ingredient:")
        val newIngredient = readln()

        ingredients[ingredients.indexOf(i)] = newIngredient
    }

    println(ingredients.joinToString())
}