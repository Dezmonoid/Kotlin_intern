fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = Test(elementsArray, countArray)
    println("Сумма положительных элементов массива = ${arrayObject.Amount()}")
    println("Произведение элементов массива = ${arrayObject.Composition()}")
    println("Среднее значение элементов массива = ${arrayObject.AverageValue()}")
}

class Test(private val elementsArray: IntArray, private val countArray: Int) {
    fun Amount(): Int {
        var result = 0
        for (i in 0..elementsArray.lastIndex) if (elementsArray[i] > 0) result += elementsArray[i]
        return result
    }

    fun Composition(): Int {
        var result = 1
        for (i in 0..elementsArray.lastIndex) result *= elementsArray[i]
        return result
    }

    fun AverageValue(): Int {
        var result = 0
        for (i in 0..elementsArray.lastIndex) result += elementsArray[i]
        return result / countArray
    }
}