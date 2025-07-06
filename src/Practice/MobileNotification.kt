package Practice

fun main(){
    val morningNotification = 13
    val eveningNotification = 135

    printSummary(morningNotification)
    printSummary(eveningNotification)
}

fun printSummary(numberOfMessage : Int){
    if(numberOfMessage <= 99){
        println("You have $numberOfMessage notifications.")
    }else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}