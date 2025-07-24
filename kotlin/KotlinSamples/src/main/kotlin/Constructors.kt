package br.com.matheuspsantos

data class Human(val name: String, val age: Int) {
    init {
        println("Human inited with $name and $age")
    }
}