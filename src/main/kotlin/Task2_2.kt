fun main() {
    println("Введите размер массива:")
    val countArray = readln().toInt()
    val arrayOfInteger = IntArray(countArray)
    for (arrayIndex in 0 until countArray) {
        arrayOfInteger[arrayIndex] = (0..20).random()
        print("${arrayOfInteger[arrayIndex]} ")
    }
    println()
    for (arrayIndex in 1..countArray - 2) {
        if (arrayOfInteger[arrayIndex] > arrayOfInteger[arrayIndex - 1] && arrayOfInteger[arrayIndex] > arrayOfInteger[arrayIndex + 1]) {
            println("Значение ${arrayOfInteger[arrayIndex]}; ")
        }
    }
}
