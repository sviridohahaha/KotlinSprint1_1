package lesson2

fun main() {
    val employeesAmount = 50
    val employeesSalary = 30000
    val internAmount = 30
    val internSalary = 20000

    val totalEmployeesSalary = employeesAmount * employeesSalary
    val totalSalary = totalEmployeesSalary + internAmount * internSalary
    val averageSalary = totalSalary / (employeesAmount + internAmount)

    println(totalEmployeesSalary)
    println(totalSalary)
    println(averageSalary)
}