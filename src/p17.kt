fun main(){
    var a=readln().toInt()
    println("Factorial of $a is: ${factorial(a)}")
}
fun factorial(n: Int): Int {
    if(n==0) return 1
    return n*factorial(n-1)
}