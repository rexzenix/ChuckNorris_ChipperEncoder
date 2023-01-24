package chucknorris

fun main() {
    println("Input string:")
    val input = readLine()!!

    println("\nThe result:")
    for (c in input) {
        println("$c = " + String.format("%07d", Integer.toBinaryString(c.code).toInt()))
    }
}