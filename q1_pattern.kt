fun main() {
    var row=5;
    for(i in 1..row)
    {
        for(j in 1..(row-i)) print(" ")
        for(j in 1..(2*i-1))  print("*")
        println(" ")
    }
    
    for(i in 1..row){
        for(j in 1..(i-1)) print(" ") 
        for(j in 1..(2*(row-i)+1)) print("*") 
        println(" ")
        
    }
}

