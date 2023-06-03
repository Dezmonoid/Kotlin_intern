fun main() {
    val concat = { stringOne: String, stringTwo: String, stringThree: String ->
        val listOfString = listOf(stringOne, stringTwo, stringThree).sortedBy { it.length }
        println(listOfString.joinToString())
    }
    println("Введите 3 слова:")
    concat(readln(), readln(), readln())
}