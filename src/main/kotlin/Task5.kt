fun main() {
    val tank = Tank("Танчик",25);
    val plane = Plane();
    val boat = Boat();
    tank.start()
    tank.stop()
    plane.start()
    plane.stop()
    boat.start()
    boat.stop()
}

open class Vehicle {
    open var name: String = "Автомобиль"
    open var speed: Int = 0
    open fun start() = println("Старт")
    open fun stop() = println("Стоп")
}

class Plane() : Vehicle() {
    override var name = "Самолёт"
    override var speed = 650
    override fun start() = println("$name летит со скоростью $speed км/ч")
    override fun stop() = println("$name приземлился")
}

class Boat() : Vehicle() {
    override var name = "Лодка"
    override var speed = 80
    override fun start() = println("$name двигается со скоростью $speed км/ч")
    override fun stop() = println("$name остановилась")
}

class Tank(private var tankName:String,private var tankSpeed:Int) : Vehicle() {
    override var name = tankName
    override var speed = tankSpeed
    override fun start() = println("$name двигается со скоростью $speed км/ч")
    override fun stop() = println("$name остановился")
}