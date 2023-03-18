package function.basic

fun swap(s: String, from: Int, to: Int): String {
    val chars = s.toCharArray()
    val tmp = chars[from]
    chars[from] = chars[to]
    chars[to] = tmp
    return chars.concatToString()
}

fun main() {
    println(swap("Hello", 1, 2))
    println(swap("Hello", from = 1, to = 2))
    println(swap("Hello", to = 2, from = 1))
}