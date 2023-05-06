fun main() {
    println("Введите число n")
    val rangeNumber = readln().toInt()
    var simpleNumber = ""
    for (verificationNumber in 2 until rangeNumber) {
        if (checkNumber(verificationNumber)) simpleNumber = "$simpleNumber $verificationNumber"
    }
    println("Итог: $simpleNumber")
}

fun checkNumber(verificationNumber: Int): Boolean {
    for (cycleIndex in 2 until verificationNumber) {
        if (verificationNumber % cycleIndex == 0) return false
    }
    return true
}
