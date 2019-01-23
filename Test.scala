class Testing {
  type B >: List[Int]
  def foo(a:B)=a

  val x = new Testing{type B=Traversable[Int]}
  def test[T](x:List[T]) = ???

  def foo(x : List[_ >: Int]) = x
  foo(List("Hi"))

  val y: List[_] = List()
  y(2)
}

class Box[+A] {
  //def set(x : A) : Box[A]
}