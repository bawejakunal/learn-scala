package polymorphism

abstract class Animal {
  def sound: String
}

class Bird extends Animal {
  val sound: String = "tweet"
}

class Chicken extends Bird {
  override val sound: String = "cluck"
}

object InheritanceVariance extends App {

  // trait Function1 [-T1, +R] extends AnyRef
  // This works because function parameters are Contravariant
  val getTweet: (Bird => String) = (a: Animal) => a.sound
  println(getTweet(new Chicken))

  val hatch: (() => Bird) = () => new Chicken

  // Function return type are covariant
  val offspring: Bird = hatch()
  assert(offspring.isInstanceOf[Chicken])
  assert(offspring.sound == "cluck")
}
