package lesson_11

class RecipeCategory(
    val title: String,
    val description: String,
    val imageUrl: String,
    val recipes: List<Recipe>
) {

}

class Ingredient(
    val name: String,
    val quantity: Double,
    val unit: String,
) {

}

class Recipe(
    val title: String,
    val description: String,
    val cookingTime: Int,
    val imageUrl: String,
    val ingredients: Set<Ingredient>,
    val instruction: String,
) {

}