package lesson9

fun main() {
    val ingredients = listOf("bun", "sausage", "sauce", "fried onion")

    println("The recipe contains the following ingredients: $ingredients")

    ingredients.forEach {
        println(it)
    }
}