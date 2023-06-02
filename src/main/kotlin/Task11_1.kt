fun main() {
    val fahrenheit = { celsius: Int -> (celsius * 9 / 5) + 32 }
    println("Введите градусы Цельсия")
    println("В градусах Фаренгейта будет = ${fahrenheit(readln().toInt())}")
}