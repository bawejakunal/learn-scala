package collections

object OptionDemo extends App {
    val numMap = Map((1, "one"), (2, "two"))

    val stringOption: Option[String] = numMap.get(2)
    stringOption match {
        case Some(translation) => println(translation)
        case None => println("undefined")
    }

    val notExistOption: Option[String] = numMap.get(-1)
    println(notExistOption.getOrElse("undefined"))
}