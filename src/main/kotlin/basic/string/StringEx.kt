package basic.string

import java.util.*

fun main() {
    val name = "Song"
    println("Hello, $name!\n Today is ${Date()}")

    val message = """
        Hello, $name
        Today is ${Date()}
    """.trimIndent()
    println(message)
}