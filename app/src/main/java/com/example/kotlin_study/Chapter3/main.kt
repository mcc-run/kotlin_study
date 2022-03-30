package com.example.test.Kotlin_study.Chapter3

import java.lang.StringBuilder


fun main() {
//    withTest()
//    runTest()
    applyTest()
}

fun withTest() {
    val list = listOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
//    with函数：将第一个参数的上下文作为参数传入至第二个参数中，方便调用第一个参数的方法,并会将最后一行作为结果返回
    val result = with(StringBuilder()) {
        append("start eating fruits: \n")
        for (f in list) append("$f \n")
        append("Ate all fruits")
        toString()
    }
    println(result)
}


fun runTest() {
    val list = listOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
//    run函数：和with函数高度相似，形式不同
    val result = StringBuilder().run {
        append("start eating fruits: \n")
        for (f in list) append("$f \n")
        append("Ate all fruits")
        toString()
    }
    println(result)
}


fun applyTest() {
    val list = listOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
//    apply函数：会返回调用对象本身
    val result = StringBuilder().apply {
        append("start eating fruits: \n")
        for (f in list) append("$f \n")
        append("Ate all fruits")
    }
    println(result.toString())
}



class Util {
    fun act1() {
        println("这不是一个静态方法，需要实例化后才能使用")
    }
    //    companion object 关键字，在Util内生成一个伴生类，并保证只存在一个该类

    companion object {
        //    形式上的静态方法，在java代码中无法调用
        fun act2() {
            println("这是一个形式上的静态方法，无需实例化亦可在kotlin中调用")
        }

        //    添加JvmStatic注解，即为真正的静态方法
        @JvmStatic
        fun act3() {
            println("这是一个静态方法，无需实例化亦可调用")
        }
    }

    //未定义在任何类上的方法会在编译时自动被kotlin转换为静态方法

}
