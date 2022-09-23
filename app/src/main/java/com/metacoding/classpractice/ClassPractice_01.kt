package com.metacoding.classpractice

//1. 클래스 정의하기
//Human 뒤에 constructor는 뺴도 된다
//또한 생성자에 디폴트 값을 줄 수도 있다.
open class Human (val name : String = "default"){//주생성자이다

    //init : 주생성자의 일부이므로 생성자 함수를 호출할 떄 실행된다.
    //생성자는 객체를 만들 떄 속성값을 일일이 넣어주는 것이 번거로으므로 쉽게 속성을 부여하기 위해 사용하는 것이다
    //클래스를 정의하면 자동으로 기본 생성자가 만들어진다.
    //인스턴스를 생성하면 생성자 함수가 호출된다.

    //부생성자 만들기 -> *부생성자는 주생성자의 위임을 받아야 한다*
    constructor(name : String, age : Int) :this(name){
        println("My name is ${name}, I'm ${age}years old")
    }

    init{//주의할 점: init은 주생성자의 일부이므로 constructor가 아무리 많이 있어도 제일 먼저 실행된다.
        println("New human has been born!")
    }

    //클래스 내부 메소드
    open fun eatingCake(){
        println("This is so YUMMYYYY~~")
    }
    open fun sing(){
        println("lalalala~~")
    }
}

//클래스 상속받기
class Korean : Human(){

    //override -> 부모 함수를 사용하는 건 문제가 없으나, 부모의 함수를 바꿀 때는 오버라이딩을 해줘야 한다.
    override fun eatingCake(){
        println("Delicious! I always eat cake with gimchi!")
    }

    //super 사용하기 -> 부모의 함수도 쓰고 싶고, 고쳐서도 쓰고 싶은 경우
    override fun sing() {

        super.sing()//부모의 sing함수도 사용할 수 있다
        println("랄랄라~!!")
        println("my name is : ${name}")//
    }

}

fun main(){

    val human = Human("hani")

    val stranger = Human()//디폴트 값이 있기때문에 생성자는 생성된다. 값을 넣지 않아도 괜찮다.
    human.eatingCake()
    println("My name is ${human.name}")
    println("My name is ${stranger.name}")

    val mom = Human("jjung",50)
    val korean1 = Korean()
    korean1.eatingCake()
    korean1.sing()
    //println()

}