package Learning

fun main(){
    println("Enter you Word: ")
    val yourword = readln()
    println(yourword)

    println(sum(2,3))
    println(sum2(3,4))
}

fun sum(a : Int , b : Int) : Int{
    return a + b
}

fun sum2(a : Int, b : Int) : Unit{//Unit Can be Omitted Also
    println("Sum of Two Numbers are: ${a+b}")
}