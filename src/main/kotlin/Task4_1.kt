fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = matchElement(elementsArray)
    arrayObject.Amount()
    arrayObject.Composition()
    arrayObject.AverageValue()
}

class matchElement(private val elementsArray: IntArray) {
    fun Amount(): Unit {
        var result = 0
        for (item in elementsArray.indices) {
            if (elementsArray[item] > 0) result += elementsArray[item]
        }
        println("Сумма положительных элементов массива = $result")
    }

    fun Composition(): Unit {
        var result = 1
        if (elementsArray.isEmpty()) {
            println("Произведение элементов массива = 0")
        } else {
            for (item in elementsArray.indices) {
                result *= elementsArray[item]
            }
            println("Произведение элементов массива = $result")
        }
    }

    fun AverageValue(): Unit {
        var result = 0
        if (elementsArray.isEmpty()) {
            println("Cреднее значение элементов массива = 0")
        } else {
            for (item in elementsArray.indices) {
                result += elementsArray[item]
            }
            println("Cреднее значение элементов массива = ${result / elementsArray.size}")
        }
    }
}