package com.example.kotlin_study.Chapter4

import kotlin.properties.Delegates


class chapter4 {

    //    添加lateinit关键字，可暂时不对变量初始化，并可使用非空类型，从而避免大量判空操作
    lateinit var xy: String

    fun getxy() {
//        ::xy.isLateinit   判断该类是否已经初始化
        if (!::xy.isLateinit) {
            xy = ""
        }
    }
}

//不能定义在其他类中
//密封类sealed class ： 无需方法success、failure为密封类的两个实现类
sealed class Result
class success(val msg : String) : Result()
class failure(val msg : String) : Result()

//配合when使用，自动检测是否已经实现密封类的所有操作，若已经实现，则无需添加else分治
fun getmsg(result: Result) = when(result){
    is success -> result.msg
    is failure -> result.msg
}


fun main() {}