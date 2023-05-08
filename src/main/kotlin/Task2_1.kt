fun main() {
    println("Введите число n")
    val rangeNumber = readln().toInt()
    var amountNumber = 0
    var indexNumber = 2
    var simpleNumber = ""
    while (true) {
        if (checkNumber(indexNumber)) {
            simpleNumber = "$simpleNumber $indexNumber"
            amountNumber += 1
        }
        if (rangeNumber == amountNumber) break
        indexNumber += 1
    }
    println("Итог: $simpleNumber")
}

fun checkNumber(verificationNumber: Int): Boolean {
    for (cycleIndex in 2 until verificationNumber) {
        if (verificationNumber % cycleIndex == 0) return false
    }
    return true
}
