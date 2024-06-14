fun main() {
    val words = listOf("apple", "ant", "banana", "ball", "bat", "cat", "dog","deer","goat", "kite")

    // Grouping the strings by their first character
    val groupedByFirstChar = words.groupBy { it.first() }

    // Counting the number of strings in each group
    val countByFirstChar = groupedByFirstChar.mapValues { it.value.size }

    // Printing the grouped strings and their counts
    println("Grouped strings by first character:")
    for ((char, list) in groupedByFirstChar) {
        println("$char: $list")
    }

    println("\nCount of strings in each group:")
    for ((char, count) in countByFirstChar) {
        println("$char: $count")
    }
}
