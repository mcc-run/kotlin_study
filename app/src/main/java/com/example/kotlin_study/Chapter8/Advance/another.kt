package com.example.kotlin_study.Chapter8.Advance

open class A(){}

interface B{}

//T : Number    将泛型的上界指定为Number
fun <T : Number> sum(vararg params : T){
    params.sumByDouble { it.toDouble() }
}

//当一个类型参数指定多个约束时，使用where关键字
fun <T> myClass() where T : A, T : B = println()

//*号投影表明不知道关于泛型实参的任何信息
fun printList(list : MutableList<*>){
    for (ele in list) println(ele.toString())
}