fun main() {
    println("Введите размер массива:")
    val countArray = readln().toInt()
    val arrayOfElements = IntArray(countArray)
    var sumOfNumbers = 0
    var maximumNumber = 0
    println("Введите максимальное значение случайного числа")
    val maximumRandomNumber = readln().toInt()
    var minimumNumber = maximumRandomNumber
    for (elementNumber in 0 until countArray) {
        arrayOfElements[elementNumber] = (0..maximumRandomNumber).random()
        sumOfNumbers += arrayOfElements[elementNumber]
        if (arrayOfElements[elementNumber] > maximumNumber) {
            maximumNumber = arrayOfElements[elementNumber]
        }
        if (arrayOfElements[elementNumber] < minimumNumber) {
            minimumNumber = arrayOfElements[elementNumber]
        }
        println("${arrayOfElements[elementNumber]}")
    }
    println("Сумма чисел = $sumOfNumbers")
    println("max = $maximumNumber")
    println("min = $minimumNumber")
}
