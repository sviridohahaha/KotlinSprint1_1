package lesson_11

class ForumUser(val userId: Int, val userName: String)

class Message(val authorId: Int, val message: String)

class Forum {
    val users = mutableListOf<ForumUser>()
    val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): ForumUser {
        val userId = users.size + 1
        val user = createForumUser(userId, userName)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        val author = users.find { it.userId == authorId }
        return if (author != null) {
            val message = createMessage(authorId, message)
            messages.add(message)
            message
        } else {
            println("User with ID $authorId not found.")
            null
        }
    }

    fun printThread() {
        if (messages.isEmpty()) println("No messages in the forum.")
        else messages.forEach {
            println("${users.find { user -> user.userId == it.authorId }?.userName}: ${it.message}")
        }
    }

    fun createForumUser(userId: Int, userName: String) = ForumUser(userId, userName)

    fun createMessage(authorId: Int, message: String) = Message(authorId, message)
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Hello, I am Alice!")
    forum.createNewMessage(user2.userId, "Hi, Bob here!")
    forum.createNewMessage(user1.userId, "How are you, Bob?")
    forum.createNewMessage(user2.userId, "I'm good, thanks!")

    forum.printThread()
}