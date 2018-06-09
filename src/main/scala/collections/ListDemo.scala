package collections

object ListDemo extends App {

  val numbers: List[Int] = List(1, 2, 3, 4, 2, 1, 3)
  val idx: Int = 3

  // List are immutable hence throws a compile time error
  // numbers(idx) = 0 - numbers(idx)
}
