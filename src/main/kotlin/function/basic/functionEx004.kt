package function.basic

/**
 * varag
 */

fun printSorted(vararg items: Int) {
    items.sort()
    println(items.contentToString())
}

fun main() {
    printSorted(6, 2, 10, 1)

    // spread operator *
    val a = intArrayOf(6, 2, 10, 1)
    printSorted(*a)
    println(a.contentToString())        // * copy array deeply
}