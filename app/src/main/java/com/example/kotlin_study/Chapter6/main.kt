package com.example.kotlin_study.Chapter6

import java.lang.StringBuilder

fun main(){
//    高阶函数：如果一个函数接收另一个函数作为参数，或者返回值的类型是另一个函数
//    高阶函数中的lambda表达式被kotlin转成了Function接口的匿名类实现了

    val result = StringBuilder().build{
        append("hello")
        append(" High order function")
    }
    println(result.toString())

}

//内联函数：kotlin编译器会将内联函数中的代码在编译时，自动替换到调用它的地方
inline fun newN1N2(num1 : Int,num2 : Int,operation : (Int,Int) -> Int) : Int{
    return operation(num1,num2)
}

//在inline函数中添加noinline关键字，会排除内联
inline fun inlineTest(block1 : () -> Unit,noinline block2 : () -> Unit){

}

/*
* 内联函数和非内联函数的区别
* 1、非内联函数的参数可以传递给任何函数，内联函数参数只允许传递给另外一个内联函数
* 2、内联函数可以使用return关键字来进行返回，非内联函数只能进行局部返回return@...
* */

//内联函数可以使用return关键字返回，当内联函数在匿名类中调用时，此时将无法完成函数调用返回，最多只能在匿名类的函数中进行返回。
// 因此，这种情况下无法使用内联函数
//加入crossinline关键字，此时将不能使用return关键字进行返回，即可在匿名类中调用内联函数
inline fun runRunnable(crossinline block: () -> Unit){
    val runnable = Runnable {
        block()
    }
}



//StringBuilder.() : 调用StringBuilder中的函数
//StringBuilder.build : 函数体内获得StringBuilder的上下文
fun StringBuilder.build(block : StringBuilder.() -> Unit) : StringBuilder{
    block()
    return this
}

private fun HighTest() {
    var result = Num1AndNum2(1, 2, ::plus)
    println(result)
    result = Num1AndNum2(1, 2, ::minus)
    println(result)
    result = Num1AndNum2(1, 2) { n1, n2 -> n1 + n2 }
    println(result)
    result = Num1AndNum2(1, 2) { n1, n2 -> n2 - n1 }
    println(result)
}

//高阶函数
fun Num1AndNum2(num1 : Int,num2 : Int,operation : (Int,Int) -> Int) : Int{
    return operation(num1,num2)
}

fun plus(num1: Int,num2: Int) : Int{
    return num1+num2
}

fun minus(num1: Int,num2: Int) : Int{
    return num1-num2
}