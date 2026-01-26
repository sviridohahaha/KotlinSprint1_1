package lesson_19

enum class Ammo(val damage: Int) {
    EMPTY(0),
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo = Ammo.EMPTY

    fun loadAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Tank armed with ${ammo.name.lowercase()} ammo")
    }

    fun shoot() {
        if (currentAmmo == Ammo.EMPTY) println("Tank is not armed with any ammo!")
        else println("Tank caused damage: ${currentAmmo.damage}")
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.loadAmmo(Ammo.BLUE)
    tank.shoot()
    tank.loadAmmo(Ammo.GREEN)
    tank.shoot()
    tank.loadAmmo(Ammo.RED)
    tank.shoot()
}
