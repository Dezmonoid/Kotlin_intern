fun main() {
    val concat = { stringOne: String, stringTwo: String, stringThree: String ->
    val listOfString = listOf(stringOne,stringTwo,stringThree).sortedWith(comparator = { str1:String, str2:String -> str1.length-str2.length})
        println(listOfString.joinToString())
    }
    println("Введите 3 слова:")
    concat(readln().toString(),readln().toString(),readln().toString())
}