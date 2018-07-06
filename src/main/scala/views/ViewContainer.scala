package views

import views.ImplicitConversion._

object ImplicitConversion {
  implicit def strToInt(x: String) = x.toInt
}

// type A can be viewed as an Int
class ViewContainer[A <% Int] {
  // x and y are converted to integer implicitly if required
  def add(x: Int, y: A): Int = x + y
}

object ViewContainerApp extends App {

  // specify type variable
  val container = new ViewContainer[String]

  val expected = 579

  // argument x is type casted to Int by implicit type conversion
  val ans1 = container.add("123", "456")

  // String is viewed as Int due to the implicit conversion provided and hence addition is possible
  val ans2 = container.add(123, "456")

  println(ans1)
  println(ans2)

  assert(ans1 == expected)
  assert(ans2 == expected)
}
