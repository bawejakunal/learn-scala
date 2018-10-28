package polymorphism

import polymorphism.{Animal, Bird, Chicken}

class Dog extends Animal {
  val sound: String = "bark"
}

object VarianceBounds extends App {
  // restrict polymorphic variable T to subclasses of Animal i.e upper bound
  def biophony[T <: Bird](birds: Seq[T]) = birds.map(_.sound)

  // fails because of found Seq[Animal]; required Seq[T]
  // val birdSounds = biophony(Seq(new Bird, new Chicken, new Dog))
  val birdSounds = biophony(Seq(new Bird, new Chicken))
  birdSounds.foreach(println)

  def getSimpleClassName[T >: Dog](dogs: Seq[T]) =
    dogs.map(_.getClass.getSimpleName)

  // works because all objects are of T superclass of Dog
  val classNames = getSimpleClassName(Seq(new Dog, new Bird))
  classNames.foreach(println)
}
