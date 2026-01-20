package lesson_17

class Folder(folderName: String, fileCount: Int, isSecret: Boolean) {
    val privacy = isSecret
    val name = folderName
        get() = if (privacy) "Hidden Folder" else field

    val fileAmount = fileCount
        get() = if (privacy) 0 else field
}

fun main() {
    val secretFolder = Folder("Secret Documents", 5, true)

    println("Folder Name: ${secretFolder.name}")
    println("Number of Files: ${secretFolder.fileAmount}")
}
