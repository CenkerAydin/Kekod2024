package functions

fun main() {
    calculateAndPrint(2, 4, 'x')
    calculateAndPrint(5, 6, '+')
    calculateAndPrint(7, 9, '-')
    calculateAndPrint(27, 9, '/')
    println()

    val sumFunction = { numberOne: Int, numberTwo: Int -> numberOne + numberTwo }
    calculateAndPrintHOF(2, 4, sumFunction)

    val minusFunction = fun(numberone: Int, numberTwo: Int): Int {
        return numberone - numberTwo
    }
    calculateAndPrintHOF(2, 4, minusFunction)

    calculateAndPrintHOF(5, 6) { numberOne, numberTwo -> numberOne * numberTwo }
    calculateAndPrintHOF(27, 18, ::divFunction)
    calculateAndPrintHOF(36, 18) { numberOne, numberTwo -> numberOne % numberTwo }
    calculateAndPrintHOF(4, 56)
}

fun divFunction(numberOne: Int, numberTwo: Int): Int {
    return numberOne / numberTwo
}

fun calculateAndPrint(numberOne: Int, numberTwo: Int, operation: Char) {
    val result = when (operation) {
        '+' -> {
            numberOne + numberTwo
        }

        '-' -> {
            numberOne - numberTwo
        }

        'x' -> {
            numberOne * numberTwo
        }

        '/' -> {
            numberOne / numberTwo
        }

        else -> {
            numberOne + numberTwo
        }
    }
    println("Result : $result")
}

fun calculateAndPrintHOF(numberOne: Int, numberTwo: Int, operation: (Int, Int) -> Int = ::defaultSum) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")

}

val higherOrderFunction = { surName: String ->
    "surName : $surName"
}

val anonymousFunc = fun(surName: String): String {
    return "surName : $surName"
}

val anonymousFunc2 = fun(surName: String): String = "surName: $surName"

fun defaultSum(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo
}

fun calculateAndPrint3(
    numberOne: Int = 3,
    numberTwo: Int = 4,
    operation: String.(Int, Int) -> Int
) {
    val result = operation("Sayılar", numberOne, numberTwo)
    println("Result: $result")
}
