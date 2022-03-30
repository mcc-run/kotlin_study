package com.example.test.Kotlin_study.Chapter2.Object

import android.util.Log

//加上open关键字，person可被继承
//val name: String, val age: Int  给主构造函数添加参数
open class Person(val name: String, val age: Int) {

    fun eat(){
        Log.d("Person eat","${name}正在吃饭")
    }

}