fun main() {
    val nestedLists = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(1, 2, 3, 6,7)
    )

    val flattenedList = mutableListOf<Int>()
    val seenElements = mutableSetOf<Int>()

    for (list in nestedLists) {
        for (element in list) {
            if (seenElements.add(element)) { // Add to set returns true if element is added (not duplicate)
                flattenedList.add(element)
            }
        }
    }

    println("Original nested list: $nestedLists")
    println("Flattened list with unique elements: $flattenedList")
}
