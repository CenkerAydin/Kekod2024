package controlflow

fun main() {
    print("Öğrenci Misin")
    val answer = readln()
    //State
    if (answer.contains("Evet", ignoreCase = true)) {
        println("Öğrenci")
    } else {
        println("Öğrenci Değil")
    }

    //Expression
    val result: String = if (answer == "Evet") {

        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }

    //  if (10==10L){
    //
    //}

}


