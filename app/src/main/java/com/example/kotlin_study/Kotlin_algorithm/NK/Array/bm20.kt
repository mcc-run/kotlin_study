package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

lateinit var Num : IntArray

var reserve = 0

fun InversePairs(data: IntArray): Int  {
    // write code here

    Num = data
    merge(0,data.size-1)
    return reserve
}

fun merge(left : Int,right : Int){
    if (left == right)return

    val middle = left + (right - left)/2

    merge(left,middle)
    merge(middle+1,right)

    val nums = arrayListOf<Int>()
    var one = left
    var two = middle+1
    while (one <= middle && two <= right){
        if (Num[one] > Num[two]){
            nums.add(Num[two++])
        }else {
            nums.add(Num[one++])
            reserve = (reserve + two - middle - 1) % 1000000007
        }
    }

    while (one <= middle){
        nums.add(Num[one++])
        reserve = (reserve + two - middle - 1) % 1000000007
    }
    while (two <= right){
        nums.add(Num[two++])
    }
    for(i in left..right) Num[i] = nums[i-left]
}