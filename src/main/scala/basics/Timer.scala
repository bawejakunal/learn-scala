package basics

// an object holding single instance of an unnamed class
// consider this like an object of singleton class
object Timer {
    var count: Long = 0

    def currentCount(): Long = {
        count += 1
        count   // return updated count
    }
}

object TimerRunner extends App {
    for {_ <- 1 to 10} {
        val x = Timer.currentCount() // increment counter
        println(s"counter = $x")
    }
}