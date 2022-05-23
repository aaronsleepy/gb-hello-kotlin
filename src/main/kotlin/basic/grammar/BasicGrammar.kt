package basic.grammar

fun main() {
    // immutable val
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)

    // mutable var
    var x = 5
    x += 1
    print(x)
}