package loop

fun main() {
    var number= 0
    while (number < 5){
        print(" ${number++}, ")
    }

    while (number<5){
        print("$number , ")
        number++
    }
    println("-----------")

    for (value in  0..110){
        if (value < 5 ){
            print("$value , ")
        }else {
            return
        }
    }
}