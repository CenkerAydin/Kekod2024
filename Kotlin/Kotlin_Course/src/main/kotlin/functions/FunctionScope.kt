package functions


fun main() {

}

class Car{
    fun setColor (colorCodeId: Int){

    }
}

class PrivateA(){
    private fun commonFunc(){
        fun specialFunc(){

        }
    }
    fun secondFun(){
        commonFunc()
      //  specialFunc() -> Hata verir.
    }
}

