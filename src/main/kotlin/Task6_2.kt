fun main() {
    println("Введите сторону квадрата:")
    val box = Box(readln().toInt())
    box.perimeter()
    box.square()
    println("Введите радиус круга:")
    val circle = Circle(readln().toInt())
    circle.perimeter()
    circle.square()
    println("Введите основание, высоту, и две стороны треугольника:")
    val triangle = Triangle(readln().toInt(), readln().toInt(), readln().toInt(), readln().toInt())
    triangle.perimeter()
    triangle.square()
}

interface Figure {
    fun square()
    fun perimeter()
}

class Box(private var side: Int) : Figure {
    override fun square() = println("Площаль квадрата =${(side * side).toDouble()}")

    override fun perimeter() = println("Периметр квадрата =${(side * 4).toDouble()}")
}

class Circle(private var radius: Int) : Figure {
    override fun square() = println("Площадь круга = ${3.14 * radius * radius}")

    override fun perimeter() = println("Периметр круга = ${2 * 3.14 * radius}")
}

class Triangle(private var footing: Int, private var height: Int, private var b: Int, private var c: Int) : Figure {
    override fun square() = println("Площадь треугольника = ${((0.5) * footing * height).toDouble()}")

    override fun perimeter() = println("Периметр треугольника = ${(footing + b + c).toDouble()}")

}