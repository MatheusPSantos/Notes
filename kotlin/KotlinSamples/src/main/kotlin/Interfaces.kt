package br.com.matheuspsantos

class Interfaces {
}

interface ISomething {
    fun doThings()

    val name: String get() = "something"
    val age: Int
    val foo: String
}

class Concrete: ISomething {
    override val age: Int = 12
    override val foo: String = "abcq"
    override fun doThings() {}
}