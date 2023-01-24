package chucknorris

fun main() {
    // write your code here
    val shape = readln()

    when (shape) {
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val square: Double = a * b
            print(square)
        }
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val p = 0.5 * (a + b + c)
            val triangle: Double  = kotlin.math.sqrt(p * (p - a) * (p - b) * (p - c))
            print(triangle)
        }
        "circle" -> {
            val r = readln().toDouble()
            val circle: Double = 3.14 * r * r
            print(circle)
        }
        else -> print("wrong input")
    }
}
