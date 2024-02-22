package basics

import java.util.*

fun main() {

    val name ="Cenker"
    val char1='C'
    val char2='e'
    val char3='n'
    val char4='k'
    val char5='e'
    val char6='r'

    val nameArr= charArrayOf(char1,char2,char3,char4,char5,char6)
    for (char in nameArr){
        print(char)
    }

    val awesomeKekod= "Kekod is Awesome"
    val firstChar=awesomeKekod[awesomeKekod.indices.first]
    val firstChar2=awesomeKekod[1]
    val lastChar=awesomeKekod[awesomeKekod.indices.last]
    val lastChar2=awesomeKekod[15]


    var surName="Cenk"
    surName= "Cenker"
    println(surName.uppercase())
    println(surName)

    val numbers: String ="value" +(4+2+8)  //value 14
  //  val numbers2: String= (4+2+8) +"value" //Çalışmaz.
    println("numbersValue "+numbers)
    println("numbersValue $numbers")
    println("numbersValue ${numbers.length}")

    val rawPineTree ="""
                *
    $          ***            
              *****
    """.trimIndent()

    val yas=22
    val mesaj= String.format("Yaşım: %d",yas)
    println(mesaj)

    val boy =1.77
    val mesajBoy=String.format("Boyum: %.2f metre", boy)
    println(mesajBoy)

    val ad= "Cenker"
    val nameMesaj=String.format("Adım: %s, Yaşım: %d, Boyum: %.2f",ad,yas,boy)
    println(nameMesaj)

    val sayi=1234567.89
    val usFormat= String.format(Locale.US, "Us formatında: %,.2f",sayi)
    println(usFormat)

    val localeTR= Locale("tr","TR")
    val usFormatTR= String.format(localeTR,"TR formatında: %,.3f",sayi)
    println(usFormatTR)

}