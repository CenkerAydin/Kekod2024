package basics

fun creatName(): String {
    val name: String = "Cenker"
    return name
}

fun creatAge(): Int {
    val age: Int = 22
    return age
}

fun createIsMale(): Boolean {
    val isMale: Boolean = true
    return isMale
}

fun createFirstLetterOfSurname(): Char {
    val firstLetterSurName: Char = 'A'
    return firstLetterSurName
}

fun createKnownLanguageList(): Array<String> {
    val knownLanguageList: Array<String> = arrayOf("AZ", "EN", "TR")
    return knownLanguageList
}

fun createSurnameWithoutFirstInit(): String {
    val surName: String
    surName = "Aydın"
    return surName
}

class Box {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 60
    var usedSpace: Int = 0

    val avaliableSpace: Int
        get() {
            return (width * height * length) - usedSpace
        }
}

fun calculateAvaliableSpace() {
    val box = Box()
    box.height = 10
    box.width = 30
    box.length = 5
    box.usedSpace = 2
    println(box.avaliableSpace)

    box.height=30
    box.width=10
    box.length=7
    box.usedSpace=0
    println(box.avaliableSpace)
}

class User{
    val name:String ="Cenker"
    var surName:String="Aydın"
        private set
}

fun testUser(){
    val user=User()
    //user.name="Cenk" -> Çalışmaz.Val cannot reassigned.
    //user.surName="Ayd" ->Çalışmaz.Var ama private set yaparak readonly yaptık.
}