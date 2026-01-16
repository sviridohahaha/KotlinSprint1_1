package lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun calculateCircumference() = 2 * pi * radius

    fun calculateArea() = pi * radius * radius
}

fun main() {
    val circle = Circle(5.2)
    val circumference = circle.calculateCircumference()
    val area = circle.calculateArea()

    println("The circumference of the circle: $circumference")
    println("The area of the circle: $area")
}