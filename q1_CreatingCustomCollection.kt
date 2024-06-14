fun addUniqueEle(list: MutableList<Int>, element: Int): Boolean {
    return if (element !in list) {
        list.add(element)
        true
    } else {
        false
    }
}

fun removeEle(list: MutableList<Int>, element: Int): Boolean {
    return list.remove(element)
}

fun main() {
    val number = mutableListOf(1, 2, 3, 4, 5)
    println("Initial list: $number")
    println(".......................")
    // Add an element (7)
    val added = addUniqueEle(number, 7)
    println("add 7 to initial list: $added")
    println("List after adding 7: $number")
    println(".......................")

    // Try to add a duplicate element (2)
    val addedDuplicate = addUniqueEle(number, 2)
    println("add duplicate element to list 2: $addedDuplicate")
    println("List after attempting to add duplicate 2: $number")
    println(".......................")
    // Remove an element (4)
    val removed = removeEle(number, 4)
    println("Remove 4 fom list: $removed")
    println("List after removing 4: $number")
    println(".......................")
    // Attempt to remove an element that doesn't exist (10)
    val removedNonExistent = removeEle(number, 10)
    println("remove 10 from list: $removedNonExistent")
    println("List after attempting to remove 10: $number")
}
