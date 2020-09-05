fun main(){
    val stringOfValue = when (8){
        2 ->{
            println("Two")
            "Value is 2"
        }
        3 ->{
            println("Three")
            "Value is 3"
        }
        4 ->{
            println("Four")
            "Value is 4"
        }
        5 ->{
            println("Five")
            "Value is 5"
        }
        6 ->{
            println("Six")
            "Value is 6"
        }
        7 ->{
            println("Seven")
            "Value is 7"
        }
        8 ->{
            println("Eight")
            "Value is 8"
        }
        else ->{
            println("tidak ditemukan")
        }
    }
    println(stringOfValue)

}