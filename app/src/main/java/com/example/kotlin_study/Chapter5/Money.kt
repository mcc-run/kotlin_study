package com.example.kotlin_study.Chapter5

class Money(val value : Int) {

//    重载运算符
    operator fun plus(money: Money) : Money{
        val sum = value+money.value
        return Money(sum)
    }

    operator fun plus(money: Int) : Money{
        val sum = value + money
        return Money(sum)
    }

}