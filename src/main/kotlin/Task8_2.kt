fun main() {
    var words = listOf<String?>("GffgddGDf", null, "dgdsdgfFDgf", "FdgFERg", null)
    println(
        "Выберите способ: \n" +
                "1 - используя оператор if\n" +
                "2 - используя оператор безопасного вызова ?\n" +
                "3 - используя функцию let\n" +
                "4 - используя Элвис-оператор ?:"
    )
    var way = readln()
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
                println(it?.uppercase() ?: println("empty"))
            }

            else -> {
                println("Неверный способ")
            }
        }
    }
}