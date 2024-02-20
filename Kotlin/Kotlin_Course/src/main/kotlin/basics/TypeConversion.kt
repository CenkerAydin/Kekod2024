package basics

fun main() {

  //  val number: Int= (Int) 3L Böyle bir kullanım yoktur. Çalışmaz

    val schoolNum =126.toByte()
    val convertedNum: Short=schoolNum.toShort()

    println("schoolNum: "+schoolNum)
    println("converted: "+convertedNum)
}