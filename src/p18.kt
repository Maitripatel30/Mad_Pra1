fun main(){
    val a1=arrayOf('a','b','c')
    println(a1.joinToString())
    val a= Array<Int>(5){0}
    val b=Array<Int>(10){i->i*2}
    println(a.joinToString(";"))
    println(b.joinToString(";"))
    b.shuffle()
    println(b.joinToString())
    b.sort()
    println(b.joinToString())
}