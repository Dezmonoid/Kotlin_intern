fun main() {
    var userNumber = 0
    var summ = 0
    println("Введите число")
    userNumber = readln().toInt()
    summ = userNumber % 10 + first(userNumber)
    println("Сумма значений = $summ")
}

fun first(userNumber: Int): Int {
    var firstNumber = userNumber
    while (firstNumber / 10 > 0) {
        firstNumber /= 10
    }
    return firstNumber
}
