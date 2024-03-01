package controlflow

fun main() {
    var numberOne = 10
    val numberTwo = 5

    println("NumberOne: ${numberOne}")
    println("NumberOne: ${numberOne++}")
    println("NumberOne: ${numberOne}")
    println("NumberOne: ${++numberOne}")

    print("${numberOne + numberTwo}")
    print(" ")
    println(numberOne.plus(numberTwo))

    print("${numberOne - numberTwo}")
    print(" ")
    print(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo}")
    print(" ")
    print(numberOne.times(numberTwo))

    print("${numberOne / numberTwo}")
    print(" ")
    print(numberOne.div(numberTwo))

    print("${numberOne % numberTwo}")
    print(" ")
    print(numberOne.rem(numberTwo))

    println("--------------------")

    print("Final Notunu Giriniz: ")
    val grade = readln().toInt()

    val charNote = if (grade in 87..100) {
        "$grade = AA"
    } else if (grade in 81..<87) {
        "$grade= BA"
    } else if (grade in 73..<81) {
        "$grade= BB"
    } else if (grade in 67..<73) {
        "$grade == CB"
    } else if (grade in 60..<67) {
        "$grade == CC"
    } else {
        "$grade== FF"
    }

    println("------------------")

    var a=20
    var b=5
    a +=b
    println("a+=b : "+a)
    a -=b
    println("a-=b :" +a)
    a *=b
    println("a*=b :" +a)
    a /=b
    println("a/=b :" +a)
    a %=b
    println("a %=b :" +a)

    println("------------------")
    var numbOne=10
    var numbTwo=5
    var flag=true
    println("+a: "+ +numbOne) //10
    println("-b: "+ -numbTwo) //-5
    println("++a:"+ ++numbOne) //11
    println("a++:"+ numbOne++) //11
    println("a: "+ numbOne) //12
    println("--b: "+ --numbTwo) //4
    println("!flag: "+ !flag) //false
    println(numbOne.unaryMinus())

}

