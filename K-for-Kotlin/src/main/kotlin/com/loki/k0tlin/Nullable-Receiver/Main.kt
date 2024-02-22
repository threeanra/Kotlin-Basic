package com.loki.k0tlin.`Nullable-Receiver`

fun main() {
    val value: Int? = 10
    val value1: Int? = null

    //null
    println(value?.slice)
    println(value1?.slice)

    //this is when the property has value
    println(value.slice)
    println(value1.slice)
}

val Int.slice: Int
    get() = this.div(2)

//set value to 0, if null (elvis operator)
val Int?.slice: Int
    get() = this?.div(2) ?: 0