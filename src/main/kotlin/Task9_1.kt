fun main() {
    val listOfNumber = listOf<Int>(5, 8, 3, 2, -4, 6, -3, -7, 4, -3, -7, 5, -8)
    val negativeNumberOnly = listOfNumber.filter { it < 0 }
    println(negativeNumberOnly.joinToString())
}
