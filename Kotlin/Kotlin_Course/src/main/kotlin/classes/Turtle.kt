package classes

fun main() {
    val turtle= Turtle("ads",3)
    val turtle2=Turtle("tosba",3)
    val turtle3= Turtle("tos",6,false)
    turtle.makeSound()
    turtle.walk()
}
class Turtle(mname: String="sdfas", mfeetCount:Int) {
    val feetColor: String ="Brown"
    var feetCount: Int=4
    val headCount: Int=1
    val headColor: String ="Brown"
    val shelterColor: String ="Green"
    val tailCount: Int=1
    val tailColor: String ="Brown"
    var name: String="Tos"
    val age:Int=1
    val sex: String="Female"

    init {
        println("Primary Constructor created")
        name=mname
        feetCount=mfeetCount
    }

    constructor(mName: String= "Tosbik", mfeetCount: Int=4, isMarried: Boolean ): this(mName,mfeetCount){
            println("Secondary constructor created")
    }
    fun makeSound(): String{
        return "ereafa"
    }
    fun walk(){

    }

    fun swim(){

    }
}