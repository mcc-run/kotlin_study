package com.example.kotlin_study.Kotlin_algorithm.NK.Linklist

var row = 0
var col = 0
lateinit var nums: Array<IntArray>
var find = 0

fun Find(target: Int,array: Array<IntArray>): Boolean  {
    // write code here

    row = array.size
    col = array[0].size
    if (row == 0 || col == 0)return false
    nums = array
    find = target


    return search(0,0)
}

fun search(x : Int,y : Int) : Boolean{

    if (x >= row || y >= col)return false

    var left = y
    var up = x

    while (left < col && up < row){
        if (nums[up][left] == find)return true
        else if (nums[up][left] > find)break
        else {
            left++
            up++
        }
    }

    if (left == y && up == x)return false

    if (search(x,left))return true
    if (search(up,y))return true

    return false
}