package ClassesAndObjects

class SmartDevices {
    val name = "Andriod Tv"

    fun turnOn(){
        println("Tv is On")
    }

    fun turnOff(){
        println("Tv is Off")
    }
}

fun main(){
    val device = SmartDevices()
    println("Device name is ${device.name}")
    println(device.turnOn())
}