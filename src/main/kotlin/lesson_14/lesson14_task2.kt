package lesson_14

open class Liners(
    val type: String = "Liner",
    val speed: Int = 30,
    val capacity: Int = 2000,
    val cargoCapacity: Int = 5000,
) {
    open fun printInfo() {
        println("Ship Type: $type")
        println("Speed: $speed knots")
        println("Capacity: $capacity passengers")
        println("Cargo Capacity: $cargoCapacity tons")
    }

    open fun loadCargo() {
        println("Liner extends a horizontal ladder from the waist")
    }
}

class CargoVessel() : Liners("Cargo Ship", speed = 20, capacity = 500, cargoCapacity = 10000) {
    override fun loadCargo() {
        println("Cargo ship activates the loading crane to load cargo")
    }
}

class IcebreakerVessel(
    val iceBreakingPower: Int = 50,
) : Liners("Icebreaker", speed = 15, capacity = 100) {
    override fun loadCargo() {
        println("Icebreaker opens the gates at the stern to load cargo")
    }

    override fun printInfo() {
        super.printInfo()
        println("Ice breaking power: $iceBreakingPower gigapascals")
    }
}

fun main() {
    val liner = Liners()
    val cargoShip = CargoVessel()
    val icebreaker = IcebreakerVessel()

    liner.printInfo()
    cargoShip.printInfo()
    icebreaker.printInfo()
}