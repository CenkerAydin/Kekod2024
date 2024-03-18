package controlflow

data class PairNumber(val numberOne: Int, val numberTwo: Int) {
    operator fun minus(pairNumber: PairNumber): PairNumber {
        val returnPairObject = PairNumber(
            numberOne - pairNumber.numberOne,
            numberTwo - pairNumber.numberTwo
        )

        println("Sonuc= (${returnPairObject.numberOne}, ${returnPairObject.numberTwo})")

        return returnPairObject
    }
}

fun main() {
    val a = 5
    val b = 8
    var result = a + b
    result = a.plus(b)

    val pairNumberOne = PairNumber(2, 4)
    val pairNumberTwo = PairNumber(-8, 11)

    val resultOne = pairNumberOne.numberOne - pairNumberOne.numberOne
    val resultTwo = pairNumberTwo.numberOne - pairNumberTwo.numberTwo
    println("Sonuç= ($resultOne, $resultTwo)")

    pairNumberOne -pairNumberTwo
    pairNumberOne.minus(pairNumberTwo)

}