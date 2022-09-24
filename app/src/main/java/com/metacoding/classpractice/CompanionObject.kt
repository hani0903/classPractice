package com.metacoding.classpractice

class Book private constructor(val id :Int, val name : String){

    companion object{
        fun create() = Book(0, "animal farm")
    }

}

//object 키워드를 써서 클래스 만들기
object CarFactory{// 이 객체는 다른 클래스와 다르게 모든 앱을 실행할 때 딱 한번 만들어준다. -> singleton Pattern -> 생성자 없이 직접 호출 가능하다.

    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        return car
    }

}

data class Car(val horsePower : Int)

fun main(){
    var book = Book.Companion.create()

    println("${book.id} ${book.name}")

    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}