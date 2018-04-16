/**
 * accepts a variable number of string arguments
 */
def toUpperCase(args: String*) = {
    args.map(arg => arg.toUpperCase)
}

toUpperCase("hello", "world").map(x => println(x))
