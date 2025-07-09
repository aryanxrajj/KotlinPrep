package ClassesAndObjects

class Questions<T>(
    val question : String,
    val answer : T,
    val difficulty : Difficulty
) {
    fun printDetails(){
        println("$question $answer $difficulty");
    }
}

class Quiz{
    val question1 = Questions<String>("Capital of India","Delhi",Difficulty.EASY)
    val question2 = Questions<Boolean>("Delhi is the Capital Of India",true,Difficulty.EASY)

    companion object StudentProgress{
        val Passed : Int = 7
        val Total : Int  = 10
    }

    fun printQuiz(){
        question1.let {
            println(it.question)
            println(it.answer)
            println(it.difficulty)
        }
    }
}

enum class Difficulty{
    EASY, MEDIUM, HARD
}

fun Quiz.StudentProgress.printProgressText(){
    repeat(Quiz.Passed){
        print("▓")
    }
    repeat(Quiz.Total - Quiz.Passed){
        print("▒")
    }
    println()
    println(Quiz.progressText)
}

//Extension Property
val Quiz.StudentProgress.progressText : String
    get() = "$Passed out by $Total"

fun main(){
    val question1 = Questions("Whats Your Name","Aryan",Difficulty.EASY);
    val question2 = Questions("Whats Your Age",21,Difficulty.MEDIUM);
    val question3 = Questions("What you Do","Coding",Difficulty.HARD)
//    question1.printDetails()
//    question2.printDetails()
//    question3.printDetails()

    val quiz = Quiz()
    quiz.question1.printDetails()
    quiz.printQuiz()
    println(Quiz.printProgressText())

    //Using of let function



}