package collections

object TupleDemo extends App {
    val hostPort: (String, Int) = ("localhost", 80)
    println(s"ADDR: ${hostPort._1}\tPORT: ${hostPort._2}")

    // another way to unpack
    val threeTuple: (String, String, Int) = ("Jon", "Doe", 21)
    val (firstName, lastName, age): (String, String, Int) = threeTuple
    println(s"First: $firstName\tLast: $lastName\tAge: $age")

    // case matching
    hostPort match {
        case ("host", port) => println("will not match")
        case (host, port) => println(s"Matched ${host} with port ${port}")
    }

    // special syntax for two tuples
    val twoTuple = "ZipCode" -> 12345
    println(s"1: ${twoTuple._1}\t2: ${twoTuple._2}")
}