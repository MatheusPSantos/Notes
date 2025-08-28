package br.com.matheuspsantos

fun main(args: Array<String>) {
    var seq = arrayOf(-2, -1, 0, 1, 2)
    val (neg, others) = seq.partition{ it < 0}
    println(neg)
    println(others)
}