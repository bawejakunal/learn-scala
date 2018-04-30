package basics

/**
 * Class with no parameters
 */

class Calculator {
  val brand = "HP"
  def add(x: Int, y: Int): Int = x + y
}

class BrandedCalculator(brand: String) {
    // everything defined outside a method in a class
    // definition is considered as constructor
    val color: String = brand match {
        case "TI" => "blue"
        case "HP" => "black"
        case _ => "white"
    }

    def multiply(x: Int, y: Int): Int = x * y
}

object Main{
    def main(args: Array[String]) {
        val calc = new Calculator
        println(calc.add(1, 2))

        val brandedCalc = new BrandedCalculator("TI")
        println(brandedCalc.color)
        println(brandedCalc.multiply(5, 6))
    }
}
