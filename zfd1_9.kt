import kotlin.math.pow

fun main()
{
    print("введите число a:")
    var a:Double = readLine()!!.toDouble()
    print("введите число b:")
    var b:Double = readLine()!!.toDouble()
    print("введите число c:")
    var c:Double = readLine()!!.toDouble()
    var p=0.0
    var p1=0.0
    p=(a+b+c)/3
    println("среднее арифметическое $p")
    p1=(a*b*c).pow(1/3)
    println("среднее геометричская $p1")

}