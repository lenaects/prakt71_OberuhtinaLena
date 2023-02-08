import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main()
{
    print("введите число x:")
    var x:Double = readLine()!!.toDouble()
    print("введите число y:")
    var y:Double = readLine()!!.toDouble()
    var otv=0.0
    otv=(sqrt(sin(x).pow(2))+ cos(y.pow(3)).pow(2))
    println(otv)
}