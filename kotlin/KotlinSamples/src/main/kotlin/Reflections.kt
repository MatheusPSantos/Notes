package br.com.matheuspsantos

import kotlin.reflect.KClass

data class PersonData(var name:String, var age:Int)
open class Base(x:Int)
class Derived(x:Int) : Base(x)

fun process(b:Base) {
    if (b is Derived) {
        println(b::class.qualifiedName)
    }
}

fun isOdd(x:Int) = x%2 != 0

fun main(args: Array<String>) {

    val c: KClass<PersonData> = PersonData::class

    println(c.qualifiedName)
    println(c.members.map{it.name})

    var j:KClass<PersonData> = c.java

    println(j.simpleName)

    var numbers = generateSequence(1, {it + 1}).take(5)
    println(numbers.filter{ isOdd(it) }.toList())

    println(numbers.filter(::isOdd).toList())
}