fun main(){
    val a1=arrayOf(10,5,23,2,12)
    var max=a1[0]

    for(a in a1){
        if(a > max)
            max=a
    }
    println(max)
}
