package basics

fun main() {
    val studentNumber = arrayOf(13, 45, 53, 54, 56)
    val studentNames = arrayOf("Ahmet", "Cenker", "Ersin", "Derya")
    val firstCharOfNames = arrayOf("A", "C", "E", "D")
    val mixedArray = arrayOf<Any>(13, "Cenker", 'd', true)

    val arrayOfNull = arrayOfNulls<String>(4)
    println(arrayOfNull.joinToString())

    val emptyArr = emptyArray<String>()
    var emptyArr2: Array<String> = emptyArr

    var citiesArr = arrayOf("İST", "HAT", "ADN")
    citiesArr += "Siv"
    citiesArr += arrayOf("İzm", "Kon")
    println(citiesArr.joinToString())

    var carNames = Array<Double>(5) {
        3.14 * it
    }

    val firstChar = CharArray(4)
    firstChar[0] = 'T'
    firstChar.set(1, 'E')
    firstChar.set(3, 'a')
    firstChar[2] = 'd'

    println(firstChar.get(2))
    println(firstChar[2])

    val awesome = arrayOfNulls<String>(5)
    awesome[2] = "cenker"
    // awesome = arrayOf("foo","boo") //Çalışmaz.

    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    //[0,0],[0,0]

    val threeDArray = Array(3) { Array(3) { Array<Int>(3) { 0 } } }
    println(threeDArray.contentDeepToString())

    val simpleArray= arrayOf(1,2,3)
    //Accesses the element and modifies it
    simpleArray[0]=10
    twoDArray[0][0]=2
    println(simpleArray[0].toString())
    println(twoDArray[0][0].toString())

    val letters= arrayOf("c","d")
    printAllStrings("a","b","c","d")
    printAllStrings("a","b", *letters,"f")
    printAllStrings("a","b","c","d","f")

    val arr1= intArrayOf(1,2,3)
    val arr2= intArrayOf(1,2,3)
    println(arr1.contentEquals(arr2))

    val sample= arrayOf("a","b","c","c")
    println(sample.toSet())
    println(sample.toList())

    val cities= arrayOf("İstanbul" to 34,"Kars" to 36, "Adana" to 1)
    println(cities.toMap())
}

fun printAllStrings(vararg string: String){
    for (str in string){
        print(str)
    }
}