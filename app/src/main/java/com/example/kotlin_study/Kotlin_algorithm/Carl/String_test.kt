package com.example.test.Kotlin_algorithm

//翻转数组
fun reverseString(s: CharArray): Unit {
    var char : Char
    var i : Int = 0
    var leng = s.size
    while (i < leng/2){
        char = s[i]
        s[i] = s[leng-i-1]
        s[leng-i-1] = char
        i++
    }
}