package lesson_17

class Ship(val name: String, val averageSpeed: Double, val homePort: String) {
    var shipName: String = name
        set(value) {
            println("Warning: Ship name cannot be changed!")
        }
}

fun main() {
    val ship = Ship("Titanic", 28.0, "Southampton")

    ship.shipName = "Olympic"
    println(ship.shipName)
}