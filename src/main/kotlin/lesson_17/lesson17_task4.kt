package lesson_17

class Package(trackingNumber: String, currentLocation: String) {
    private var moveCount: Int = 0

    var location = currentLocation
        get() = field
        set(value) {
            if (location != value) {
                moveCount++
                field = value
                println("Package moved to: $location. Move count: $moveCount")
            } else println("The package is already in $location. Move count: $moveCount")
        }
}

fun main() {
    val package1 = Package("12345", "Warehouse A")

    package1.location = "Warehouse B"
    package1.location = "Warehouse C"
    package1.location = "Warehouse D"
    package1.location = "Warehouse D"
}