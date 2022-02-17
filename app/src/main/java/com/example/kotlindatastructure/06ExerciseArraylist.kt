package com.example.kotlindatastructure

//Please write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers
//Please use a for (in) loop in this exercise.Good luck :)

fun main() {
//This is one way of doing it, there are plenty of other ways however. If your program works, then it is fine, even if the code is different :)
    val myArrayList: ArrayList<Double> = ArrayList()
    myArrayList.add(13.212312)
    myArrayList.add(23.151232)
    myArrayList.add(32.651553)
    myArrayList.add(16.223817)
    myArrayList.add(18.523999)
    var total = 0.0
    for (i in myArrayList){
        total += i
    }
    var average = total / myArrayList.size
    println("Avarage is " + average)

}