package com.loki.k0tlin.`Different-between-abstract-and-interfaces`

abstract class Animal {
    //default value not allowed
    abstract val age: Int //must be overridden
    //default value allowed
    open val isEating = true //optional to be overridden
    val isRespire = true //can not be overridden
}

interface IWalk {
    //default value not allowed
    val numberOfLeg: Int //must be overridden
    fun walk() //must be overridden
}

interface IDrink {
}

class Camel : Animal(), IWalk, IDrink {
    override val age: Int = 7   // this property must exist, try to remove it
    override val isEating = true // this property optional, try to remove it
    override val numberOfLeg = 2 // this property must exist, try to remove it
    override fun walk() { // this method  must exist, try to remove it
        println("Camel can walk")
    }
}

fun main(){
    val camel = Camel()
    camel.walk()
    print(camel.isRespire) //this value cannot set with the new value
}