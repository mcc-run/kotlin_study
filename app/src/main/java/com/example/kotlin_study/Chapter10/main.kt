package com.example.kotlin_study.Chapter10

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.example.kotlin_study.Chapter8.MyClass
import com.example.kotlin_study.Chapter8.MySet

fun main(){
    println(getType<MyClass>())
}


//泛型实化
public inline fun <reified T> getType() = T::class.java

//泛型实化运用
inline fun <reified T> startActivity(context: Context,block : Intent.() ->Unit){
    val intent = Intent(context,T::class.java)
    intent.block()
    context.startActivity(intent)
}

/*
* B是A的子类  在class<out T>中  class<B> 也是 class<A>  此时称为泛型的协变
* B是A的子类  在class<in T>中  class<A> 是 class<B>  此时称为泛型的逆变
* */
