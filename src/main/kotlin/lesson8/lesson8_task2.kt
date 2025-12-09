package lesson8

fun main() {
    val ingredients = arrayOf("bun", "sausage", "sauce", "fried onion")

    println("Enter an ingredient:")
    val desiredIngredients = readln()

    var ingredientFound = false

    for (i in ingredients) {
        if (desiredIngredients == i) ingredientFound = true
    }

    if (ingredientFound) println("The $desiredIngredients ingredient is in the recipe")
    else println("There is no such ingredient in the recipe")
}