fun main() {
    val numbers = listOf(1,1, 2, 2,3, 3, 3, 4, 4, 4, 4,4)

    val frequencyMap = getFrequencyMap(numbers)

    println("Original list: $numbers")
    println("Frequency map: $frequencyMap")
}

fun getFrequencyMap(numbers: List<Int>): Map<Int, Int> {
    // Grouping the numbers by their value and then counting occurrences
    return numbers.groupingBy { it }.eachCount()
}
