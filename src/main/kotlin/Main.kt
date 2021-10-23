//abstract class  Human() {
//    abstract var age: Int
//    abstract fun hello()
//}
//
//abstract class Employee(){
//    abstract var exp: Int
//    abstract fun showInfo()
//}
//
//class Person(private var name: String) : Human(){
//    override var age: Int = 0
//        get() = age
//        set(value) {
//            if (value < 0){
//                println("Некорректные данные")
//            }
//            else{
//                field = value
//            }
//        }
//
//    override fun hello() {
//        println("Hello, $name")
//    }
//}


abstract class Figure{
    abstract fun area(): Float
    fun id2d() : Boolean{
        return true
    }
}


class Rectangle(var width: Float, var height: Float) : Figure(){
    override fun area(): Float {
        return width * height
    }
}

class Triangle(var height: Float, var base: Float) : Figure(){
    override fun area(): Float {
        return (height/2)*base
    }
}

interface Movable{
    var speed: Float
    fun move()
    fun stop(){
        println("Остановка")
    }
}



class Cat : Movable{
//    override var speed: Float = 20f

    override var speed: Float = 0.0f
        get() = field
        set(value) {field = value}

    override fun move() {
        println("Мяуууууууууууууууууууу!")
    }

    override fun stop() {
        println("Когти в стороны")
    }

}

class Car : Movable{
    override var speed: Float = 60f

    override fun stop() {
        super.stop()
        println("машины")
    }

    override fun move() {
        println("Догоняйте пасаны!")
    }

}

interface Swimable{
    fun swim()
}

interface Jumpable{
    fun jump()
}

class Rabbit : Jumpable{
    override fun jump() {
        println("Кролик прыгает!")
    }
}

class Fish : Swimable{
    override fun swim() {
        println("Рыба умеет плавать!")
    }
}

class Frog : Swimable, Jumpable{
    override fun swim() {
        println("Лягушка умеет плавать!")
    }

    override fun jump() {
        println("Лягушка умеет прыгать!")
    }

}

fun main(){

    var zhigul = Car()
    zhigul.speed = 100f
    println("скорость = ${zhigul.speed}")
    zhigul.move()
    zhigul.stop()
    println()
    var tosha = Cat()
    tosha.speed = 20f
    println("скорость = ${tosha.speed}")
    tosha.move()
    tosha.stop()

    var frog = Frog()
    frog.swim()
    frog.jump()
//

//    var rect1 = Rectangle(10f, 12f)
//    println(rect1.area())
//    println(rect1.id2d())
//    var tri1 = Triangle(10f, 12f)
//    println(tri1.area())
//    println(tri1.id2d())



//    var person1 = Person("Вася")
//    person1.hello()
//    person1.age = 12

}