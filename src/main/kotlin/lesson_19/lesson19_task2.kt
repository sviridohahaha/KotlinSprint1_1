package lesson_19

enum class ProductCategory {
    CLOTHING, STATIONERY, MISCELLANEOUS;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHING -> "Clothing"
            STATIONERY -> "Stationery"
            MISCELLANEOUS -> "Miscellaneous"
        }
    }
}

class Product(val name: String, val id: Int, val category: ProductCategory) {
    fun productInfo() = println("Product ID - $id, name - $name, category - ${category.getCategoryName()}")
}

fun main() {
    val product1 = Product("T-shirt", 101, ProductCategory.CLOTHING)
    val product2 = Product("Notebook", 102, ProductCategory.STATIONERY)
    val product3 = Product("USB Cable", 103, ProductCategory.MISCELLANEOUS)

    product1.productInfo()
    product2.productInfo()
    product3.productInfo()
}
