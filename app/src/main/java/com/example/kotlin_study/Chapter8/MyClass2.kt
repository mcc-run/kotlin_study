package com.example.kotlin_study.Chapter8

class MyClass2 {

    //    泛型方法
    fun <T> method(param: T): T {
        return param
    }

    //    给泛型添加类型限制
    fun <T : Number> method2(param: T): T {
        return param
    }

//    泛型默认上界为Any？   若不为空则限制为Any

    //    实现apply函数
    fun <T> T.build(block: T.() -> Unit): T {
        block()
        return this
    }

}