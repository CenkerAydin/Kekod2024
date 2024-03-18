package controlflow

fun main() {

    val countryCode= readln()
    when(countryCode.lowercase()){
        "tr","az" -> println("Türk Vatandaşı")
        "ar" -> println("Arap")
        "fr" -> println("Fransız")
        "ru" -> println("Rus")
        "uk" -> println("İngiliz")
    }

    when{
        (countryCode.lowercase() =="tr").and(countryCode.lowercase()=="az") -> println("Türk")
        countryCode.lowercase() =="ar" -> println("Arap")
        countryCode.lowercase() == "ru" -> println("Rus")
        countryCode.lowercase() =="uk" -> println("İngiliz")
    }

    val phone= 5362524324
    when(phone) {
        is Long -> println("Long")
        !is Long -> println("Long değil")
    }

    val number =3
    when(number){
        in 0..10 -> println("İçerde")
        in 11..20 -> println("Dışında")
    }
}