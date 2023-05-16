fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = MatchElement(elementsArray)
    if (elementsArray.isEmpty()) {
        println("Массив пустой")
    } else {
        println("Сумма положительных элементов массива = ${arrayObject.amount()}")
        println("Произведение элементов массива = ${arrayObject.composition()}")
        println("Cреднее значение элементов массива = ${arrayObject.averageValue()}")
    }
}

class MatchElement(private val elementsArray: IntArray) {
    fun amount(): Int = elementsArray.sum()

    fun composition(): Int = elementsArray.reduce { acc, i -> acc * i }

    fun averageValue(): Int = elementsArray.sum() / elementsArray.size

}