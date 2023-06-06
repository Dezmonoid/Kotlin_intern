fun main() {
    val userList = listOf(5, 8, 3, 2, -4, 6, -3, -7, 4, -3, -7, 5, -8)
    val negativeNumbersUserList = userList.filter { it < 0 }
    println(negativeNumbersUserList.joinToString())
}
