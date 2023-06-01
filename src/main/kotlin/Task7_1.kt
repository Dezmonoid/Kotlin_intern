fun main() {
    val car1 = Car("Lada", 100)
    val car2 = Car("Lada", 100)
    println("Сравнение  ==  ${car1 == car2}")
    println("Сравнение  ===  ${car1 === car2}")
    println("car1 hashCode: ${car1.hashCode()}")
    println("car2 hashCode: ${car2.hashCode()}")
    val car3 = car1
    car3.name = "Belaz"
    println("Сравнение  ==  ${car1 == car3}")
    println("Сравнение  ===  ${car1 === car3}")
    println("car3 hashCode: ${car3.hashCode()}")
    println("car1 name = ${car1.name}")
    println("car3 name = ${car3.name}")
    val Vehicle1 = Vehicle("Ural", 100)
    val Vehicle2 = Vehicle("Ural", 100)
    println("Сравнение  ==  ${Vehicle1 == Vehicle2}")
    println("Сравнение  ===  ${Vehicle1 === Vehicle2}")
    println("Vehicle1 hashCode: ${Vehicle1.hashCode()}")
    println("Vehicle2 hashCode: ${Vehicle2.hashCode()}")
    val Vehicle3 = Vehicle1.copy(name = "Zil")
    println("Сравнение  ==  ${Vehicle1 == Vehicle3}")
    println("Сравнение  ===  ${Vehicle1 === Vehicle3}")
    println("Vehicle3 hashCode: ${Vehicle3.hashCode()}")
    println("Vehicle1 name = ${Vehicle1.name}")
    println("Vehicle3 name = ${Vehicle3.name}")
}

class Car(var name: String, var speed: Int)
data class Vehicle(var name: String, var speed: Int)
