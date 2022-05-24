package basic.array

import java.util.*

fun main() {
    val a = emptyArray<String>()
    val b = arrayOf("hello", 1)
    println(a.contentDeepToString())
    println(b.contentDeepToString())

    val size = 4;
    val squares = Array(4) { (it + 1) * (it + 1)}
    println(squares.contentDeepToString())

    var x = IntArray(4) { (it + 1) * (it + 1)}
    println(x.contentToString())
}