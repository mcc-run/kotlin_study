package com.example.kotlin_study.Chapter8.Advance

import java.lang.reflect.ParameterizedType

//  通过匿名类获取泛型信息
object Generic1 {

    open class InnerClass<T>

    @JvmStatic
    fun main(){
        val innerClass = object : InnerClass<Int>(){
        }
//        获取当前对象的直接超类的 Type
        val typeClass = innerClass.javaClass.genericSuperclass
        println(typeClass)
        if (typeClass is ParameterizedType){
            //actualTypeArguments ： 表示此类型实际类型参数的 Type 对象的数组
            val actualType = typeClass.actualTypeArguments[0]
            println(actualType)
        }
    }

}