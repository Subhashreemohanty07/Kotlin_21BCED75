fun main() {
    val rect = Rectangle(7.0, 2.0)
    val circ = Circle(4.0)
    
    println("Area of rectangle: ${rect.area()}")
    println("Perimeter of rectangle: ${rect.perimeter()}")
    println("..............................")
    println("Area of circle: ${circ.area()}")
    println("Perimeter of circle: ${circ.perimeter()}")
}

// Abstract class Shape with an abstract method area
abstract class Shape {
    abstract fun area(): Double
}
class Rectangle(private val length: Double, private val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }
    
    fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
    
    fun perimeter(): Double {
        return 2 * 3.14 * radius
    }
}