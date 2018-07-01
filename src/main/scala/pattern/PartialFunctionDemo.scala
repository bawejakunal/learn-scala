package pattern

object PartialFunctionDemo extends App {
  val one: PartialFunction[Int, String] = { case 1 => "one" }
  println(s"one.isDefinedAt(1) = ${one.isDefinedAt(1)}")
  println(s"one.isDefinedAt(2) = ${one.isDefinedAt(2)}")

  val two: PartialFunction[Int, String] = { case 2      => "two" }
  val three: PartialFunction[Int, String] = { case 3    => "three" }
  val wildcard: PartialFunction[Int, String] = { case _ => "something else" }

  val partial = one.orElse(two).orElse(three).orElse(wildcard)

  println(partial(5))
  println(partial(3))
  println(partial(2))
  println(partial(1))

  /**
    * Order of [[PartialFunction]] composition matters. In the example below, [[wildcard]] is the
    * first function in order of composition and hence all inputs match the wildcard case statement
    * thus rendering rest of the functions as unreachable code.
    */
  val reversePartial = wildcard.orElse(three).orElse(two).orElse(one)

  println(reversePartial(1))
  println(reversePartial(2))
  println(reversePartial(3))
  println(reversePartial(5))
}
