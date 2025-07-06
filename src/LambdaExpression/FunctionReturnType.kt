package LambdaExpression

fun main(){
    val coins : (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake : (Int) -> String = { quantity ->
        "Have Cupcake"
    }

    val TrickFunction = trickOrTreat(false){"$it quarters"}
    val TreatFunction = trickOrTreat(true,cupcake)

    repeat(4){
        TrickFunction()
    }

    println()
    TreatFunction()
}

fun trickOrTreat(isTrick : Boolean , extraTreat : (Int) -> String) : () -> Unit {
    if(isTrick){
        println(extraTreat(5))
        return trick
    }else{
        println(extraTreat(5))
        return treat
    }
}

val trick = {
    println("No Treat")
}

val treat = {
    print("Have A Treat!")
}