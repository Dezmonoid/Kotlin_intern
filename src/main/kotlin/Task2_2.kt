import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    println("Введите размер массива:")
    val listSize = readln().toInt()
    val listOfNumbers = List(listSize) {
        val number = Random.nextInt(10)
        print("$number ")
        number
    }
    println()
    listOfNumbers.forEachIndexed { index, i ->
        if (index != 0 && index != listOfNumbers.lastIndex) {
            if (listOfNumbers[index] > listOfNumbers[index - 1] && listOfNumbers[index] > listOfNumbers[index + 1]) {
                println("Значение ${listOfNumbers[index]}; ")
            }
        }
    }
}
