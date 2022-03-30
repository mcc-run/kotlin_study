package com.example.kotlin_study.Kotlin_algorithm

import java.util.*

//232
class MyQueue() {

//    栈
    val stack = Stack<Int>()
//    队列
    val queue = Stack<Int>()
    var isstack = true

    fun push(x: Int) {
        if (!isstack)reverse()
        stack.push(x)
    }

    private fun reverse() {
        if (isstack){
            queue.clear()
            repeat(stack.size){
                queue.push(stack.pop())
            }
        }else {
            stack.clear()
            repeat(queue.size){
                stack.push(queue.pop())
            }
        }
        isstack = !isstack
    }

    fun pop(): Int {
        if (isstack)reverse()
        return queue.pop()
    }

    fun peek(): Int {
        if (isstack)reverse()
        return queue.peek()
    }

    fun empty(): Boolean {
        if (isstack)return stack.empty()
        return queue.empty()
    }

}