fun main() {
    replacement(readln()) { userText: String -> userText.replace(oldValue = ",", newValue = " блин") }
}

fun replacement(message: String, convert: (String) -> String): String {
    val result = convert(message)
    println(result)
    return result
}