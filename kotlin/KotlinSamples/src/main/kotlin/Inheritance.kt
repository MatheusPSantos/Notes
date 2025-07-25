package br.com.matheuspsantos

class Inheritance {

}

open class PersonV2(var name: String) {
    open fun talk() {
        println("Hi, I'm $name")
    }
}

class Manager(name: String, var subordinates: List<PersonV2>) : PersonV2(name) {
    override fun talk() {
        println("I'm $name and I have ${subordinates.size} subordinates")
    }
}