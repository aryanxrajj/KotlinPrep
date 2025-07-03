package ClassesAndObjects

open class SmartDevice(val name : String, val category : String){

}

class SmartTv(val devicesName : String , val deviceCategory : String) :
    SmartDevice(name = devicesName, category = deviceCategory){

        var speakerVolume = 2
            set(value) {
                if(value in 0 .. 100){
                    field = value
                }
            }
        var ChannelNumber = 1
            set(value) {
                if(value in 0 .. 200){
                    field = value
                }
            }
        fun increaseSpeakerVolume(){
            speakerVolume++;
            println("Speaker Volume increase to ${speakerVolume}")
        }

        fun increaseChannelNumber(){
            ChannelNumber++
            println("Channel Number Increased to ${ChannelNumber}")
        }
}

class SmartHome(val smartDevice: SmartTv){
    fun IncreaseVolume(){
        smartDevice.increaseSpeakerVolume()
    }
}

fun main(){
    var device1 = SmartTv("LGTV","Electrical")
    println(device1.devicesName)
    println(device1.ChannelNumber)
    device1.increaseChannelNumber()
    device1.increaseSpeakerVolume()
    var device2 = SmartHome(SmartTv("RealMe","Electrical"))
    device2.IncreaseVolume()

}