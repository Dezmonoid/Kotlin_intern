fun main() {
    val singleDigits = listOf(null, "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val doubleDigits = listOf(
        null,
        null,
        "двадцать",
        "тридцать",
        "сорок",
        "пятьдесят",
        "шестьдесят",
        "семьдесят",
        "восемьдесят",
        "девяноста"
    )
    val secondTen = listOf(
        "десять",
        "одинадцать",
        "двенадцать",
        "тринадцать",
        "четырнадцать",
        "пятнадцать",
        "шестнадцать",
        "семнадцать",
        "восемьнадцать",
        "девятнадцать"
    )
    println("Введите число от 1 до 100")
    var userNumber: Int
    while (true) {
        userNumber = readln().toInt()
        if (userNumber in 1..100) {
            break
        } else {
            println("Вы ввели число не входящее в диапазон")
        }
    }
    registrationTransfer(userNumber, singleDigits, secondTen, doubleDigits)

}

fun registrationTransfer(
    userNumber: Int,
    singleDigits: List<String?>,
    secondTen: List<String?>,
    doubleDigits: List<String?>
) {
    when (userNumber) {
        in 1..9 -> println(singleDigits[userNumber])
        in 10..19 -> println(secondTen[userNumber % 10])
        20 -> println(doubleDigits[2])
        in 21..99 -> println("${doubleDigits[userNumber.div(10)]} ${singleDigits[userNumber % 10]}")
        else -> println("сто")

    }
}