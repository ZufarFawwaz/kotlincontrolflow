fun main() {
    val rangeInt = 1..30 step 5
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}