fun main() {
    val arrayOfInteger = IntArray(20)
    for (itemNumber in 0..19) {
        arrayOfInteger[itemNumber] = (0..20).random()
        print("${arrayOfInteger[itemNumber]} ")
    }
    println()
    for (index in 1..18) {
        if (arrayOfInteger[index] > arrayOfInteger[index - 1] && arrayOfInteger[index] > arrayOfInteger[index + 1]) {
            println("Значение ${arrayOfInteger[index]}; ")
        }
    }
}
