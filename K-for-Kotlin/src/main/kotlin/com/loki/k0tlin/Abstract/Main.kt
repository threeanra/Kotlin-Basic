package com.loki.k0tlin.Abstract

abstract class Animal{
    //use abstract if you didn't set the default value, then use open if you set the value
    abstract val name: String
    abstract val age: Int

// this is we set the value first
//    open fun eat(){
//        println("$name sedang makan coy")
//    }
//    open fun sleep(){
//        println("$name sedang tidur coy")
//    }

// and this is we didn't set the value, i used the abstract method
    abstract fun eat()
    abstract fun sleep()
}

class Cat : Animal(){
    override val name: String = "Penaldo"
    override val age: Int = 10

    override fun eat() {
       // super.eat() using super when you wanna call the fun without new declaration inside the body
        println("$name sedang makan coy")
    }

    override fun sleep(){
      // super.sleep() using super when you wanna call the fun without new declaration inside the body
        println("$name sedang tidur coy")
    }
}

fun main(){
    val cat = Cat()
    println("Nama kucing ini adalah ${cat.name} dan berumur ${cat.age}")
    println(cat.eat())
    println(cat.sleep())

}