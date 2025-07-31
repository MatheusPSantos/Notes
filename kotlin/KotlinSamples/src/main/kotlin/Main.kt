package br.com.matheuspsantos

import kotlin.reflect.KProperty

class Average {
    public operator fun invoke(vararg values: Double): Double {
        var sum = 0.0
        for (x in values)
            sum += x
        return sum / values.size
    }
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${thisRef}, thank you for delegating ''${property.name} to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
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

    var h2 = Human("Jesus", 22)
    println("my name is ${h.name} and I am ${h.age} years old")

    var h3 = h.copy() // so pode usar .copy pois Human é data class
    println(h == h3)

    var p = Person()
    p.name = "Mary"
    val _s = p.name

    // var pf = PointFactory() // --> sendo uma class e nao um object
    // var point = pf.NewPolarPoint(3.0, Math.PI / 2)

    var point = PointFactory.NewPolarPoint(3.9, Math.PI/2) // PointFactory definida como object -> vira singleton
    println(point.toString())

    var simplePoint = PointV2(1.0, 2.0)
    //var factoryPoint = PointV2.Factory.createPolar(3.0, Math.PI/2)
    var factoryPointV2 = PointV2.createPolar(3.0, Math.PI/2)

    var create = PointV2.Companion.create()

    var john = PersonV2("John")
    john.talk()

    var boos = Manager("Alfred", listOf(john))
    boos.talk()


    var c:ISomething = Concrete()
    c.doThings()
    println(c.name)

    val mfd = MultiFunctionDevice()
    mfd.print()
    mfd.scan()

    val gen = generateSequence(1, { it + 2})
    val numbers = gen.take(10)
    println(numbers.toList())

    // quantifiers
    val numbers1: Sequence<Int> = arrayOf(1,2,3,4,5, -9).asSequence()

    println("all numbers > 0? ${numbers1.all{ it > 0}}")
    println("all numbers are odd? ${numbers.all{it%2 == 1}}")
    println("cotains number 5? ${numbers.contains(5)}")
    println("total number of elements ${numbers.count()}")
    println("total number of elements greater than 3 ${numbers.count { it > 3 }}")

    val seq = generateSequence(1, {it + 1})
    val numbers2: Sequence<Int> = seq.take(4)
    val squares = numbers2.map { it * it}
    println(numbers2.toList())
    println(squares.toList())

    val sentences = "This is a nice setence"
    val wordsLengths = sentences.split(' ').map{ it.length }
    println(sentences)
    println(wordsLengths)

    val wordsLengths2 = sentences.split(' ').map{
        object {
            val length = it.length
            val value = it
        }
    }

    for (wl in wordsLengths2) {
        println("'${wl.value}' has length ${wl.length}")
    }

    val wordLengthsPairs = sentences.split(' ')
        .associate { it.to(it.length)}
    for (wl in wordLengthsPairs) {
        println(wl)
    }
}
