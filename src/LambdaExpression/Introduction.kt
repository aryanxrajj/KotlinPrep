package LambdaExpression

fun main(){
    var trickFunction = trick2
    trick2()
    trickFunction()
}

val trick2 = {
    println("No treats")
}