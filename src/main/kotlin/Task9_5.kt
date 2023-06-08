fun main() {
    val phoneBookMap =
        mapOf(
            "Max" to "+375 33 392-78-85",
            "Andrey" to "+375 29 847-26-04",
            "Igor" to "+375 29 937-99-92",
            "Jaygen" to "+7 906 456-89-90"
        )
    println("Введите код страны")
    val countryCode = readln()
    val modifiedPhoneBookMap = phoneBookMap.filterValues { value -> value.startsWith(countryCode) }
    modifiedPhoneBookMap.forEach {
        print("${it.key} - ${it.value}, ")
    }
    println()

}