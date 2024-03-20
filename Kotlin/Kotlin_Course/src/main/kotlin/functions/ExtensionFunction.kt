package functions

import java.awt.Shape

fun main() {

    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber: Int = 1466
    println(schoolNumber)

    val tcIdentityNumber: Long = 1232131231
    println(tcIdentityNumber)

    log2(pi, "Double Number")
    log2(schoolNumber,"Int Number")
    log2(tcIdentityNumber,"Long Number")

    (3 + 0.14).log("")
    1466.log("")
    1466.toFloat()
    123124124.log("")

    (3 + 0.14) log ""

    pi.log("Double Number")
    schoolNumber.log("Int Number")
    tcIdentityNumber.log("Long Number")

    val result: Int = "3".extPlus("5")
    val result2: Int = "5".extPlus("7")
}

//Normal fonksiyon
fun log2(number: Number, message: String) {
  println("$message $number")
}

infix fun Number.log(emptyParam: String) {
    println(emptyParam + this)
}

infix fun String.extPlus(otherString: String): Int = this.toInt() + otherString.toInt()
open class Shape{
    private var intNumber=0
    private fun SetNumber(intNumber: Int){
        this.intNumber =intNumber
    }

}
var Shape.type
    get() =" Rectangle"
    set(value) {
        type=value
    }