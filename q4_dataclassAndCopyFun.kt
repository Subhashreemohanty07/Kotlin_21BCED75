fun main() {
    val person1 = Person("Subhashree Mohanty", 21, "cuttack")
    val person2 = person1.copy(age = 22, address = "11,main street,bbsr")
    // Print the original and the new instance
    println("Original person:- $person1")
    println("New person:- $person2")
}
data class Person(val name: String, val age: Int, val address: String)
