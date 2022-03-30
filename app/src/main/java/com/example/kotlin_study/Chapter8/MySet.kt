package com.example.kotlin_study.Chapter8

//委托类：MySet中的方法若无定义则将有helperSet代实现
class MySet<T>(val helperSet : HashSet<T>) : Set<T> by helperSet {
}