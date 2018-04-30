package basics

/**
 * All about apply() method in objects and classes
 */

 class Foo {
    // empty class definition
 }

 object FooFactory {
    // one of the general uses of singleton objects
    // is using these are factory objects
    def apply(): Foo = new Foo
 }

class Bar {
    def apply() = println("Class definition can have an apply method too\n" +
        "which gets executed as apply call of instantiated objects")
}

 object Main extends App {
    // call to apply returns an object of class Foo
    val fooObject = FooFactory() 
    if (fooObject.isInstanceOf[Foo]) println("%s is instance of Foo\n".format(fooObject.toString))
    else throw new Exception("Something is wrong")

    val bar = new Bar   // create an object of Bar
    bar()               // call to apply method
 }