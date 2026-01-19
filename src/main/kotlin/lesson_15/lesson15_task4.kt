package lesson_15

abstract class Product(val name: String, val quantity: Int)

interface Searchable {
    fun searchAccessories()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchAccessories() = println("Выполняется поиск товара $name...")
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)
