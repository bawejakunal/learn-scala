package collections

object ArraysDemo extends App {

    val numbers: Array[Int] = Array(1,2,3,4,5,6,7,8,9,10)
    val idx: Int = 3

    println(s"Array.length: ${numbers.length}")
    println(s"Index ${idx}: ${numbers(idx)}")

    println("Arrays are mutable")
    numbers(idx) = 0 - numbers(idx)
    println(s"Index ${idx}: ${numbers(idx)}")    
}