def toUpper(text: String): String = {
  text.toUpperCase
}

def toLower(text: String): String = {
  text.toLowerCase
}

def formatNames(name: String, y: Int): String = {
  y match {
    case 1 => toUpper(name) 
    case 2 => toUpper(name.substring(0, 2)) + name.substring(2) 
    case 3 => toLower(name) 
    case 4 => toUpper(name.head.toString()) + name.substring(1, name.length - 1) + toUpper(name.last.toString()) 
    case _ => name 
  }
}

@main def q3(): Unit = {
  println(formatNames("benny", 1))
  println(formatNames("niroshan", 2))
  println(formatNames("saman", 3))
  println(formatNames("kumara", 4))
}