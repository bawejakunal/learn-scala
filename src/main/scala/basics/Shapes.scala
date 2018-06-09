package basics

abstract class Shape {
  def getArea(): Double // method signature, subclass should define
}

// implements [[getArea]] method from [[Shape]]
class Circle(r: Int) extends Shape {
  def getArea(): Double = 3.14 * r * r
}

object ShapeRunner extends App {
  val circle = new Circle(5)
  println(circle.getArea)
}
