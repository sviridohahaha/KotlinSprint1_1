package lesson_20

fun main() {
    val elements = listOf("Item1", "Item2", "Item3", "Item4", "Item5", "Item6")

    val actions = elements.mapIndexed { index, element ->
        if (index % 2 == 1)
            println("Нажат элемент $element")
    }

    actions.forEach { it }
}
