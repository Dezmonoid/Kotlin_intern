fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = MatchElement(elementsArray)
    arrayObject.print()
    println("Массив = $arrayObject")
    println("Сумма элементов массива = ${arrayObject.sumOfElement}")
    println("Минимальное значение = ${arrayObject.minElement()}")
    println("Максимальное значение = ${arrayObject.maxElement()}")
    println("Изменённый вид массива: ${arrayObject.getNewMassive().joinToString()}")
}

class MatchElement(private val elementsArray: IntArray) {
    val sumOfElement: Int
        get() = elementsArray.sum()

    fun minElement() = elementsArray.min()

    fun maxElement() = elementsArray.max()

    fun getNewMassive(): IntArray {
        val result = elementsArray.clone()
        result.forEachIndexed { index, element ->
            if (element % 2 == 0) {
                result[index] *= 2
            } else {
                result[index] *= 3
            }
        }
        return result
    }

    fun print() {
        println("Массив: ${elementsArray.joinToString()}")
    }

    override fun toString(): String {
        return elementsArray.joinToString()
    }
}