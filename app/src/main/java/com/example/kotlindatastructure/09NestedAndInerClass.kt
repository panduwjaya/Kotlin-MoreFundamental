package com.example.kotlindatastructure

fun main() {
    val outerClass1 = OuterClass1.Nested()
    outerClass1.printMessage("Hello Pandu")//we can acces data member from class Nested

    val outerClass2 = OuterClass2().Nested()
    outerClass2.printMessage()//in inner class we can acces data member in outer class or class nested
}

//nested class
//nested class is such class which is created inside another class
//in kotlin a nested class is by default static so its data members and member funciton can be accessed without creating an object of the class
//nested classes cannot acces the data members of outer classes

class  OuterClass1 {
    val apple = "Apple"
    val number = 25

    class Nested {//this is nested class
        fun printMessage(message: String){
            println(message)
        }
    }
}

//inner class
//inner class can acces data member from outter class
//an inner class is a class which is created inside another class with keyword "inner"
//in other words we can say that a nested class which is marked as "inner" is called inner class
//inner class cannot be declared inside interface or non-inner nested classes
//the advantege of inner class over nested class is that,it is able to acces members of its outer class even it is private
//the inner class keeps a reference to an object of its outer class

class OuterClass2 {
    val apple = "Apple"
    val number = 25

    inner class Nested { //this is inner
        fun printMessage(){
            println("$apple is $number")
        }
    }
}