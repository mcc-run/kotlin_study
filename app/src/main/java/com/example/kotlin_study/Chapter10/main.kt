package com.example.kotlin_study.Chapter10

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.kotlin_study.Chapter8.MyClass
import com.example.kotlin_study.Chapter8.MySet

fun main(){
    println(getType<MyClass>())
}


/*
* 协变：如果A是B的子类，且Generic<A>是且Generic<B>的子类型，那么且Generic<out T>可以说是个协变类
* 协变：泛型可以作为返回类型，但不能作为参数类型
* 逆变：若果A是B的子类，且Generic<B>是且Generic<A>的子类型，那么且Generic<in T>可以说是个逆变类
* 逆变：泛型可以作为参数类型，但不能作为返回类型
* */


//泛型实化
public inline fun <reified T> getType() = T::class.java

//泛型实化运用
inline fun <reified T> startActivity(context: Context,block : Intent.() ->Unit){
    val intent = Intent(context,T::class.java)
    intent.block()
    context.startActivity(intent)
}

