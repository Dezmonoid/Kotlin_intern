fun main() {
    val time = "01:20:12".split(':')
    println("С начала дня прошло ${time[0].toInt() * 60 * 60 + time[1].toInt() * 60 + time[2].toInt()} секунд")
}