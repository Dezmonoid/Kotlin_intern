fun main() {
    print("Введите размер массива: ")
    val countArray = readln().toInt()
    val elementsArray = IntArray(countArray)
    for (i in 0 until countArray) elementsArray[i] = readln().toInt()
    val arrayObject = matchElement(elementsArray)
    print("Изначальный вид массива: ")
    arrayObject.elementsArray.forEach { print("$it ") }
    println()
    for (item in arrayObject.elementsArray.indices) {
        arrayObject.sumOfElement += arrayObject.elementsArray[item]
    }
    println("Сумма элементов массива = ${arrayObject.sumOfElement}")
    arrayObject.minElement()
    arrayObject.maxElement()
    arrayObject.upgradeMassive()
    print("Изменённый вид массива: ")
    arrayObject.elementsArray.forEach { print("$it ") }
}

class matchElement(public val elementsArray: IntArray) {
    public var sumOfElement = 0
    private var arrayIndex = 0
    private var minimumNumber = elementsArray[0]
    private var maximumNumber = 0
    fun minElement(): Unit {
        arrayIndex = 1
        while (arrayIndex < elementsArray.size) {
            if (elementsArray[arrayIndex] < minimumNumber) {
                minimumNumber = elementsArray[arrayIndex]
            }
            arrayIndex += 1
        }
        println("Минимальное значение = $minimumNumber")
    }

    fun maxElement(): Unit {
        arrayIndex = 0
        for (arrayIndex in elementsArray.indices) {
            if (elementsArray[arrayIndex] > maximumNumber) {
                maximumNumber = elementsArray[arrayIndex]
            }
        }
        println("Максимальное значение = $maximumNumber")
    }

    fun upgradeMassive(): Unit {
        arrayIndex = 0
        for (arrayIndex in elementsArray.indices) {
            if (elementsArray[arrayIndex] % 2 == 0) {
                elementsArray[arrayIndex] *= 2
            } else {
                elementsArray[arrayIndex] *= 3
            }
        }
    }
}