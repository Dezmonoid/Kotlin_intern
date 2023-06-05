fun main() {
    replacement(readln()) { userText: String -> userText.replace(",", " блин") }
}

fun replacement(message: String, convert: (String) -> String): String {
    println(convert(message))
    return convert(message)
}