package lesson_21

fun List<Int>.evenNumbersSum() = filter { it % 2 == 0 }.sum()
