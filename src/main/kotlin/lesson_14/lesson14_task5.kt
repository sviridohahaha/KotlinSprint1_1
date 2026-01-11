package lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {

}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text) {

}

class Chat {
    val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        val newId = messages.size + 1
        val message = Message(newId, author, text)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val newId = messages.size + 1
        val childMessage = ChildMessage(newId, author, text, parentMessageId)
        messages.add(childMessage)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        groupedMessages.forEach { (parentId, messageGroup) ->
            messageGroup.forEach { message ->
                if (message is ChildMessage) println("\t${message.author}: ${message.text}")
                else println("${message.author}: ${message.text}")
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Hello everyone!", "Alice")
    chat.addMessage("Hi Alice, how are you?", "Bob")

    chat.addThreadMessage("I'm good, thanks for asking!", "Alice", 2)
    chat.addThreadMessage("How about you?", "Alice", 2)
    chat.addThreadMessage("I'm doing well too, thanks!", "Bob", 3)

    chat.printChat()
}