fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = matchElement(elementsArray)
    if (elementsArray.isEmpty()) {
        println("Массив пустой")
    } else {
        println("Сумма положительных элементов массива = ${arrayObject.Amount()}")
        println("Произведение элементов массива = ${arrayObject.Composition()}")
        println("Cреднее значение элементов массива = ${arrayObject.AverageValue()}")
    }
}

class matchElement(private val elementsArray: IntArray) {
    fun Amount(): Int = elementsArray.sumOf { it }

    fun Composition(): Int = elementsArray.reduce { acc, i -> acc * i }

    fun AverageValue(): Int = elementsArray.sumOf { it } / elementsArray.size

}