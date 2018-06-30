package pattern

object Compose extends App {
  def f(s: String) = s"f(${s})"
  def g(s: String) = s"g(${s})"

  val fComposeG = f _ compose g _
  val fAndThenG = (f _).andThen(g)

  val input = "X"

  println(s"fComposeG($input) = ${fComposeG(input)}")
  println(s"fAndThenG($input) = ${fAndThenG(input)}")
}
