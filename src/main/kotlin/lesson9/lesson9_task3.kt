package lesson9

fun main() {
    val recipe = mutableMapOf("eggs" to 2, "milk" to 50, "butter" to 15)

    println("Enter the number of portions:")
    val numberOfPortions = readln().toInt()

    val amountOfIngredients = recipe.map { (ingredient, quantityPerPortion) ->
        ingredient to quantityPerPortion * numberOfPortions
    }

    val result =
        amountOfIngredients.joinToString(", ") { (ingredient, totalQuantity) -> "$ingredient - $totalQuantity" }

    println("For $numberOfPortions portions you will need: $result.")
}