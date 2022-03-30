package com.example.kotlin_study.Chapter8

import kotlin.reflect.KProperty

//懒加载函数
fun <T> later(block: () -> T) = Later(block)

//实现懒加载功能，当被调用时才进行初始化操作
class Later<T>(val block : () -> T) {

    var value : Any? = null

    operator fun getValue(any : Any?, prop : KProperty<*>) : T{
        if (value == null){
            value = block()
        }
        return value as T
    }

}