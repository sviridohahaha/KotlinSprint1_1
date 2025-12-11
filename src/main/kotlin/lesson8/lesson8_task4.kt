package lesson8

fun main() {
    val ingredients = arrayOf("bun", "sausage", "sauce", "fried onion")

    for (i in ingredients) println(i)

    println("Enter the unnecessary ingredient:")
    val unnecessaryIngredients = readln()

    if (ingredients.indexOf(unnecessaryIngredients) >= 0) {
        println("Enter a new ingredient:")
        val newIngredient = readln()

        ingredients[ingredients.indexOf(unnecessaryIngredients)] = newIngredient

        println("Ready! You have saved the recipe:")
        for (i in ingredients) println(i)
    } else println("There is no such ingredient in the recipe")
}