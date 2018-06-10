package basics

object Values extends App {
// a value is a final declaration i.e binding can not change
  val two = 1 + 1
  val three = two + 1
  println(two)
  println(s"${three}")
}
