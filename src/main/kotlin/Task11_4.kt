fun main() {
    messageParse("abxbbznmfkYyyxX",
        { println("обнаружен символ x") },
        { println("обнаружен символ y") },
        { println("обнаружен символ z") })
}

fun messageParse(userMessage: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
    userMessage.forEach { value: Char ->
        when {
            value.equals('x', true) -> eventX()
            value.equals('y', true) -> eventY()
            value.equals('z', true) -> eventZ()
        }
    }
}