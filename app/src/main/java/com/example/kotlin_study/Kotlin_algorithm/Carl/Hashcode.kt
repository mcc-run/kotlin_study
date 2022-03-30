package com.example.test.Kotlin_algorithm


fun isAnagram(s: String, t: String): Boolean {
    var map1 = mutableMapOf<Char,Int>()
    var map2 = mutableMapOf<Char,Int>()

    for (c in s){map1[c] = map1[c]?.plus(1) ?: 1 }
    for (c in t)map2[c] = map2[c]?.plus(1) ?: 1

    for (v in map1){
        if (v.value != map2[v.key])return false
        map2.remove(v.key)
    }

    if (map2.isEmpty())return true

    return false
}