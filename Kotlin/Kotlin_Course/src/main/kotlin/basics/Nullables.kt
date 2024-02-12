package basics

fun main() {
    val name:String?=null
    val age:Int?=null

    val number=null
    val number3=null //Nothing?

    var number1: Int?=null
    var number2: Int?=null

    var result: Int?=0
    result!!.plus(240) //!!. ->null olmadığına garanti veirlir.
    result?.plus(240) // ?. -> null ise çalışmaz null değilse çalışır.

    number1 = readLine()!!.toInt() //readLine null olamaz.
    number2= readLine()!!.toInt() //number1 ile aynı durum var.

    result =number1+number2 //readline null olamayacağını söylediğimiz için burada herhangi
    //bir işlem yapmamıza gerek yok.
    println(result)
}