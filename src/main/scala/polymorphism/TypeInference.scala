package polymorphism

object TypeInference extends App {

  println("======TypeInference Demo======")

  // generic identity method
  def id[T](x: T) = x

  // Int argument
  println(s"id(2) = ${id(2)}")

  // String argument
  val str = "id(\"yolo\")"
  val strEval = id("yolo")
  println(s"$str = $strEval")
}
