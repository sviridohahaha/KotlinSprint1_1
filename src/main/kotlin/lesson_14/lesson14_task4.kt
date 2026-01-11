package lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
) {

}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
) : CelestialBody(name, hasAtmosphere, isHabitable) {

}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val moons: MutableList<Moon>,
) : CelestialBody(name, hasAtmosphere, isHabitable) {

}

fun main() {
    val moon1 = Moon("Titan", hasAtmosphere = true, isHabitable = false)
    val moon2 = Moon("Europa", hasAtmosphere = false, isHabitable = true)

    val planet = Planet(
        name = "Saturn",
        hasAtmosphere = true,
        isHabitable = false,
        moons = mutableListOf(moon1, moon2)
    )
    println("Planet ${planet.name} has following moons:")
    planet.moons.forEach { println("- ${it.name}") }
}