package lesson_15

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

class Carp : Swimmable {
    override fun swim() = println("The carp swims in the water")
}

class Seagull : Flyable {
    override fun fly() = println("The seagull flies in the sky")
}

class Duck : Flyable, Swimmable {
    override fun fly() = println("The duck flies in the sky")
    override fun swim() = println("The duck swims in the water")
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}
