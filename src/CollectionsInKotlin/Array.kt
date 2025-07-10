package CollectionsInKotlin

fun main(){
    val arr = arrayOf<String>("Aryan","Paras","Misty","Chicki")
    println(arr[0])

    var arr2 = arrayOf<String>("Arman","Samar","Akarsh")
    var arr3 = arr + arr2

    print(arr3[6])
}