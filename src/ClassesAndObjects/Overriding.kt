package ClassesAndObjects

open class Gadgets(val name : String , val category : String){
    var deviceStatus = "On"

    open fun turnOn(){

    }

    open fun turnOff(){

    }

    open fun increaseBrightNessLevel(){

    }
}

class Laptop(val deviceName : String, val deviceCategory : String) :
Gadgets(name = deviceName , category = deviceCategory){

    var brightnessLevel = 0
        set(value) {
            if(value in 1 .. 100){
                field = value
            }
        }

    override fun increaseBrightNessLevel(){
        brightnessLevel++
        println("BrightNess Level Increase by ${brightnessLevel}")
    }

    override fun turnOn(){
        deviceStatus = "On"
        println("BrighNessLevel ${brightnessLevel}")
    }

    override fun turnOff(){
        deviceStatus = "Off"
        println("Device is turnedOff")
    }
}

fun main(){
    var gadget : Gadgets = Laptop("MacBook","Productivity")
    gadget.turnOn()
    gadget.increaseBrightNessLevel()
}