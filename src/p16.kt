fun main(){
    var a=readln().toInt()
    var b=readln().toInt()
    println(add(a,b))
    println(sub(a,b))
    println(multi(a,b))
    println(divide(a,b))
}
fun add(a:Int,b:Int):Int{
    return a+b
}
fun sub(a:Int,b:Int):Int{
    return a-b
}
fun multi(a:Int,b:Int):Int{
    return a*b
}
fun divide(a:Int,b:Int):Int{
    return a/b
}