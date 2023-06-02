fun main() {
    val point = Point(0, 0)
    val turtle = Turtle()
    while (true) {
        println(point.toString())
        println("Выберите куда двигаться: вверх, вниз, влево, вправо")
        when (readln()) {
            "вверх" -> {
                turtle.move(point, Command.UP)
            }

            "вниз" -> {
                turtle.move(point, Command.DOWN)
            }

            "влево" -> {
                turtle.move(point, Command.LEFT)
            }

            "вправо" -> {
                turtle.move(point, Command.RIGHT)
            }

            else -> {
                println("Вы указали неверное направление")
            }
        }
    }

}

class Point(var x: Int, var y: Int) {
    override fun toString(): String {
        return "текущие координаты x = $x, y = $y"
    }
}

class Turtle() {
    fun move(point: Point, command: Command) {
        when (command) {
            Command.UP -> {
                println("Произведено перемещение по оси Х на +1, по оси У на 0")
                point.x += 1
            }

            Command.DOWN -> {
                println("Произведено перемещение по оси Х на -1, по оси У на 0")
                point.x -= 1
            }

            Command.LEFT -> {
                println("Произведено перемещение по оси Х на 0, по оси У на -1")
                point.y -= 1
            }

            Command.RIGHT -> {
                println("Произведено перемещение по оси Х на 0, по оси У на 1")
                point.y += 1
            }
        }
    }
}

enum class Command {
    UP, DOWN, LEFT, RIGHT
}