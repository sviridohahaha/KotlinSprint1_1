package lesson_17

class Folder(private val folderName: String, private val fileCount: Int, private val isSecret: Boolean) {
    val name: String
        get() = if (isSecret) "Hidden Folder" else folderName

    val fileAmount: Int
        get() = if (isSecret) 0 else fileCount
}

fun main() {
    val secretFolder = Folder("Secret Documents", 5, true)

    println("Folder Name: ${secretFolder.name}")
    println("Number of Files: ${secretFolder.fileAmount}")
}