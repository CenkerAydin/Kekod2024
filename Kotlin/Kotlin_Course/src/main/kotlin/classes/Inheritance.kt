package classes

 open class Animal(open val name: String="", val feetCount: Int=4) {

    var origin: String = "BullDog"
    var tailShape: String = "Oval"

    open fun makeSound(): String {
        return ""
    }

    fun attack() {

    }

    fun eat() {

    }

    fun walk() {

    }
}

class Dog(name:String, feetCount: Int): Animal(name, feetCount) {
    override fun makeSound(): String {
        return "hav hav"
    }

}

class Cat(override val name: String, feetCount: Int): Animal(name,feetCount) {
    override fun makeSound(): String {
        return "miav miav"
    }
}

fun main() {

    val dog= Dog("asd,",4)
    val cat=Cat("asdasd",4)
    dog.name
    cat.name
    println(dog.makeSound())
    println(cat.makeSound())
}