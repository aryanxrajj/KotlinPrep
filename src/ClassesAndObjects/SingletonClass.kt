package ClassesAndObjects

object StudentProgress{
    val total : Int = 10
    val passed : Int = 4
}


fun main(){
    println("${StudentProgress.passed} out of ${StudentProgress.total}")
}