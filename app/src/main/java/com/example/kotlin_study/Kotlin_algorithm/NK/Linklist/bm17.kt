package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun search(nums: IntArray,target: Int): Int  {
    // write code here

    var start = 0
    var end = nums.size-1

    while (start <= end){
        val middle = start + (end - start)/2
        when {
            nums[middle] == target -> return middle
            nums[middle] < target -> start = middle + 1
            else -> end = middle - 1
        }
    }


    return -1
}