fun main() {
    val phoneBookList =
        listOf(
            "Max - +375 33 392-78-85",
            "Max - +375 29 114-20-67",
            "Max - +7 906 114-20-67",
            "Andrey - +375 29 847-26-04",
            "Igor - +375 29 937-99-92",
            "Jaygen - +7 906 456-89-90"
        )
    val phoneBookMap =
        mapOf(
            "Max" to "+375 33 392-78-85",
            "Max" to "+7 906 114-20-67",
            "Max" to "+375 29 114-20-67",
            "Andrey" to "+375 29 847-26-04",
            "Igor" to "+375 29 937-99-92",
            "Jaygen" to "+7 906 456-89-90"
        )
    println("Введите код страны")
    val countryCode = readln()
    val modifiedPhoneBookMap = phoneBookMap.filter { (key, value) -> value.contains(countryCode) }
    modifiedPhoneBookMap.forEach {
        print("${it.key} - ${it.value}, ")
    }
    println()
    val modifiedPhoneBookList = phoneBookList.filter { it -> it.contains(countryCode) }
    println(modifiedPhoneBookList.joinToString())

}