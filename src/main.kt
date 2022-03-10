fun main(){
statement()
    numbers(5,3)
    details("Sakina",21)
    sentence()
}

fun statement(){
    var stmt = "codeHive"
    var x = stmt[4].toString() +stmt[5]+stmt[6]+stmt[7]
    println(x)
}

fun numbers(num1:Int,num2:Int):Int{
var num = num1%num2
    println(num)
    return num
}

fun details(name:String,age:Int):String{
    var stmt="Hi, my name is $name and I am $age years old"
    println(stmt)
    return(stmt)
}

fun sentence(){
    var word = "animal"
    println(word.length)

}