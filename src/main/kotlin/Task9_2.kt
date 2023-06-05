fun main() {
    val listOfNumber = listOf(5, 8, 3, 2, -4, 6, -3, -7, 4, -3, -7, 5, -8)
    val negativeSheet = listOfNumber.map { if (it > 0) it * -1 else it }
    println(negativeSheet.joinToString())
}