fun main() {
    val s = "Subhashree".lowercase()  
    for (ch in 'a'..'z') {
        var c = 0 
        for (i in s.indices) {  
            if (ch == s[i]) {  // Access the character at index i
                c += 1
            }
        }
        if (c != 0) println("$ch=$c")  // Print character and count if count is not zero
    }
}