package lesson_17

class Package(val trackingNumber: String, var currentLocation: String) {
    private var moveCount: Int = 0

    var location: String
        get() = currentLocation
        set(value) {
            if (currentLocation != value) {
                moveCount++
                currentLocation = value
                println("Package moved to: $currentLocation. Move count: $moveCount")
            } else println("The package is already in $currentLocation. Move count: $moveCount")
        }
}

fun main() {
    val package1 = Package("12345", "Warehouse A")

    package1.location = "Warehouse B"
    package1.location = "Warehouse C"
    package1.location = "Warehouse D"
    package1.location = "Warehouse D"
}