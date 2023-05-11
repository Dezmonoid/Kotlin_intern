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
fun rootsNumber(a: Double, b: Double, c: Double) {
    when {
        discriminant(a, b, c) < 0.0 -> println("Корней нет.")
        discriminant(a, b, c) == 0.0 -> println("Один корень:")
        discriminant(a, b, c) > 0.0 -> println("Два корня:")
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val x1 : Double
    val x2 : Double
    rootsNumber(a,b,c)
    if (discriminant(a, b, c) == 0.0) {
        x1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a)
        println("Корень x1 = $x1")
    } else {
        x1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a)
        x2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a)
        println("Корень x1 = $x1")
        println("Корень x2 = $x2")
    }
}
