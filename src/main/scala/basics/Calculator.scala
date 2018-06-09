package basics

/**
  * Case classes have equality, get and toString
  * methods predefined
  */
case class ExpensiveCalculator(brand: String, model: String)

object CalculatorIdentifier {
  def main(args: Array[String]) {
    val calculator = ExpensiveCalculator("HP", "20B")
    println(s"get brand: ${calculator.brand}")
    println(s"get model: ${calculator.model}")

    val category = calculator match {
      case ExpensiveCalculator("TI", "30X") => "scientific"
      case ExpensiveCalculator("HP", "40C") => "industrial"
      case c @ ExpensiveCalculator(_, _) =>
        "unknown type %s".format(c) // calls toString
    }
    println(category)
  }
}
