package lesson_20

class Players(val name: String, val hasKey: Boolean)

fun main() {
    val checkDoor = { player: Players ->
        if (player.hasKey) "${player.name} opened the door"
        else "The door is locked"
    }

    val playerWithKey = Players("Paspartu", true)
    val playerWithoutKey = Players("Taras", false)

    println(checkDoor(playerWithoutKey))
    println(checkDoor(playerWithKey))
}
