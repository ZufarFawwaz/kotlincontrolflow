fun main() {
    val listOfInt = listOf(11, 12, null, null, 15, null, 17)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}