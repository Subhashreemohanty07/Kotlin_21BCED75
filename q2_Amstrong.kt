
fun main() {
    var n=371
    var temp=n
    var add=0
    while(n>0)
    {
        var rem=n%10;
        add=add+(rem*rem*rem);
        n=n/10;
    }
    if(temp == add) println("It is an Armstrong Number")
    else println("It is not a Amstrong Number")
}