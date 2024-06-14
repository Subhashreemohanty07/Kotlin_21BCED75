fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    // Using higher-order functions filter and map
    val result = numbers
        .filter { it % 2 == 0 } // Filter out odd numbers
        .map { it * 2 }         // Double the even numbers
    println("Original list: $numbers")
    println("Resultant list: $result")
}
