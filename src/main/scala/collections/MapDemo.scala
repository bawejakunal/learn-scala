package collections

object MapDemo extends App {
  // declare map as a var because we may want to modify it later
  var numToString: Map[Int, String] = Map(1 -> "one", 2 -> "two")

  // fetch value two
  println(numToString(2))

  // get returns an optional value
  val optionalValue: Option[String] = numToString.get(1)
  println(optionalValue)

  // add operation generates a new copy of numToString with
  // (3 -> "three") key-value pair added
  val newMap = numToString + (3 -> "three")
  assert(numToString.size == 2)
  assert(newMap.size == 3)
  println(newMap(3))

  // concatenating two hashmaps
  val numbersToString = newMap ++ Map((4, "four"), (5, "five"))
  assert(numbersToString.size == 5)
  println(numbersToString(4))
}
