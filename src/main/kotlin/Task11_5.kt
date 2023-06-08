fun main() {
    val rickPlate = Ufo(0, 0)
    println(rickPlate.toString())
    println("Введите зашифрованное сообщение тарелке:")
    val message = readln()
    messageParse(
        encryptedMessage = message,
        eventUp = { step ->
            rickPlate.move(Commands.Up(step))
        }, eventDown = { step ->
            rickPlate.move(Commands.Down(step))
        }, eventLeft = { step ->
            rickPlate.move(Commands.Left(step))
        }, eventRight = { step ->
            rickPlate.move(Commands.Right(step))
        })
    println(rickPlate.toString())
}

class Ufo(var x: Int, var y: Int) {
    override fun toString(): String {
        return "текущие координаты тарелки x = $x, y = $y"
    }

    fun move(command: Commands) {
        when (command) {
            is Commands.Down -> {
                y -= command.step
                println("Тарелка Рика сместилась вниз на ${command.step}")
            }

            is Commands.Left -> {
                x -= command.step
                println("Тарелка Рика сместилась влево на ${command.step}")
            }

            is Commands.Right -> {
                x += command.step
                println("Тарелка Рика сместилась вправо на ${command.step}")
            }

            is Commands.Up -> {
                y += command.step
                println("Тарелка Рика сместилась вверх на ${command.step}")
            }
        }
    }


}

sealed class Commands {
    data class Up(val step: Int) : Commands()
    data class Down(val step: Int) : Commands()
    data class Left(val step: Int) : Commands()
    data class Right(val step: Int) : Commands()
}

fun messageParse(
    encryptedMessage: String,
    eventUp: (Int) -> Unit,
    eventDown: (Int) -> Unit,
    eventLeft: (Int) -> Unit,
    eventRight: (Int) -> Unit
) {
    encryptedMessage.forEach { element ->
        when (element) {
            'a' -> eventLeft(1)
            'A' -> eventLeft(2)
            'd' -> eventRight(1)
            'D' -> eventRight(2)
            'w' -> eventUp(1)
            'W' -> eventUp(2)
            's' -> eventDown(1)
            'S' -> eventDown(2)
        }
    }
}
