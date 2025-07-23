package br.com.matheuspsantos

fun <T> ArrayList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun extension_functions() {
    val mylist = arrayListOf(
        1, 2, 3
    )
    mylist.swap(0, 2)
    println(mylist)
    mylist.print()
}

fun Any?.print() {
    if (this == null) println("object is null")
    else println("object is ${this.toString()}")
}

val String?.empty: Boolean
    get() = (this == null || this.length == 0)