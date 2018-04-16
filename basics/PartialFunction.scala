/**
 * Functions can be applied partially by using [_] wildcard
 */

def add(x: Int, y: Int) = x + y

val add2 = add(_: Int, 2)
println(add2(3))
