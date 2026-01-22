package lesson_18

open class Animal() {
    open val name = ""

    open fun sleep() = println("$name is sleeping")
    open fun eat() = println()
}

class Fox() : Animal() {
    override val name = "Fox"

    override fun eat() = println("$name -> Eating berries")
}

class Dog() : Animal() {
    override val name = "Dog"

    override fun eat() = println("$name -> Eating bones")
}

class Cat() : Animal() {
    override val name = "Cat"

    override fun eat() = println("$name -> Eating fish")
}

fun main() {
    val animals: List<Animal> = listOf(Fox(), Dog(), Cat())

    animals.forEach { it.eat() }
}
