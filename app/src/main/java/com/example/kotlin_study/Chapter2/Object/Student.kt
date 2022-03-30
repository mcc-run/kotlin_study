package com.example.test.Kotlin_study.Chapter2.Object

//类名旁边的括号即为主构造函数
//Person()调用了person类的无参构造函数
class Student(val sno : String, val grade : Int, name: String, age: Int) : Person(name, age),
    study {

    init{
        println("init为主构造函数的逻辑体")
    }

//    次构造函数
    constructor(name : String,age: Int) : this("",0,name,age){

    }
//    调用次构造函数
    constructor() : this("",0){

    }

//    实现接口类study
    override fun readbook() {
        println("${name}正在学kotlin")
    }

    override fun doHomework() {
        println("${name}正在敲代码")
    }

//    当没有主构造函数时，可直接调用父类的构造函数：super
//    constructor(name : String,age : Int) : super(name, age){
//
//    }



}