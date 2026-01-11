package lesson_14

open class Liner(
    val type: String = "Liner",
    val speed: Int = 30,
    val capacity: Int = 2000,
    val cargoCapacity: Int = 5000,
) {

}

class CargoShip() : Liner("Cargo Ship", speed = 20, capacity = 500, cargoCapacity = 10000) {

}

class Icebreaker(
    val iceBreakingPower: Int = 50,
) : Liner("Icebreaker", speed = 15, capacity = 100) {

}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
}