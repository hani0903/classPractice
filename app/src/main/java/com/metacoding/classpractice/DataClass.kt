package com.metacoding.classpractice

//data 클래스 -> 객체를 출력하면 내용을 출력해준다.
data class Ticket(val compayName : String, val name : String, var date : String, var seatNumber : Int )
    //toString(), hashCode(), equals(), copy() -> 알아서 만들어줌

class Ticket2(val compayName : String, val name : String, var date : String, var seatNumber : Int )

fun main(){
    val ticketA = Ticket("koreanAir","hani","2022 -09 - 24",14)
    val ticketB = Ticket2("koreanAir","hani","2022 -09 - 24",14)
    println(ticketA)//티켓 내용이 출력된다
    println(ticketB)//주소가 출력된다.
}

