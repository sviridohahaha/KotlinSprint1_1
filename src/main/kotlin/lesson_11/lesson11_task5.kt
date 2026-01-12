package lesson_11

class ForumUser(val userId: Int, val userName: String)

class Message(val authorId: Int, val message: String)

class UserBuilder {
    private var userId: Int = 0
    private var userName: String = ""

    fun setUserId(id: Int): UserBuilder {
        this.userId = id
        return this
    }

    fun setUserName(name: String): UserBuilder {
        this.userName = name
        return this
    }

    fun build(): ForumUser {
        return ForumUser(userId, userName)
    }
}

class MessageBuilder {
    private var authorId: Int = 0
    private var messageText: String = ""

    fun setAuthorId(id: Int): MessageBuilder {
        this.authorId = id
        return this
    }

    fun setMessage(message: String): MessageBuilder {
        this.messageText = message
        return this
    }

    fun build(): Message {
        return Message(authorId, messageText)
    }
}

class Forum {
    val users = mutableListOf<ForumUser>()
    val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): ForumUser {
        val userId = users.size + 1
        val user = UserBuilder().setUserId(userId).setUserName(userName).build()
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        val author = users.find { it.userId == authorId }
        return if (author != null) {
            val message = MessageBuilder().setAuthorId(authorId).setMessage(message).build()
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