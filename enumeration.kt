fun main() {
    val color: Color = Color.CRIMSON

    when(color){
        Color.CRIMSON -> print("Color is Crimson")
        Color.AQUA -> print("Color is Aqua")
        Color.GOLD -> print("Color is Gold")
    }
}

enum class Color(val value: Int) {
    CRIMSON(0xDC143C),
    GOLD(0xFFD700),
    AQUA(0x00ffFF)
}
