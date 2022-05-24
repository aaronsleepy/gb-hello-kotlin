package function.basic

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val radius = 3.3
    println("Circle area $radius: ${circleArea(radius)}")
}

fun circleArea(radius: Double): Double {
    return PI * radius.pow(2)
}

fun circleArea2(radius: Double): Double = PI * radius.pow(2)

fun circleArea3(radius: Double) = PI * radius.pow(2)

// TODO: 이건 뭘까? run?
fun circleArea4(radius: Double) = run { PI * radius.pow(2) }