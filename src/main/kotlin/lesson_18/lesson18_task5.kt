package lesson_18

class Screen {
    fun drawPoint(x: Int, y: Int) = "Drawn a Point at coordinates: ($x, $y) with Int values"

    fun drawPoint(x: Float, y: Float): String = "Drawn a Point at coordinates: ($x, $y) with Float values"

    fun drawCircle(x: Int, y: Int, radius: Int) =
        "Drawn a Circle with radius $radius at coordinates: ($x, $y) with Int values"

    fun drawCircle(x: Float, y: Float, radius: Float) =
        "Drawn a Circle with radius $radius at coordinates: ($x, $y) with Float values"

    fun drawSquare(x: Int, y: Int, side: Int) =
        "Drawn a Square with side length $side at coordinates: ($x, $y) with Int values"

    fun drawSquare(x: Float, y: Float, side: Float) =
        "Drawn a Square with side length $side at coordinates: ($x, $y) with Float values."
}
