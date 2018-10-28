package polymorphism

object ParametricPolymorphism extends App {
  val list = List(1, 2, 3, 4, 5)
  println(list)

  def dropHead[A](list: List[A]) = list.tail
  println(dropHead(list))
}
