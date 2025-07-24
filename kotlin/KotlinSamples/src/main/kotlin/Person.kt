package br.com.matheuspsantos

import kotlin.properties.Delegates

class Person {
    var name: String = ""
    var age: Int = -1

    val canvote: Boolean
        get() = age >= 16

    var ssn = "000001"
        get() = field
        set(value) {
            println("${name}'s SSN changed from ${field} to ${value}")
            field = value
        }
}