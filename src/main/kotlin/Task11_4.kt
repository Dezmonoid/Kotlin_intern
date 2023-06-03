fun main() {
    messageParse("abxbbznmfkYyyxX",
        { println("обнаружен символ x") },
        { println("обнаружен символ y") },
        { println("обнаружен символ z") })
}

fun messageParse(message: String, eventX: () -> Unit, eventY: () -> Unit, eventZ: () -> Unit) {
    message.forEach {
        when {
            it.equals('x', true) -> {
                eventX()
            }

            it.equals('y', true) -> {
                eventY()
            }

            it.equals('z', true) -> {
                eventZ()
            }
        }
    }
}