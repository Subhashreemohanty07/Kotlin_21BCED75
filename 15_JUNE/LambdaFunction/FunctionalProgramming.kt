fun main() {
    val people = listOf(
        "subhashree" to 30,
        "priya" to 25,
        "rakhi" to 35,
        "riya" to 60
    )

    val sortedPeople = people.sortedBy { it.second }
    
    println(sortedPeople)
}