package com.example.supershortcuts.ui.main

class MyClass {

    fun outPutName(first: String, last: String, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println(fullName)
    }

    fun outPutNameAndScore(first: String, last: String, upperCase: Boolean = false, score: Int) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName score:$score")
    }

    fun outPutNameAndAge(first: String, last: String, age: Int, upperCase: Boolean = false) {
        val fullName = if (upperCase) {
            first + last
        } else {
            (first + last).toUpperCase()
        }

        println("$fullName age:$age")
    }


















    // moving class
    val parent = Parent()

    class Child {
        // TODO:
    }

    class Parent {
        val other = Child()
    }





















    fun DoBar(first: String, second: Int) {
        println(first)
        println(second)
    }

    fun DoFoo(first: String, second: Int, third: Int, fourth: Int) {
        println(first)
        println(second)
        println(third)
        println(fourth)
    }




































    fun longAuguments(first: String, second: Int, third: Int, fourth: Int,fifth: String, sixth: Int, seventh: Int, eighth: Int){
        println(first)
        println(second)
        println(third)
        println(fourth)
        println(fifth)
        println(sixth)
        println(seventh)
        println(eighth)
    }


}



