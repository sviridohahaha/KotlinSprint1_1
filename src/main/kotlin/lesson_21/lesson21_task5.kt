package lesson_21

fun Map<String, Int>.maxCategory(): String = maxBy { it.value }.key
