package basics

trait Car{
    val brand: String
}

trait Shiny {
    val shineRefraction: Int
}

// extends trait Car and mixins trait Shiny
class BMW extends Car with Shiny {
    val brand = "BMW"
    val shineRefraction = 12
}

object Cars extends App {
    val bmwCar = new BMW()
    println(bmwCar.brand)
    println(bmwCar.shineRefraction)
}