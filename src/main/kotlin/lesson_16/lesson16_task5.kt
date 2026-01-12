package lesson_16

class Player(val name: String, var health: Int, var attackPower: Int) {
    val maxHealth = 100
    private var isDead = false

    private fun die() {
        isDead = true
        health = 0
        attackPower = 0
        println("$name has died. Attack power and health are now reset to 0. Healing is impossible")
    }

    fun receiveDamage(damage: Int) {
        if (isDead) {
            println("$name is already dead and cannot take damage.")
            return
        }

        health -= damage
        println("$name received $damage damage. Health is now: $health.")

        if (health <= 0) die()
    }

    fun heal(healthPoints: Int) {
        if (isDead) {
            println("$name is dead and cannot be healed.")
            return
        }

        if (health + healthPoints >= maxHealth) health = maxHealth
        else health += healthPoints
        println("$name healed for $healthPoints. Health is now $health.")
    }
}

fun main() {
    val player = Player("Rambo", 100, 69)

    player.receiveDamage(30)
    player.heal(20)
    player.receiveDamage(90)
    player.heal(50)
}