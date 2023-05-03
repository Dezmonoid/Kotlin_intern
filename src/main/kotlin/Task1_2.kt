fun main() {
    var userNumber = 0
    var count = 0
    var summ = 0
    var average = 0
    while (true) {
        println("Введите число:")
        userNumber = readln().toInt()
        if (userNumber != 0) {
            count++
            summ += userNumber
        } else {
            break
        }

    }
    average = summ / count
    println("Колличество чисел: $count")
    println("Сумма чисел: $summ")
    println("Среднее значение: $average")
}
