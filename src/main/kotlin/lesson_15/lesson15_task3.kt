package lesson_15

abstract class ForumUser(val name: String) {
    fun readPosts() = println("$name is reading posts on the forum")

    fun writePosts(post: String): String {
        println("$name wrote a post: \"$post\"")
        return post // Возвращаем текст поста для дальнейшего использования. Например, чтобы не
    // набирая вручную текст удаляемого поста выводить в консоль, какой именно пост мы удалили
    }
}

class RegularUser(name: String) : ForumUser(name)

class AdminUser(name: String) : ForumUser(name) {
    fun deletePost(post: String) = println("$name deleted the post: \"$post\"")

    fun deleteUser(user: ForumUser) = println("$name deleted the user ${user.name}")
}

fun main() {
    val user1 = RegularUser("Alice")
    val user2 = AdminUser("Markus")

    user1.readPosts()
    val newPost = user1.writePosts("Click on the link and get a welcome bonus from the casino \"1xBet\"!")

    user2.readPosts()
    val newPost2 = user2.writePosts("I remind everyone that casino advertising is prohibited on this forum!")
    user2.deletePost(newPost)
    user2.deleteUser(user1)
    user2.deletePost(newPost2)
}