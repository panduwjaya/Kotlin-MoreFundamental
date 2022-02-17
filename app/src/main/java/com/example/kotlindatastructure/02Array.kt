package com.example.kotlindatastructure

fun main() {
    //Example how to create an array
    // val numbers:IntArray =  intArrayOf(1,2,3,4,5)
    // val numbers = intArrayOf(1,2,3,4,5) we dont to write very explicite type data

    //how to show all content of array
    val numbers = arrayOf(1,2,3,4)
//    print(numbers)//show memory addres of the array
//    print(numbers.contentToString())//show all content of the array

    //how to show every single item from content of array
    for (element in numbers){
        print(element)//print("${element+2}") -> show calculation from "element+2"
    }

    //how to take value from index array
    print(numbers[0])

    //array in type data double
    val numberDouble : DoubleArray = doubleArrayOf(1.8,1.9,2.55)

    //how to change value from array
//    print("before value change = ${numbers.contentToString()}")//before change
    numbers[0] = 4
    numbers[1] = 3
    numbers[2] = 2
    numbers[3] = 1
//    print("\nafter value change = ${numbers.contentToString()}")//after change

    //from data class fruit
    val fruits = arrayOf(Fruit("Susu Dancow",2500),Fruit("Susu Bendera",6500))
//    print(fruits.contentToString()) //to display containt in data class Fruit

    //to check data in data class
    for (fruit in fruits){
        print("\n${fruit.nameProduct}")
    }

    //to check data in data class and index from value
    for (index in fruits.indices){
        print("\n${fruits[index].nameProduct} is in index $index")
    }

    //array support varags,which support multiple data type even class
    val mix = arrayOf("sunday","monday","thursday",1,2,3,Fruit("Susu Frisian Flag",2600))
    print(mix.contentToString())
}

data class Fruit(val nameProduct: String,val price: Int)