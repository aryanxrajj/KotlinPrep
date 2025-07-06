package Practice

class Person(val name : String,val age : Int, val hobby : String?,val referrer : Person?){
    fun showProfile(){
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby")
        if(referrer != null){
            println("Has a referrer named ${referrer.name}")
            println("Who likes to do ${referrer.hobby}")
        }
    }
}

fun main(){
    val aryan = Person("Aryan",21,"Coding",null)
    val misty = Person("Misty",20,"Backchodi",aryan)

    aryan.showProfile()
    misty.showProfile()
}