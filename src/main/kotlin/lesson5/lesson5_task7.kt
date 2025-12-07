package lesson5

fun main() {
    println("Enter travel distance (in kilometers):")
    val distance = readln().toDouble()

    println("Enter fuel consumption per 100 km (in liters):")
    val fuelConsumption = readln().toDouble()

    println("Enter the current price per liter of fuel:")
    val fuelPrice = readln().toDouble()

    val requiredFuel = distance * fuelConsumption / 100

    val totalFuelPrice = requiredFuel * fuelPrice

    println("Total amount of fuel required: $requiredFuel liters")
    println("Total cost of the trip: %.2f".format(totalFuelPrice))
}