package br.com.matheuspsantos

class Average {
    public operator fun invoke(vararg values: Double): Double {
        var sum = 0.0
        for (x in values)
            sum += x
        return sum / values.size
    }
}

fun main() {
    val increaseBy = fun Int.(value: Int) = this + value
    var x = 1
    println("$x + 3 = ${x.increaseBy(3)}")

    val a = Average()
    val avg = a(1.0, 2.0, 3.0, 4.0)
    println(avg)
//      NAO FUNCIONOU
//    fun String.invoke(): String {
//        return "(" + this + ")"
//    }
//
//    val two = "two"
//    println("I have 2 ${two()}")

    val me = Person()
    me.name = "Jhon doe"
    me.age = 22

    println("${me.name} can${if (!me.canvote) "not" else ""} vote")

    me.ssn = "123456"

    extension_functions()

    val s: String? = null
    s.print()
    println(s.empty)
    val s1: String = ""
    println(s1.empty)
    val s2: String = "jhon"
    println(s2.empty)

    var h = Human("Jesus", 22)
    println("my name is ${h.name} and I am ${h.age} years old")
}