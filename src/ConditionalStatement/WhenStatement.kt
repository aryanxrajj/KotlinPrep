package ConditionalStatement

fun main(){
    val color = "red"

    //Uses when multiple branches needed
    when(color){
        "red" -> println("Stop")
        "yellow" -> println("Go Slow")
        "green" -> println("go")
    }

    //Uses of in statement
    val x = 2;
    when(x){
        3,5,7,9 -> println("X is prime no")
        in 1 .. 10 -> println("X is not a prime no")
        else -> println("Enter valid number")
    }


}