package com.example.kotlin_study.Chapter13

import java.lang.StringBuilder

fun mian(){

}

fun table(block: Table.() -> Unit) : String{
    val table = Table()
    table.block()
    return table.html()
}

class Table{
    private val children = ArrayList<Tr>()

    fun tr(block: Tr.() -> Unit){
        val tr = Tr()
        tr.block()
        children.add(tr)
    }

    fun html(): String {
        return StringBuilder().run {
            append("<table>")
            for (child in children){
                append(child.html())
            }
            append("\n</table>")
            toString()
        }
    }
}

class Tr{
    private val children = ArrayList<Td>()

    fun td(block: Td.() -> String){
        val td = Td()
        td.content = td.block()
        children.add(td)
    }

    fun html(): String {
        val builder = StringBuilder()
        builder.append("\n\t<tr>")
        for (child in children){
            builder.append(child.html())
        }
        builder.append("\n\t</tr>")
        return  builder.toString()
    }

}

class Td {
    var content = ""

    fun html() = "\n\t\t<td>$content</td>"
}

fun dependecies(block : Dependency.() -> Unit) : List<String>{
    val dependency = Dependency()
    dependency.block()
    return dependency.libraries
}

class Dependency{

    val libraries = ArrayList<String>()

    fun implementation(lib : String){
        libraries.add(lib)
    }

}