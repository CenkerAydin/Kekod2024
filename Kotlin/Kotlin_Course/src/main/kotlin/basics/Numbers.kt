package basics

fun main() {

    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue :" + minByteValue)
    println("maxBytetValue :" + minByteValue)
    println("minShortValue :" + minShortValue)
    println("maxShortValue :" + maxShortValue)
    println("minIntValue :" + minIntValue)
    println("maxIntValue :" + maxIntValue)
    println("minLongValue :" + minLongValue)
    println("maxLongValue :" + maxLongValue)
    println("minFloatValue :" + minFloatValue)
    println("maxFloatValue :" + maxFloatValue)
    println("minDoubleValue :" + minDoubleValue)
    println("maxDoubleValue :" + maxDoubleValue)

    val longNumber = 1586L
    val floatNumber = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimal = 1903
    val hexadecimal = 0x759
    val binary = 0b0100011

    val oneMillion = 1_000_000 //1000000

    val number: Int = 100
    val boxedNumber: Int? = number
    val anotherBoxedNumber: Int? = number
    println(boxedNumber === anotherBoxedNumber) //true

    val number2: Int = 10000
    val boxedNumber2: Int? = number2
    val anotherBoxedNumber2: Int? = number2
    println(boxedNumber2 === anotherBoxedNumber2) //false


}