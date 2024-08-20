val isNegativeOrZero = (x: Int) => x <= 0
val isEven = (x: Int) => x % 2 == 0
val isOdd = (x: Int) => x % 2 == 1 || x % 2 == -1

@main def q2(): Unit = {
  print("Enter a number: ")
  scala.io.StdIn.readInt() match {
    case x if isNegativeOrZero(x) => println("The number is negative or zero.")
    case x if isEven(x) => println("The number is even.")
    case x if isOdd(x) => println("The number is odd.")
  }
}