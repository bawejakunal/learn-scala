package basics

object Main extends App {
    // simple case matching
    val times = 1
    val numberStr = times match {
        case 1 => "one"
        case 2 => "two"
        case _ => "unknown number"
    }
    println(numberStr)
    assert(numberStr equals "one")

    // case matching on type
    def typeMatch(arg: Any): String = arg match {
        case i: Int => "Int"
        case i: Long => "Long"
        case i: Double => "Double"
        case _ => "unknown type"
    }
    val number = 1.0
    val typeStr = typeMatch(number)
    println(typeStr)
    assert(typeStr equals "Double")

    // case matching with guards
    val num = 0.0
    val categoryStr: String = num match {
        case i if i < 0 => "negative"
        case i if i > 0 => "postive"
        case _ => "zero" 
    }
    println(categoryStr)
    assert(categoryStr equals "zero")
}