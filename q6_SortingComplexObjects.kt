data class Person(val name: String, val age: Int)

fun main() {
    val persons = listOf(
        Person("Ipsita", 25),
        Person("Surya", 37),
        Person("Subhashree", 20),
        Person("Rakhi", 26),
        Person("Priya", 30)
    )

    val sortedPersons = persons.sortedWith(compareBy({ it.age }, { it.name }))
    println("Sorted persons:-")
    sortedPersons.forEach { println("${it.name} - ${it.age}") }
}
