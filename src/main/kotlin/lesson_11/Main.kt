package lesson_11

fun main() {
    val user1 = User(
        id = 1,
        login = "Ronaldo",
        password = "7777777",
        email = "ronaldo@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "Messi",
        password = "73501505",
        email = "messi@mail.ru",
    )

    println("User 1 details: ID = ${user1.id}, Username = ${user1.login}, Password = ${user1.password}, Email = ${user1.email}")
    println("User 2 details: ID = ${user2.id}, Username = ${user2.login}, Password = ${user2.password}, Email = ${user2.email}")
}