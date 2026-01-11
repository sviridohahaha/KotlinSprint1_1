package lesson_15

interface Movable {
    fun move()
}

interface PassengerTransportable {
    fun loadPassenger(passengers: Int)
    fun unloadPassenger(passengers: Int)
}

interface CargoTransportable {
    fun loadCargo(cargo: Double)
    fun unloadCargo(cargo: Double)
}

abstract class Transport(val maxPassengers: Int) : Movable, PassengerTransportable {
    var currentPassenger = 0
    val freePassengerSlots = maxPassengers - currentPassenger

    override fun loadPassenger(passengers: Int) {
        if (passengers <= freePassengerSlots) {
            currentPassenger += passengers
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
    val maxCargo = 2.0
    var currentCargo = 0.0

    override fun move() = println("Truck is moving")

    override fun loadCargo(cargo: Double) {
        if (currentCargo + cargo <= maxCargo) {
            currentCargo += cargo
            println(
                "Cargo loaded: $cargo. Current cargo: $currentCargo." +
                        "  You can load ${maxCargo - currentCargo} more tons of cargo into this truck"
            )
        } else println("Cargo exceeds max limit")
    }

    override fun unloadCargo(cargo: Double) {
        if (cargo <= currentCargo) {
            currentCargo -= cargo
            println("Cargo unloaded: $cargo. Current cargo: $currentCargo")
        } else println("Not enough cargo to unload")
    }
}

fun main() {
    val truck = Truck()
    val car = Car()

    var cargoForTransportation = 2.0
    var passengersForTransportation = 6

    do {
        truck.loadCargo(
            if (truck.maxCargo >= cargoForTransportation) cargoForTransportation
            else truck.maxCargo
        )
        cargoForTransportation -= truck.currentCargo
        truck.loadPassenger(
            if (truck.maxPassengers >= passengersForTransportation) passengersForTransportation
            else truck.maxPassengers
        )
        passengersForTransportation -= truck.currentPassenger
        car.loadPassenger(
            if (car.maxPassengers >= passengersForTransportation) passengersForTransportation
            else car.maxPassengers
        )
        passengersForTransportation -= car.currentPassenger
        truck.move()
        car.move()
        truck.unloadCargo(truck.currentCargo)
        truck.unloadPassenger(truck.currentPassenger)
        car.unloadPassenger(car.currentPassenger)
        truck.move()
        car.move()
    } while (cargoForTransportation != 0.0 || passengersForTransportation != 0)
}