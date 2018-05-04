package basics

/**
 * In scala functions are objects which are extended from FunctionX
 * where X is [0, 22]. Thus we have Function1 to Function22 in scala.
 *
 * Hence each function needs to define the apply method, which is
 * defined in the traits Function0 to Function22
 */

object addOne extends Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
}

// A nice short-hand for extends Function1[Int, Int] is extends (Int => Int)
object subOne extends (Int => Int) {
    def apply(x: Int): Int = x - 1
}

/// short-hand for extends Function2[Int, Int, Int] is extends ((Int, Int) => Int)
class Multiply extends ((Int, Int) => Int) {
    def apply(x: Int, y: Int): Int = x * y
}


object Functions extends App {
    val x = 3
    val y = addOne(x)
    println(s"3 + 1 = $y")

    val z = subOne(x)
    println(s"3 - 1 = $z")

    // create new object
    val mutiplyObject = new Multiply
    val r = mutiplyObject(x, 5) // call apply method
    println(s"$x * 5 = $r")
}