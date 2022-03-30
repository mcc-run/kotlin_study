package com.example.kotlin_study.Chapter9

fun main(){

    println("hello chapter9" beginwith "hello")

}

//infix函数允许我们将函数调用时的小数点、括号等计算机相关的语法去掉
//infix函数必须是某个类的成员函数    必须接收且只能接收一个参数
infix fun String.beginwith(str : String) = startsWith(str)