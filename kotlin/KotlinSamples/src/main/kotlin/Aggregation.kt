package br.com.matheuspsantos

fun main(args: Array<String>) {
    val numbers = generateSequence(1, { it + 1 })
        .take(10).toList()

    println(numbers)
    println(numbers.joinToString("->"))
    println("sum (reduce) = ${numbers.reduce { x, y -> x + y }}")
    println(
        "\nproduct (reduce) = ${
        numbers.reduceRight
        { x, p ->
            print("($x * $p)")
            x * p
        }
    }"
    )

    println("sum (fold) = ${numbers.fold(0, {x,y -> x+y})}")
    println("product (fold) = ${numbers.fold(1, {x,y -> x*y})}")
}