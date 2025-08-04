fun main() {
    print("Enter the Number: ")
    val num = readLine()!!.toInt()
    println(if (num % 2 == 0) "$num is Even" else "$num is Odd")
}
