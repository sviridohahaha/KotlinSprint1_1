package lesson_15

abstract class Product(val name: String, var quantity: Int)

interface Searchable {
    fun searchAccessories()
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchAccessories() = println("Searching for accessories for $name. Please wait...")
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)