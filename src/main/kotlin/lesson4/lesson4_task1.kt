package lesson4

const val SOLD_OUT = 13

fun main(){
    val reservedToday = 13
    val reservedTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedToday < SOLD_OUT}")
    println("Доступность столиков на завтра: ${reservedTomorrow < SOLD_OUT}")
}