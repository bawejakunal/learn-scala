package polymorphism

class Covariant[+A]

class Contravariant[-A]

class Invariant[A]

object Variance extends App {
  // this definition is possible
  val cov: Covariant[AnyRef] = new Covariant[String]
  //but not val cov: Covariant[String] = new Covariant[AnyRef]

  val contrav: Contravariant[String] = new Contravariant[AnyRef]
  // not val: Contravariant[AnyRef] = new Contravariant[String]
}
