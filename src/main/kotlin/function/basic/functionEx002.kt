package function.basic

/**
 * named parameter
 */
fun main() {
    val width = 5.0
    val height = 7.0
    println("Rectangle area of width $width and height $height is ${rectangleArea(width, height)}")

    println("Rectangle area of height $height and width $width is ${rectangleArea(height = height, width = width)}")
}

fun rectangleArea(width: Double, height: Double) = width * height