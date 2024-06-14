fun String.isPalindrome(): Boolean {
    val cleanedString = this.replace(" ", "").lowercase()
    return cleanedString == cleanedString.reversed()
}

fun main() {
    println("eye".isPalindrome())  
    println("asddsa".isPalindrome())    
    println("A man is walking".isPalindrome())  
}