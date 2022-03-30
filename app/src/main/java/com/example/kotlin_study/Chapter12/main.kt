package com.example.kotlin_study.Chapter12

import android.content.Context
import android.widget.Toast
import java.lang.RuntimeException

fun main(){
    max(3.6,5.1,66.312323)

}


fun String.showToast(context: Context){
    Toast.makeText(context,this, Toast.LENGTH_SHORT).show()
}

//将泛型上界指定为Comparable<T>    只要实现Comparable接口的子类型都可以获取他们的最大值
fun <T : Comparable<T>> max(vararg nums : T) : T{
    if (nums.isEmpty())throw RuntimeException("Params can not be empty")
    var maxNum = nums[0]
    for (num in nums){
        if (num > maxNum)maxNum = num
    }
    return maxNum
}

//vararg关键字 允许接收任意多个同等类型的参数
fun max(vararg nums : Int) : Int{
    var maxNum = Int.MIN_VALUE
    for (num in nums)maxNum = kotlin.math.max(maxNum,num)
    return maxNum
}

