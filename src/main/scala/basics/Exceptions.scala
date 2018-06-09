package basics

object Exceptions extends App {
  val f = (x: Int) =>
    try {
      x match {
        case i if i < 0  => throw new RuntimeException("Too Negative")
        case i if i == 0 => println("PERFECT") // do nothing
        case _           => throw new IllegalStateException("Too Positive")
      }
    } catch {
      case ex: RuntimeException => println(s"caught a ${ex.toString}")
      case ex: Throwable        => println(s"unknown exception ${ex.toString}")
    } finally {
      println("This is a final block that always gets executed")
  }

  f(0)
  f(-5)
  f(1)
}
