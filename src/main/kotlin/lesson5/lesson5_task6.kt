package lesson5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100

fun main() {
    println("Enter your weight (in kilograms):")
    val weight = readln().toDouble()

    println("Enter your height (in centimeters):")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CENTIMETERS_IN_METER

    val bmi = weight / heightM.pow(2)

    val category = when {
        bmi < 18.5 -> "Insufficient body weight"
        bmi in 18.5..24.9 -> "Normal body weight"
        bmi in 25.0..29.9 -> "Excess body weight"
        else -> "Fatness"
    }

    println("Your BMI: %.2f".format(bmi))
    println("Weight category: $category")
}