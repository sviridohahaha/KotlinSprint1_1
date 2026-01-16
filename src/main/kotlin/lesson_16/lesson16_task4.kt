package lesson_16

class Order(val orderNumber: Int, private var status: String) {

    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("The order status has been updated to: $status")
    }

    fun requestStatusChange(newStatus: String) {
        println("Requesting manager to update the status...")
        changeStatus(newStatus)
    }
}