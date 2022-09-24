package com.metacoding.classpractice

val square : (Int) -> (Int) = {number -> number * number}

val nameAge : (String, Int) -> String = {name : String, age : Int ->
    "저는 ${name}이고 ${age}살입니다."
    //람다에서는 항상 마지막에 있는 값이 리턴값이다
}

//확장함수
//ex1)
val pizzaIsGreat : String.() -> String = {
    this + " Pizza is the best"
}

fun extensionString(name : String, age : Int) : String{

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it}years old"}
    return name.introduceMyself(age)
}

//람다의 리턴 : input 파라미터는 여러 개가 들어올 수 있으므로 꼭 ()로 묶어줘야 하며, 리턴값은 타입이 하나이므로 안써줘도 된다,
val calculateGrade : (Int) -> String  = {
    //it은 들어가는 파라미터가 하나이므로, 하나의 Int를 가리킨다.
    when(it){
        in 0 until 60 -> "fail"
        in 60 until 70 -> "C"
        in 70 until 80 -> "B"
        in 80 until 90 -> "B+"
        in 90  until 100 -> "A+"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{

    return lamda(3.141592)
}


fun main(){

    var result = square(12)
    println("${result}")
    println("${square(15)}")

    println(nameAge("조하은",22))

    val potato : String = "potato"
    println(potato.pizzaIsGreat())


    //ex 2)
    println(extensionString("고성진",22))//람다의 리턴은 마지막 줄이다.

    //ex 3)
    println(calculateGrade(144))
    println(calculateGrade(50))
    println(calculateGrade(66))
    println(calculateGrade(78))
    println(calculateGrade(89))
    println(calculateGrade(93))

    //람다를 표현하는 여러가지 방법
    val lamda = {number : Double ->
        number == 3.141592
    }
    println(lamda(3.141592))

}