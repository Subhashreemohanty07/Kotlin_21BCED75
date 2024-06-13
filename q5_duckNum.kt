fun main() {
    val n = "1234"

    if (n.startsWith('0')) {
        println("It is not a duck number")
    } else {
        var k = false 

        for (ch in n) {
            if (ch == '0') {
                k = true
                break // Exit the loop if '0' is found
            }
        }
        
        if (k) {
            println("It is a duck number")
        } else {
            println("It is not a duck number")
        }
    }
}
