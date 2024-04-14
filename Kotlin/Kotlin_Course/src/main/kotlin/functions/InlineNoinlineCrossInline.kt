package functions


fun main() {
    calculate(2, 54) { numberOne, numberTwo ->
        if (numberTwo == 0) {
            return
        }
        numberOne / numberTwo

    }

    runAndPrint({ message ->
        println(message)
    }, {
        println(it)
    })

}

inline fun runAndPrint(run: (String) -> Unit, noinline logger: (String) -> Unit) {
    log(logger)
    run("Message")
}

fun log(logger: (String) -> Unit) {
    logger("Start")
}

inline fun calculate(
    numberOne: Int,
    numberTwo: Int,
   operation: (Int, Int) -> Int
) {
    logger(numberOne, numberTwo) { numberOne, numberTwo ->
        if (numberTwo==0){
            return
        }
        numberOne/numberTwo

    }

}

inline fun logger(
    numberOne: Int,
    numberTwo: Int,
    operation: (Int, Int) -> Int) {
    val result=operation(numberOne,numberTwo)
    println("Result: $result")
}


