package lesson_20

class GamePlayer(val name: String, var currentHealth: Int, val maxHealth: Int)

fun main() {
    val restoreHealth: (GamePlayer) -> Unit = { gamePlayer: GamePlayer ->
        gamePlayer.currentHealth = gamePlayer.maxHealth
        println("${gamePlayer.name} has regained his health! Current health: ${gamePlayer.maxHealth}")
    }

    val player = GamePlayer("Rambo", 14, 100)

    restoreHealth(player)
}
