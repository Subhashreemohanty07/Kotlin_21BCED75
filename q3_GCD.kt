fun main() {
    var a=98
    var b=56
    var n1=a
    var n2=b
    
    while (n2!=0){
        val temp= n2
        n2=n1%n2
        n1=temp
        
    }
    println("GCD of $a and $b is $n1")
 }