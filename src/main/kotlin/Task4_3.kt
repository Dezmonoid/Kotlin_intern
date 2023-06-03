import kotlin.math.*

fun main() {
    val vector1 = Vector(3.0, 5.0, 1.0)
    val vector2 = Vector(5.0, 3.0, 7.0)
    val vector3 = vector1 * vector2
    vector1.print()
    vector2.print()
    vector3.print()
    println("Длинна вектора 1 = ${vector1.vectorLength()}")
    println("Длинна вектора 2 = ${vector2.vectorLength()}")
    println("Скалярное произведение векторов методом внутри класса = ${vector1 vectorComposition vector2}")
    println("Скалярное произведение векторов методом вне класса = ${vectorComposition(vector1, vector2)}")
}

class Vector(val x: Double, val y: Double, val z: Double) {

    private fun sqr(x: Double): Double = x * x
    fun vectorLength(): Double = sqrt(sqr(x) + sqr(y) + sqr(z))
    infix fun vectorComposition(vector: Vector): Double = x * vector.x + y * vector.y + z * vector.z
    fun print() = println("x = $x, y = $y, z = $z")
    operator fun times(vector: Vector): Vector {
        return Vector(x * vector.x, y * vector.y, z * vector.z)
    }

}

fun vectorComposition(vectorOne: Vector, vectorTwo: Vector): Double =
    vectorOne.x * vectorTwo.x + vectorOne.y * vectorTwo.y + vectorOne.z * vectorTwo.z

