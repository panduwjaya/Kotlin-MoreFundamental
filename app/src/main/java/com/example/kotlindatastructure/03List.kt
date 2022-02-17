package com.example.kotlindatastructure

fun main() {
    val months = listOf("January","february","march")
    val anyType = listOf(1,2,3,true,false,"String")
//    println(anyType.size)//in order to print the amount of item that you have in array
//    println(months[1])//in order show value use an index

    for (month in months){//in order to print each value in array
        println(month)
    }

    //convert list from immutable to mutable and add item in immutable
    val mutableMonths = months.toMutableList()//change from imutable to mutable
    val addMonths = arrayOf("April","May","june")
    mutableMonths.addAll(addMonths)//add data from addMonths to mutableMonths
    mutableMonths.add("july")//to add one data or a few
    println(mutableMonths)

    //how to create mutable list with type data
    val days = mutableListOf<String>("sun","mon","Tue")//we can declared type data before fill the containt or value
    days.add("thu")//we can add data
    days[0] = "sunday"//we can ovewrite data
//    days.removeAt(3)//we can remove based index
//    days.removeAll(days)//this is remove all contains from days array
//    val filter = mutableListOf<String>("mon","Tue")
//    days.removeAll(filter)//this is remove based filter remove
    println(days)
}