package com.example.kotlindatastructure

fun main() {
//    For example, a regular variable of type String cannot hold null
    var a: String = "abc" // Regular initialization means non-null by default
//    a = null // compilation error

//    Kotlin To allow nulls, you can declare a variable as a nullable string by writing String?
    var b: String? = "abc" // can be set to null
    b = null // ok
    println(b)

    val l = a.length//
    println(l)
//    val m = b.length // error: variable 'b' can be null

}