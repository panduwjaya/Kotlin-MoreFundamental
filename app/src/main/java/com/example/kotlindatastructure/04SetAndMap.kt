package com.example.kotlindatastructure
//Set is a type of collection that eliminates duplicate data
fun main() {
    val fruits = setOf("Orange","Apple","Grape","Apple")
    println(fruits.size)//size is 3 because "Apple" is duplicate and Set is eliminate duplicate data
    println(fruits)//will ignore "Apple"
    println(fruits.toSortedSet())//will igonre "Apple" and sort based alphabet

    //mutable set,change from imutable to mutable
    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))//to get display value from index 4 in Set

//    maps is collection that holds data in that holds data in the form of a key value pair which form a map
//    map in order langguange this also called hashmap or dictionary
    val daysOftheWeek = mapOf(1 to "monday",2 to "Tuesday",3 to "Wednesday")
//    println(daysOftheWeek[2])//this is not index,but this is key

//    loop contains in map
//    for(key in daysOftheWeek.keys){
//        println("$key is to ${daysOftheWeek[key]}")
//    }

//    using data class in map
    val fruitsMap = mapOf("Favorite Fruit" to Fruitss("Apple",2.5),"Not favorite" to Fruitss("manggo",3.5))

//    mutable in map
    val newDaysOfWeek = daysOftheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

//    sorting in map ussually using two sorted map method,but actually in map have any more sort method
    // one,two,three to five called key and name of the day is value
    println(newDaysOfWeek.toSortedMap())//{1=monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday}
}

data class Fruitss(val name: String,val price: Double)