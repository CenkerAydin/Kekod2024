package loop

fun main() {
    val value: Int =45
    for (x  in 1..10){
        println("$value")
    }

    val countryCode= arrayOf("tr","az","en","fr")
    for (value in countryCode){
        print("$value ")
    }

    for( index in countryCode.indices ){
        print("\n $index. değeri : ${countryCode[index]}")
    }

    for ((index,value) in countryCode.withIndex()){
        print("\n $index. değeri: $value")
    }

    repeat(10){
        println("Kotlin")
    }

    for (value in 1..50){
        if (value % 2 ==1){
            continue
        }
        print("\n$value")
    }

    for (value in 1..50){
        if (value % 2 ==1){
            break
        }
        print("\n$value")
    }
    println(" ")

    returnLabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2==5){
                continue@returnLabel
            }
            print("continue2 :$value2 | ")
        }
    }

    returnLabel@ for (value in 1..50){
        for (value2 in 0..10){
            if (value2==5){
                break@returnLabel
            }
            print("break2 :$value2 | ")
        }
    }

}
