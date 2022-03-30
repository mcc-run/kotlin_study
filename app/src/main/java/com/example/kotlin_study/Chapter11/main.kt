package com.example.kotlin_study.Chapter11

import kotlinx.coroutines.*
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

fun main() {



//阻塞当前协程，在该协程下的所有协程都会被阻塞
//    Thread.sleep(1000)

}

suspend fun request(address : String) : String{
//    suspendCoroutine函数    接收一个Lambda表达式，Lambda表达式的参数列表中会传入一个continuation参数，调用他的resume或resumeWithException可以让协程恢复执行
    return suspendCoroutine {
        continuation -> continuation.resume("hello")
    }
}

//通过async函数 会创建一个新的子协程闭关返回一个Deferred对象，调用Deferred.await()方法可获得代码块返回结果
//当调用await函数时，若代码块中的代码还没执行完毕，会将当前协程阻塞住，直到获得async结果
private fun asyncTest() {
    runBlocking {
        val result = async {
            5 + 5
        }.await()
        println(result)
    }
}

//协程的标准写法
private fun noamalTest() {
    val job = Job()
    val scope = CoroutineScope(job)
    scope.launch {
//        处理具体逻辑
    }
//    取消协程
    job.cancel()
}

//suspend关键字    声明挂起函数，挂起函数之间可以相互调用
private suspend fun printLaunch() {
//    coroutineScope挂起函数，可在协程作用域或挂起函数中调用。会继承外部的协程作用域并创建一个子协程
//    可以保证作用域内的所有代码和字写成全部执行玩之前，外部的协程会一直被挂起
//    只会阻塞当前协程，不会影响其他协程和线程
    coroutineScope {
        launch {
            println("launch1")
            delay(1000)
            println("launch1")
        }
    }

}

//    创建一个协程的作用域，它保证在协程作用域内的所有代码和字写成没有全部执行完之前一直阻塞当前线程
//    会挂起外部线程，若在主界面可能导致界面卡死的情况
//    一般在测试环境下使用
private fun runBlockingTest() {
    runBlocking {
//        launch函数必须在谢成德作用域中才能调用，会在当前协程的作用域下创建子协程
//        子协程：如果外层作用域的协程结束了，该作用域下的所有子协程会一同结束
        launch {
            printLaunch()
        }
        launch {
            println("launch2")
            delay(1000)
            println("launch2")
        }
    }
}


//    创建一个协程的作用域
//    创建的是顶层协程，这种协程当应用程序运行结束时也会跟着一起结束。
private fun GlobalScopeTest() {
    GlobalScope.launch {
        println("Test")
//      挂起函数  让当前协程延迟指定时间后再运行，非阻塞式的挂起函数，只会挂起当前协程。不会影响其他协程的运行
        delay(1500)
        println("Test")
    }
}