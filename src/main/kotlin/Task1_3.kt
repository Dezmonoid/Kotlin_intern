fun main() {
    val randomNumber = (0..10).random()
    var userNumber:Int
    println("Бог рандома загадал число")
    while (true) {
        println("Введите число:")
        userNumber = readln().toInt()
        if (randomNumber == userNumber) {
            println("Угадал")
            break
        } else {
            if (randomNumber > userNumber) println("Мало") else println("Много")
        }
    }
}
