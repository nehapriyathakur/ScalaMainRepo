object Monad extends App {
  def monad[X, Y](f: X => List[Y]): List[X] => List[Y] = {
    def fun : (List[X]) => List[Y] = (arg: List[X]) => arg match { // 1
      case Nil => Nil
      case x :: xs => f(x) ::: fun(xs) // 2
    }
    fun
  }
  def f1(n: Int) = (1 to n).toList // 3
  val f = monad(f1) // 4
  println(f(List(7,8,9)))  // 5
}

