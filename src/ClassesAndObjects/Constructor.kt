package ClassesAndObjects

class Constructor(val name : String , val category: String) { //Primary Constructor
    var devicestatus = "Online"

    constructor(name : String, StatusCode : Int) : this(name,"Default"){
        devicestatus = when(StatusCode){
            1 -> "Online"
            0 -> "Offline"
            else -> "Unknown"
        }
    }


    fun turnOn(){
        println("Devices are turnedOn")
    }

    fun turnOff(){
        println("Devices are turnedOff")
    }
}

fun main(){
    val device = Constructor("Fan","Electrical")
    val device2 = Constructor("TV",0)
    println(device2.devicestatus)
    println(device2.category)
    println(device.turnOn())
}