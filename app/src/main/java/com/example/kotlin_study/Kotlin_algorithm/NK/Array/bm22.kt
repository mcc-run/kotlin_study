package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

fun compare(version1: String,version2: String): Int  {
    // write code here

    var one = 0
    var two = 0

    var oneIndex = 0
    var twoIndex = 0

    while (oneIndex < version1.length && twoIndex < version2.length){
        while (oneIndex < version1.length && version1[oneIndex] != '.'){
            one = one * 10 + version1[oneIndex++].toInt() - '0'.toInt()
        }
        oneIndex++
        while (twoIndex < version2.length && version2[twoIndex] != '.'){
            two = two * 10 + version2[twoIndex++].toInt() - '0'.toInt()
        }
        twoIndex++
        if (one > two)return 1
        if (one < two)return -1
        one = 0
        two = 0
    }
    while (oneIndex < version1.length){
        while (oneIndex < version1.length && version1[oneIndex] != '.'){
            one = one * 10 + version1[oneIndex++].toInt() - '0'.toInt()
        }
        oneIndex++
        if (one != 0)return 1
    }
    while (twoIndex < version2.length){
        while (twoIndex < version2.length && version2[twoIndex] != '.'){
            two = two * 10 + version2[twoIndex++].toInt() - '0'.toInt()
        }
        twoIndex++
        if (two != 0)return -1
    }

    return 0
}