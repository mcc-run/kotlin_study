package com.example.kotlin_study.Chapter8

import kotlin.reflect.KProperty

class Delegate {

    var propValue: Any? = null

//    第一个参数声明该类的委托功能可以再什么类中使用，第二个参数时属性操作类，用于获取各种属性相关的值，必须声明
    operator fun getValue(myClass: MyClass, prop: KProperty<*>): Any? {
        return propValue
    }

    operator fun setValue(myClass: MyClass, prop: KProperty<*>, value: Any?) {
        propValue = value
    }

}