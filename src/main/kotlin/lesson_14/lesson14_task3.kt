package lesson_14

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun area() = Math.PI * radius * radius

    override fun perimeter() = 2 * Math.PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun area() = width * height

    override fun perimeter() = 2 * (width + height)
}

fun main() {
    val figures: List<Figure> = listOf(
        Circle("black", 5.4),
        Rectangle("white", 4.1, 6.9),
        Circle("white", 13.7),
        Rectangle("black", 7.4, 18.8)
    )

    val blackFiguresPerimeter = figures.filter { it.color == "black" }.sumOf { it.perimeter() }

    val whiteFiguresArea = figures.filter { it.color == "white" }.sumOf { it.area() }

    println("Total perimeter of black figures: $blackFiguresPerimeter")
    println("Total area of white figures: $whiteFiguresArea")
}