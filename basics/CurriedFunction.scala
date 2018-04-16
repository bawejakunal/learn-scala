def multiply(m: Int)(n: Int):Int = m * n
println(multiply(2)(3))

val timesTwo = multiply(2)_
println(timesTwo(2))

def add(x: Int, y: Int, z: Int): Int = x + y + z
val curriedAdd = (add _).curried
val add3 = curriedAdd(3)
val add7 = add3(4)
println(add7(10))

