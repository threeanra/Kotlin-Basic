package com.loki.k0tlin.Extensions

fun Int.printInt() : Int {
    println("Value $this")
    return this
}

//this is from dicoding, but in the terminal will show the kotlin.unit becuz didn't have return type
//fun Int.printInt() {
//    println("Value $this")
//}

///Coba-coba
fun printUser(name: String) : String {
    return name
}
fun Int.plusThree(): Int {
    return this + 3
}

//coba-coba
fun sayNumber() : Double {
    return Math.random()
}

fun awawaw(nomor: Int, nama: String) : Int {
    println("Nama $nama nomor $nomor")
    return nomor
}

fun main(){
    10.printInt()
    println("Value ${10.plusThree()}")
    println("Nama kamu adalah ${printUser("asep")}")
    println("my number is ${sayNumber()}")
    awawaw(10, "auauauau")
}

