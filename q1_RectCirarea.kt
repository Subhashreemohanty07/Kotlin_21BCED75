fun calArea(length: Double, breadth: Double): Double {
    return length * breadth
}
fun calArea(radius: Double): Double {
    return 3.14 * radius * radius
}

fun main() {
    val rectangle = calArea(12.0,6.0)
    println("Area of the rectangle: $rectangle")
    val circleArea = calArea(4.5)
    println("Area of the circle: $circleArea")
}
