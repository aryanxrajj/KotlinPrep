package Practice

open class Phone(var isScreenLightOn : Boolean = false){
    fun switchON(){
        isScreenLightOn = true
    }

    fun switchOff(){
        isScreenLightOn = true
    }

    fun checkPhoneScreenLight(){
        val PhoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $PhoneScreenLight.")
    }
}

class foldablePhone(var isScreenLighton: Boolean = false, var isFolded : Boolean = false) :
        Phone(isScreenLightOn = isScreenLighton){

        }

