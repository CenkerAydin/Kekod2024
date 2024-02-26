package basics

fun main() {
    val numbers=1..100 //[1,100]
    val numbers2=1.rangeTo(100)

    val numbersUntil= 1.rangeUntil(100) //[1,100)
    val numbersUnt= 1..<100

    val reverse=100.downTo(1)

    val numberList: IntRange = 10..<90
    numberList.first
    numberList.last
    numberList.step

    when(10){
        in numberList ->{
            println("10 sayısı numberlist içerisinde yer alır")
        }
    }
    numberList.count()

    val b: Byte=10
    val c: Byte=10
    println(b===c)
}