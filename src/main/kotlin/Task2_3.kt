import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("Введите размер массива:")
    val countArray = readln().toInt()
    val arrayOfElements = List(countArray) {
        Random.nextInt(1..10)
    }
    arrayOfElements.forEach {
        print("$it ")
    }
    println()
    val compositionOfNumber = arrayOfElements.reduce { sum, element -> sum * element }
    println("Произведение чисел = $compositionOfNumber")
    max(countArray, arrayOfElements)
    min(countArray, arrayOfElements)
}

fun min(countArray: Int, arrayOfElements: List<Int>): Unit {
    var minimumNumber = arrayOfElements[0]
    var arrayIndex = 1
    while (arrayIndex < countArray) {
        if (arrayOfElements[arrayIndex] < minimumNumber) {
            minimumNumber = arrayOfElements[arrayIndex]
        }
        arrayIndex += 1
    }
    println("Минимальное число = $minimumNumber")
}

fun max(countArray: Int, arrayOfElements: List<Int>): Unit {
    var maximumNumber = 0
    for (arrayIndex in 0 until countArray) {
        if (arrayOfElements[arrayIndex] > maximumNumber) {
            maximumNumber = arrayOfElements[arrayIndex]
        }
    }
    println("Максимальное число = $maximumNumber")
}