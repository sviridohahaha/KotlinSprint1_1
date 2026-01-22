package lesson_18

open class Box() {
    open val length = 0.0

    open fun surfaceArea() = println()
}

class CubeBox() : Box() {
    override val length = 24.9

    override fun surfaceArea() {
        val area = 6 * length * length
        println("Surface area of cube box: $area")
    }
}

class RectangularBox() : Box() {
    override val length = 15.8
    val width = 7.2
    val height = 10.3

    override fun surfaceArea() {
        val area = 2 * (length * width + length * height + width * height)
        println("Surface area of rectangular box: $area")
    }
}
