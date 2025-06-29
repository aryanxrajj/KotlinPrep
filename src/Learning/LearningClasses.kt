package Learning

class LearningClasses(val a : Int, val b : Int){
    val Perimeter = (a + b) * 2
}

fun main(){
    val rectangle  = LearningClasses(5,2)
    println("The perimeter of a rectangle: ${rectangle.Perimeter}")
}