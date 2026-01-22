package lesson_19

enum class FishType() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("The following fish are available to add to your aquarium:")
    for (i in FishType.entries) println(i)
}
