package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.FileNotFoundException

class FileReader {
    fun readFileContent(path: String): String {
        val fileExists = File(path).exists()
        if (!fileExists) {
            throw FileNotFoundException("File not found at path: $path")
        }
        val content = File(path).readText()
        return content
    }
}
