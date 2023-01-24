package chucknorris

// two consecutive blocks = one digit
// first block 0 = 1, 00 = 0
// second block = number of 0 here is number of bits in series


fun main() {
    println("Input string:")
    val input = readln()
    print("$input")
    println("The result:")


    var r = ""

    for (i in input){
        var l = Integer.toBinaryString(i.code)
        if(l.length == 6) l = "0" + l
        r += l
    }


    var curr = r[0]
    if(curr == '0') print("00 ")
    else print("0 ")
    for(i in r){
        if(i == curr) print('0')
        else{
            print(" ")
            if(i == '1') print("0 ")
            if(i == '0') print("00 ")
            print('0')
            curr = i
        }
    }
}