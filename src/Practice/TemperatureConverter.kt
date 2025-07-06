package Practice

fun main(){
    printFinalTemperature(27.0,"Celsius","Fahrenheit"){9.0/5.0 * it + 32}
    printFinalTemperature(27.0,"Kelvin","Celsius"){it - 273.15}
    printFinalTemperature(27.0,"Fahrenheit","Celsius"){5.0/9.0 * (it - 32) + 273.15}

}

fun printFinalTemperature(
    initialMeasurement : Double,
    initialUnit : String,
    finalUnit : String,
    conversionFormula : (Double) -> Double
){
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}