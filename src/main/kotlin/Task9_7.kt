fun main() {
    val time = "01:20:12"
    val hour = time.split(':')[0].toInt()
    val minute = time.split(':')[1].toInt()
    val second = time.split(':')[2].toInt()
    println("С начала дня прошло ${hour * 60 * 60 + minute * 60 + second} секунд")
}