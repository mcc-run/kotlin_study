package com.example.test.Kotlin_algorithm


//二分找查
fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    var index = left + (right - left) / 2
    while (nums[index] != target && left < right) {
        if (nums[index] > target) {
            right = index - 1
        } else {
            left = index + 1
        }
        index = left + (right - left) / 2
    }
    if (nums[index] == target) return index
    return -1
}


