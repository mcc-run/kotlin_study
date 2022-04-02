package com.example.kotlin_study.Chapter8.Advance

import java.lang.reflect.ParameterizedType

//      反射获取泛型信息
object Generic2 {

    @JvmStatic
    fun main(){

    }

    open class Father<T>

    class GenericChild : Father<String>(){
        fun printType(){
            val genType = javaClass.genericSuperclass
            println(genType)
            val params = (genType as ParameterizedType).actualTypeArguments[0]
            println(params)
        }
    }


}