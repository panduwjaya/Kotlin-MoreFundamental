package com.example.kotlindatastructure
//Why should use ArrayList
//arraylist used to create a dyanamic array.which means the size of an Arraylist can be increased or decereased according to your requirement
//The arrayList class provides both read and write functionalities
//The ArrayList follows the sequens of insertion order
//an ArrayList is non synchronized and it may contain duplicate element

//Constructor of ArrayList
//ArrayList<E>() = is used to create an empty ArrayList
//ArrayList(capacity: Int) = is used to create an ArrayList of specified capacity
//ArrayList(element: Collection<E>) = is used to create an ArrayList Filled with the element of a collection

//Function of Arraylist
//open fun add(element: E):Boolean = used to add the specific element the collection
//open fun clear() = used to remove all element from the collection
//open fun get(index: Int): E = used to return the element at specified index in the list
//open fun remove(element: E): Boolean = used to remove a single instance of specific element from current collection,if it available
//
fun main() {
//    Empty ArrayList
//    we cant to replace arrayList object but we can to replace contains from arrayList
    val arraylist = ArrayList<String>()//creating an empty arrayList
    arraylist.add("One")//Adding an object in Arraylist
    arraylist.add("Two")
    println("Print ArrayList")
    for (i in arraylist){
        println(i)
    }

//    ArrayList using collections
    val arrayListCollection: ArrayList<String> = ArrayList<String>(5)//limit to five enty
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One-collection")
    list.add("Two-collection")

    arraylist.addAll(list)
    println("print ArrayList")
    val itr =  arraylist.iterator()

    while (itr.hasNext()){
        println(itr.next())
    }

    println("size of arraylistCollection = "+arrayListCollection.size)

//    Arraylist - get()
    val arrayListget:ArrayList<String> = ArrayList<String>()
    arrayListget.add("One")
    arrayListget.add("two")
    println("Print Arraylist get")
    for (l in arrayListget){
        println(l)
    }
    println("arralistget.get(1) = "+arrayListget.get(1))
}