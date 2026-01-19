package lesson_15

interface Movable {
    fun move()
}

interface PassengerTransportable {
    fun loadPassenger(passengers: Int)
    fun unloadPassenger(passengers: Int)
}

interface CargoTransportable {
    fun loadCargo(cargo: Int)
    fun unloadCargo(cargo: Int)
}

abstract class Transport(val maxPassengers: Int) : Movable, PassengerTransportable {
    var currentPassenger = 0
    var freePassengerSlots = maxPassengers - currentPassenger

    override fun loadPassenger(passengers: Int) {
        if (passengers <= freePassengerSlots) {
            currentPassenger += passengers
            freePassengerSlots -= passengers
            println(
                "$passengers passenger(s) loaded. Current passenger(s): $currentPassenger." +
                        " You can load ${maxPassengers - currentPassenger} more passengers"
            )
        } else {
            println("Can't load so many passengers")
        }
    }

    override fun unloadPassenger(passengers: Int) {
        if (passengers <= currentPassenger) {
            currentPassenger -= passengers
            freePassengerSlots += passengers
            println("$passengers passenger(s) unloaded. Current passenger(s): $currentPassenger")
        } else {
            println("Not enough passengers to unload")
        }
    }
}

class Car : Transport(maxPassengers = 3) {
    override fun move() = println("Car is moving")
}

class Truck : Transport(maxPassengers = 1), CargoTransportable {
    val maxCargo = 2
    var currentCargo = 0

    override fun move() = println("Truck is moving")

    override fun loadCargo(cargo: Int) {
        if (currentCargo + cargo <= maxCargo) {
            currentCargo += cargo
            println(
                "Cargo loaded: $cargo. Current cargo: $currentCargo." +
                        " You can load ${maxCargo - currentCargo} more tons of cargo into this truck"
            )
        } else println("Cargo exceeds max limit")
    }

    override fun unloadCargo(cargo: Int) {
        if (cargo <= currentCargo) {
            currentCargo -= cargo
            println("Cargo unloaded: $cargo. Current cargo: $currentCargo")
        } else println("Not enough cargo to unload")
    }
}

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    var cargoForTransportation = 2
    var passengersForTransportation = 6

    truck.loadCargo(truck.maxCargo)
    cargoForTransportation -= truck.currentCargo
    truck.loadPassenger(truck.maxPassengers)
    passengersForTransportation -= truck.currentPassenger

    car1.loadPassenger(car1.maxPassengers)
    passengersForTransportation -= car1.currentPassenger

    car2.loadPassenger(passengersForTransportation)
    passengersForTransportation -= car2.currentPassenger

    truck.move()
    car1.move()
    car2.move()

    truck.unloadCargo(truck.currentCargo)
    truck.unloadPassenger(truck.currentPassenger)
    car1.unloadPassenger(car1.currentPassenger)
    car2.unloadPassenger(car2.currentPassenger)

    println("It remains to transport $passengersForTransportation people and $cargoForTransportation tons of cargo")
}
