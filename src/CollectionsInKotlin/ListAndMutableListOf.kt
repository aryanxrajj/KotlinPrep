package CollectionsInKotlin

fun main(){
    var list = listOf("Aryan","Paras")
    println(list.size)
    println(list[0])

    var list2 = mutableListOf("Samar","Chicki")
    list2.add(0,"Aryan")

    println(list2[0])
}