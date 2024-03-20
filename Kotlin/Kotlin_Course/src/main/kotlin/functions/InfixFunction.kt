package functions


fun main() {

    val isStudent = false
    val isMale = true

    if (!isStudent and isMale){ //infix kullanımı and
        print("Öğrenci olmayan erkek")
    }

    val awesomeInstance =AwesomeClass()
    awesomeInstance downloadImage "www.google.com.tr"
    awesomeInstance.downloadImage("www.google.com.tr")
}

class AwesomeClass{

    infix fun downloadImage(imageUrl:String){

    }

    fun logWhenImageDownloaded(imageUrl: String){
        downloadImage(imageUrl)
        this downloadImage imageUrl
    }
}