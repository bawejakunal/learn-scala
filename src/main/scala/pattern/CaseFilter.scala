package pattern

object CasePattern extends App {
  val extensions: Map[String, Int] = Map(("steve", 100), ("robey", 200))

  val filteredExtensions: Map[String, Int] = extensions.filter {
    case (_, extension) => extension < 200
  }
  filteredExtensions.foreach(filteredExtension => println(filteredExtension))
}
