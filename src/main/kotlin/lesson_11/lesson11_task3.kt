package lesson_11

class Participant(
    val nickname: String,
    var avatar: String,
    var status: String,
) {

}

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(user: Participant) {
        if (participants.indexOfFirst { it.nickname == user.nickname } < 0) {
            participants.add(user)
            println("User ${user.nickname} added to the room \"$title\".")
        } else println("A user with that name already exists")
    }

    fun updateStatus(userName: String, newStatus: String) {
        val indexOfUser = participants.indexOfFirst { it.nickname == userName }
        if (indexOfUser >= 0) {
            participants[indexOfUser].status = newStatus
            println("User $userName's status update to: $newStatus")
        } else println("User $userName not found in the room \"$title\".")
    }
}

fun main() {
    val room = Room("space_chat_cover.jpg", "Space Exploration Chat Room")
}