package basics

object Main extends App {
    def addOne(m: Int): Int = m + 1
    println(addOne(2))

    // can leave of parenthesis if function
    // does not takes any arguments
    def takesNoArg(): Int = 3 + 7
    println(takesNoArg)
}