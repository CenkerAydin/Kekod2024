package basics

fun main() {
    val firstChar: Char = 'C'
    val firstChar2: String = "C"
    //val firstChar3: Char= 'Ce'
    val charNum: Char = '6'
    //val charNum2: Char = '43'

    val convertedChar =charNum.toInt()
    val convertedChar2= charNum.code
    val digitToInt =charNum.digitToInt()
    println("charNumber = " +charNum)
    println("convertedChar = "+convertedChar )
    println("convertedChar2= "+convertedChar2)
    println("digitToInt = "+digitToInt)

    val example= ":\n -> alt satıra iner \n" +
            "\t -> bir tab boşluğu ekleyebilirsiniz \n" +
            "\\b -> ile geri alma işlemini yapabilirsiniz\n" +
            "\\r -> satır başına dönebilirsiniz "
    println(example)

    val blackHeart ='\u2665'
    val heavyBlackHeart ='\u2764'

    println("First commit with $blackHeart")
    println("First commit with $heavyBlackHeart")

}