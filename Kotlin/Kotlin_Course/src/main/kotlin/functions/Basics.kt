package functions

import java.util.*

val name: String = "Cenker"
fun name(): String = "Cenker"

fun main() {
    takeSquare()
    takeSquare(3)
    takeSquare(2, 5)
    takeSquare(number2 = 6)
    val squareValue = takeSquare(2)

    Math.pow(2.0, 3.0)

    reformatMessage("Message", true, 7, "tr")
    reformatMessage("Message", size = 7, lang = "tr")
    reformatMessage("Message", true, 7)
    reformatMessage("Message", size = 7)

    getUserInfo("Cenker","Aydın","Antalya","Turkiye", key = 3)
    getUserInfo(*arrayOf("Cenker","Aydın","Antalya"), key = 4)
    getUserInfo3(key = 3,"Cenker","Aydın","Istanbul")
}

fun takeSquare(number1: Int = 4, number2: Int = 5): Int {


    return number1 * number1
}

fun reformatMessage(message: String, isUpperCase: Boolean = false, size: Int, lang: String = "tr") {
    val locale = if (lang == "eng") {
        Locale.ENGLISH
    } else {
        Locale.ROOT
    }
    val localMessage = if (isUpperCase) {
        message.uppercase(locale)
    } else {
        message.lowercase(locale)
    }
    println("Message: $localMessage")
}

fun getUserInfo(vararg userInfo:String, key:Int){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg userInfo: String){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo3(key:Int, vararg userInfo:String){
    userInfo[3]
    userInfo.get(3)
}

val userlist= arrayOfNulls<String>(5)
fun getListCount()= userlist.size
fun getListCount2(): Int{
    return userlist.size
}