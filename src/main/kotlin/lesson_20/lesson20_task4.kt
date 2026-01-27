package lesson_20

fun main() {
    val elements = listOf("Item1", "Item2", "Item3", "Item4", "Item5", "Item6")

    val actions = elements.map { element -> "Нажат элемент $element" }

    for (i in 0..actions.size) if (i % 2 == 1) println(actions[i])
}
