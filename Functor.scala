object Functor extends App {

  def functor[X, Y](f: X => Y): List[X] => List[Y] = { // 1
    def fun : (List[X]) => List[Y] = (arg: List[X]) => arg match {
      case Nil => Nil
      case x :: xs => f(x) :: fun(xs)
    }
    fun
  }

  val p = List("Hi", "there")

  def doubleEachChar(s: String) = (for (c <- s) // 2
    yield c + "" + c).toList.mkString

  def numberOfLowerCaseChars(s: String) = s.filter(c => c.isLower).length // 3

  val f1 = functor(doubleEachChar) // 4
  val f2 = functor(numberOfLowerCaseChars) // 5

  println(f1(p)) // 6
  println(f2(p)) // 7
}

