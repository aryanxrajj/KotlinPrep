package ConditionalStatement

fun main(){
    val number = 1

    if(number == 1){
        println(true)
    }

    val color  = "Yellow"
    if(color == "Red"){
        println("Stop")
    }else if(color == "Yellow"){
        println("Go Slow")
    }else{
        println("Go")
    }
}