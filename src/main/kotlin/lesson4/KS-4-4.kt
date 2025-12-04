package lesson4

fun main(){
    val day = 5

    val isArmsAndAbs = day % 2 != 0

    println("""
        Упражнения для рук: $isArmsAndAbs
        Упражнения для ног: ${!isArmsAndAbs}
        Упражнения для спины: ${!isArmsAndAbs}
        Упражнения для пресса: $isArmsAndAbs
    """.trimIndent())
}