package lesson_18

class Orders(val orderNumber: Int) {
    fun printOrderDetails(itemName: String) = println("Order $orderNumber. Item ordered: $itemName")
    fun printOrderDetails(items: List<String>) =
        println("Order $orderNumber. The following items ordered: ${items.joinToString(", ")}")
}

fun main() {
    val order1 = Orders(1)
    val order2 = Orders(2)

    order1.printOrderDetails("Laptop")
    order2.printOrderDetails(listOf("Laptop", "Smartphone", "Headphones"))
}
