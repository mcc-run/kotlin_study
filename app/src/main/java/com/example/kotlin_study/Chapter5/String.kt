package com.example.kotlin_study.Chapter5

//    扩展函数
fun String.lettersCount() : Int{
    var count = 0
    for (c in this){
        if (c.isLetter())count++
    }
    return count
}