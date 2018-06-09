package collections

object FunctionalCombinators extends App {
  def squared(x: Int): Int = x * x

  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  // map accepts a function with single argument and applies
  // to all elements in a list. It returns a new list containing
  // the results of function applied to individual list elements
  val squaredNumbers = numbers.map(squared)
  println(squaredNumbers)

  // foreach is similar to map, but it returns a unit ()
  // it is meant for applying functions with side
  // effects, because the return is always unit()
  val printNumbers = numbers.foreach { (x: Int) =>
    println(x)
  }

  // filter accepts a function with 1 arg of type list elements
  // and whose return type is a boolean. Applying a filter method
  // returns a list containing elements which return true
  // for the provided function
  val evenNumbers = numbers.filter((x: Int) => (x & 1) == 0)
  println(evenNumbers)

  // zip aggregates the contents of two lists into a single list of pairs
  val zippedPair = numbers.zip(
    List("one",
         "two",
         "three",
         "four",
         "five",
         "six",
         "seven",
         "eight",
         "nine",
         "ten"))
  for ((num, str) <- zippedPair) {
    println(num, str) // same as foreach
  }

  // find accepts a predicate function and returns the first element
  // satisfying the predicate, wrapped in an Option
  println(numbers.find((i: Int) => i > 8))
  println(numbers.find((i: Int) => i > 80))

  // take accepts an int x as argument and returns first x elements
  println(numbers.take(3)) // exactly 3
  println(numbers.take(100)) // <= 100

  // takeWhile accepts a predicate function and returns the elements
  // until predicate fails
  println(numbers.takeWhile((x: Int) => x <= 5))
  println(numbers.takeWhile((x: Int) => (x & 1) == 0))

  // drop and dropWhile are exact opposite of take and takeWhile
  // respectively
  println(numbers.drop(5))

  // drop leading odd numbers
  println(numbers.dropWhile((x: Int) => (x & 1) == 1))

  // foldLeft goes aggregating values from left to right
  println(numbers.foldLeft(0) { (left: Int, right: Int) =>
    println(s"left: $left   right: $right")
    left + right
  })

  // foldRight goes aggregating values from right to left
  println(numbers.foldRight(0) { (left: Int, right: Int) =>
    println(s"left: $left   right: $right")
    left + right
  })

  // flatten collapses the outer most level of nested list
  val nestedList = List(List(5, 6, 7), List(8, 9, 10))
  println(nestedList.flatten)

  // flatMap takes a function that works on the nested lists and then
  // concatenates the results back together.
  println(nestedList.flatMap((l: List[Int]) => l.map(_ * 2)))

  // flatMap is same as .map().flatten
  println(nestedList.map((l: List[Int]) => l.map(_ * -1)).flatten)
}
