package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun main() {
    val nums = intArrayOf(1,2,3,1)
    println(findPeakElement(nums))
}

fun findPeakElement(nums: IntArray): Int  {
    // write code here

    if (nums.size == 1 || nums[0] > nums[1])return 0
    if (nums[nums.size-1] > nums[nums.size-2])return nums.size-1

    var i = 1

    while (i < nums.size-1){
        if (nums[i] > nums[i+1])return i
        i++
    }

    return nums.size-1

}