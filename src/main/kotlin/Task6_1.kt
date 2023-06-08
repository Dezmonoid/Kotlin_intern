import kotlin.time.times

fun main() {
    println("Введите сторону квадрата:")
    val box = Box(readln().toInt())
    println("Периметр квадрата = ${box.perimeter()}")
    println("Площадь квадрата = ${box.square()}")
    println("Введите радиус круга:")
    val circle = Circle(readln().toInt())
    println("Периметр круга = ${circle.perimeter()}")
    println("Площадь круга = ${circle.square()}")
    println("Введите основание, высоту, и две стороны треугольника:")
    val triangle = Triangle(readln().toInt(), readln().toInt(), readln().toInt(), readln().toInt())
    println("Периметр треугольника = ${triangle.perimeter()}")
    println("Площадь треугольника = ${triangle.square()}")
}

abstract class Figure() {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Box(private var side: Int) : Figure() {
    override fun square(): Double {
        return (side * side).toDouble()
    }

    override fun perimeter(): Double {
        return (side * 4).toDouble()
    }
}

class Circle(private var radius: Int) : Figure() {
    override fun square(): Double {
        return 3.14 * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * 3.14 * radius
    }
}

class Triangle(private var footing: Int, private var height: Int, private var b: Int, private var c: Int) : Figure() {
    override fun square(): Double {
        return ((0.5) * footing * height).toDouble()
    }

    override fun perimeter(): Double {
        return (footing + b + c).toDouble()
    }
}