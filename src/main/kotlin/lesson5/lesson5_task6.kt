package lesson5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100
const val NORMAL_BODY_WEIGHT = 18.5
const val EXCESS_BODY_WEIGHT = 25.0
const val FATNESS = 30.0

fun main() {
    println("Enter your weight (in kilograms):")
    val weight = readln().toDouble()

    println("Enter your height (in centimeters):")
    val heightCm = readln().toDouble()

    val heightM = heightCm / CENTIMETERS_IN_METER

    val bmi = weight / heightM.pow(2)

    val category = when {
        bmi < NORMAL_BODY_WEIGHT -> "Insufficient body weight"
        bmi in NORMAL_BODY_WEIGHT..<EXCESS_BODY_WEIGHT -> "Normal body weight"
        bmi in EXCESS_BODY_WEIGHT..<FATNESS -> "Excess body weight"
        else -> "Fatness"
    }
    println("Your BMI: %.2f".format(bmi))
    println("Weight category: $category")
}