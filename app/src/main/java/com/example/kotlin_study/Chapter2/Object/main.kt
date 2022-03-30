package com.example.test.Kotlin_study.Chapter2.Object

//public 默认
//private
//protected 当前类和子类
//internal 模块内

fun main(){
    val student = Student("马锦维",23)
    student.readbook()
//    调用单例类，类似调用静态类
    Singleton.SingletonTest()
}