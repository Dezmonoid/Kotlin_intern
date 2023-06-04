fun main() {
    println("Введите два числа и знак операции(*,/,+,-)")
    val numberOne: Int = readln().toInt()
    val numberTwo: Int = readln().toInt()
    val operationType: String = readln()
    when (operationType) {
        "*" -> {
            println("Результат вычисления: $numberOne * $numberTwo = ${numberOne * numberTwo}")
        }

        "/" -> {
            if (numberTwo != 0) {
                println("Результат вычисления: $numberOne * $numberTwo = ${numberOne / numberTwo}")
            } else {
                println("На ноль делить нельзя")
            }
        }

        "+" -> {
            println("Результат вычисления: $numberOne * $numberTwo = ${numberOne + numberTwo}")
        }

        "-" -> {
            println("Результат вычисления: $numberOne * $numberTwo = ${numberOne - numberTwo}")
        }

        else -> {
            println("Вы ввели неизвестную операцию")
        }
    }
}