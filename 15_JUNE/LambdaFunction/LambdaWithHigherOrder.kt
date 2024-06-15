fun higherOrderFunction(word: List<String>, transform: (String)->String ) : List<String>{
    return word.map(transform)
}
fun main(){
    var list = listOf("Subhashree","Mohanty","Rakhi", "Surya", "Riya")
    var upperCaseList= higherOrderFunction(list){it.uppercase()}
    var lowerCaseList= higherOrderFunction(list){it.lowercase()}
    var reversedList= higherOrderFunction(list){it.reversed()}
    println("For list : $list")
    println("...............")
    println("UpperCase List: $upperCaseList")
    println("...............")
    println("LowerCase List: $lowerCaseList")
    println("...............")
    println("Reversed List: $reversedList")
}