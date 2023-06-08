fun main() {
    var words = listOf<String?>("GffgddGDf", null, "dgdsdgfFDgf", "FdgFERg", null)
    println(
        """Выберите способ:
1 - используя оператор if
2 - используя оператор безопасного вызова ?
3 - используя функцию let
4 - используя Элвис-оператор ?:"""
    )
    val way = readln()
    words.forEach() {
        when (way) {
            "1" -> {
                if (it != null) {
                    println(it.uppercase())
                }
            }

            "2" -> {
                println(it?.uppercase())
            }

            "3" -> {
                it?.let { println(it.uppercase()) }
            }

            "4" -> {
                println(it?.uppercase() ?: "empty")
            }

            else -> {
                println("Неверный способ")
            }
        }
    }
}