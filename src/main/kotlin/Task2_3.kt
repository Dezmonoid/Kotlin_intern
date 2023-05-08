fun main() {
    val arrayOfElements = IntArray(10)
    var sumOfNumbers = 0
    var maximumNumber = 0
    var minimumNumber = 100
    for (elementNumber in 0..9) {
        arrayOfElements[elementNumber] = (0..10).random()
        sumOfNumbers += arrayOfElements[elementNumber]
        if (arrayOfElements[elementNumber] > maximumNumber) {
            maximumNumber = arrayOfElements[elementNumber]
        }
    }
    arrayOfElements.forEach {
        if (arrayOfElements[it] < minimumNumber) {
            minimumNumber = arrayOfElements[it]
        }
        println("${arrayOfElements[it]}")
    }
    println("Сумма чисел = $sumOfNumbers")
    println("max = $maximumNumber")
    println("min = $minimumNumber")
}
