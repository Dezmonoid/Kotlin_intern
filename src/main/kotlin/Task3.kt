import kotlin.math.*

fun main() {
    print("Введите значение a = ")
    val a = readln().toDouble()
    print("Введите значение b = ")
    val b = readln().toDouble()
    print("Введите значение c = ")
    val c = readln().toDouble()
    quadraticRoot(a, b, c)
}

fun sqr(n: Double): Double = n * n
fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - (4 * a * c)
fun rootsNumber(a: Double, b: Double, c: Double): Int {
    when {
        discriminant(a, b, c) < 0.0 -> return 0
        discriminant(a, b, c) == 0.0 -> return 1
        discriminant(a, b, c) > 0.0 -> return 2
    }
    return 0
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val x1: Double
    val x2: Double
    when (rootsNumber(a, b, c)) {
        0 -> println("Корней нет")
        1 -> {
            x1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a)
            println("Корень x1 = $x1")
        }

        2 -> {
            x1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a)
            x2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a)
            println("Корень x1 = $x1")
            println("Корень x2 = $x2")
        }
    }
}
