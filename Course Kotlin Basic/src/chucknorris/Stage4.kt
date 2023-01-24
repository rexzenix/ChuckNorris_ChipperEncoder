package chucknorris

fun main() {
    println("Input string:")
    val s = readln().trim().split(" ")
    println("The result:")
    var decodedString: String = ""
    for (i in s.indices step 2) {
        val currentKey: String
        currentKey = if (s[i] == "0") "1" else "0"
        decodedString += "${currentKey.repeat(s[i+1].length)}"
    }

    var result: String = ""
    for (w in decodedString.indices step 7) {
        result += (decodedString.substring(w, w + 7).toInt(2)).toChar()
    }
    println(result)
}