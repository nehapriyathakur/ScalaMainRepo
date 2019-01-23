val a = Array(12, 6, 15, 2, 20, 9)
a.reduceLeft(_ + _)
a.reduceRight(_ + _)

a.reduceLeft(_ * _)
a.reduceLeft(_ min _)
a.reduceLeft(_ max _)

val findMax = (x: Int, y: Int) => {
  val winner = x max y
  println(s"compared $x to $y, $winner was larger")
  winner
}

a.reduceLeft(findMax)


val peeps = Vector("al", "hannah", "emily", "christina", "aleka")
peeps.reduceLeft((x,y) => if (x.length > y.length) x else y)
peeps.reduceLeft((x,y) => if (x.length < y.length) x else y)

val aNew = Array(1, 2, 3)
aNew.reduceLeft(_ + _)
aNew.reduceRight(_ + _)
aNew.foldLeft(20)(_ + _)


/////////////////difference between reduceLeft and reduceRight//////////
val divide = (x: Double, y: Double) => {
  val result = x / y
  println(s"divided $x by $y to yield $result")
  result
}
val aDiv = Array(1.0, 2.0, 3.0)
aDiv.reduceLeft(divide)
aDiv.reduceRight(divide)

///////////Scan///////////////////
val product = (x: Int, y: Int) => {
  val result = x * y
  println(s"multiplied $x by $y to yield $result")
  result
}
val aProd = Array(1, 2, 3)
aProd.scanLeft(10)(product)
aProd.scanRight(10)(product)




