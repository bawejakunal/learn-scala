// assign an anonymous function to a val
val add = (x: Int, y: Int) => x + y

println(add(2, 3))

val addThree = {(x: Int, y: Int, z: Int) =>
    val total = x + y + z
    println(s"$x + $y + $z = $total")
    total
}

println(addThree(1,2,3))
