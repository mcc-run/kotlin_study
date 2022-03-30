package com.example.test.Kotlin_study.Chapter2.lambda


import com.example.test.Kotlin_study.Chapter2.Object.Student
import com.example.test.Kotlin_study.Chapter2.Object.study
import java.util.*

fun main(){

    listTest()
    funAPITest()

}


fun listTest(){
    //    listOf不可变集合
    val list1 = listOf<String>("apple","orange","banana","pear","grape")

//    当lambda表达式为最后一个参数时，可以将函数的括号省略
    val maxleng1 = list1.maxByOrNull { fruit : String -> fruit.length }
    val maxleng2 = list1.maxByOrNull { fruit -> fruit.length }
    val maxleng3 = list1.maxByOrNull { it.length }

//    转换大写
    val Uplist = list1.map { it.uppercase(Locale.getDefault()) }
//    限制长度
    val limitleng = list1.filter { it.length <= 5 }
//    是否存在满足条件的值
    val anyResult = list1.any({it.length <= 5})
//    是否都满足条件
    val allResult = list1.all { it.length <= 5 }

//    mutableListOf可变集合
    val list2 = mutableListOf("apple","orange","banana","pear","grape")
    list2.add("watermelon")
//    集合：元素不可重复
    val set = setOf("apple","orange","banana","pear","grape")
//    map：键值对   两种添加值方式"orange" to 10、map["apple"] = 3
    val map = mutableMapOf("orange" to 10)
    map["apple"] = 3
}

//java函数式API
fun funAPITest(){
    //    函数式API：接收接口并实现
    Thread(object : Runnable{
        override fun run() {
            println("函数式API调用")
        }
    }).start()
//    当抽象类只有一个抽象方法待实现时
    Thread(Runnable{
        println("当抽象类只有一个方法待实现时，可直接写函数体")
    }).start()
//    再次简化
    Thread({ println("再次简化")}).start()
}

//kotlin判空
fun doStudy(study: study?){
//    可控类型操作前需要判空
    study?.readbook()
    study?.doHomework()
//    使用let函数简化判空
    study?.let {
        it.readbook()
        it.doHomework()
    }
}

fun getTextleng(text : String?) : Int{
//    若text为空，则赋值右边的值
    return text?.length ?: 0
}

//