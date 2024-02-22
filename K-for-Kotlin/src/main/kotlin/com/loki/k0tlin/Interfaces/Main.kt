package com.loki.k0tlin.Interfaces

interface IFly {
    fun fly()
    val numberOfWings: Int
}

//override property/variable in constructor (in this case in inside params)
class Bird(override val numberOfWings: Int) : IFly {

    //we need use override to implemented interface, also the property inside the interface too
    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}

fun main(){
    val bird = Bird(2)
    bird.fly()
}