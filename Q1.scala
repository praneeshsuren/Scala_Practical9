val interestPerYear = (n : Int) => {
  if(n>=2000000){
    n*0.065
  }
  else if(n>=200000){
    n*0.035
  }
  else if(n>=20000){
    n*0.04
  }
  else{
    n*0.02
  }
}

@main def q1() = {
  print("Enter the amount: ")
  val n = scala.io.StdIn.readInt()
  if(n<0){
    println("Invalid amount")
  }
  else{
    println("Interest per year: " + interestPerYear(n))
  }
}