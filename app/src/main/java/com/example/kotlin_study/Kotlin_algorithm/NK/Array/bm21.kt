package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun minNumberInRotateArray(rotateArray: IntArray): Int  {
    // write code here

    var left = 0
    var right = rotateArray.size-1
    while(rotateArray[left] == rotateArray[right] && right >= 0){
        right--
    }

    val min = rotateArray[left]
    val max = rotateArray[right]

    while (left < right){
        val middle = left + (right - left)/2
        if (rotateArray[middle] >= min){
            if (rotateArray[middle] > rotateArray[middle+1]){
                return rotateArray[middle+1]
            }else {
                left = middle+1
            }
        }else {
            if (middle - 1 < 0)break
            if (rotateArray[middle] < rotateArray[middle-1]) return rotateArray[middle]
            else right = middle - 1
        }

    }
    return min
}