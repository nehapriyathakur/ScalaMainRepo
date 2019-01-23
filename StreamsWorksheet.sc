List(1,2,3,4,5).foreach(_ => println("hello"))

List(1,2,3,4,5).map(_ => println("hello"))

List(1,2,3,4,5).map(_ => println("hello")).take(3)

List(1,2,3,4,5).toStream.map(_ => println("hello")).take(3)

List(1,2,3,4,5).toStream.map(_ => println("hello")).take(3).take(2).take(1)

List(() => println("1"), () => println("2"), () => println("3"))

List(() => println("1"), () => println("2"), () => println("3")).map(_())

List(() => println("1"), () => println("2"), () => println("3")).map(_()).take(1)

List(() => println("1"), () => println("2"), () => println("3")).toStream.map(_()).take(1)

val aStream = Stream(1,2,3,4,55,6)

val stream = (1 to 100000000).toStream
stream.head
stream.tail

stream.take(3)
stream.filter(_ < 200)
stream.filter(_ > 200)
stream.map { _ * 2 }

Stream.apply(1,2,3,4,5).map(_=>println("Hello")).take(2)


//I had attempted to use a List in these examples, I would have encountered a java.lang.OutOfMemory error as soon as I attempted to create the List:

val list = (1 to 100000000).toStream
//Using a Stream gives you a chance to specify a huge list, and begin working with its elements:

list(0)  // returns 1
list(1)  // returns 2
// ...
list(10)  // returns 11

Stream.cons
Stream.continually(5).take(3)

Stream.concat(List(1,2,3),List(1,2,3,4,5),List(4,5,6))

Stream.range(1,100,3).length


Stream(1 to 1000000000).length


import scala.math.BigInt
lazy val fibs: Stream[BigInt] =
  BigInt(0) #::
    BigInt(1) #::
    fibs.zip(fibs.tail).map(n => {
      println("Evaluating: %s -> %s".format(n._1, n._2))
      n._1 + n._2
    })

//Vectors
val vector = Vector(1,2,3)
println(vector)
vector :+ 4
4 +: vector
vector(2)
vector.isDefinedAt(5)
vector.updated(2,10)
println(vector)

val vector1=vector.updated(2,10)
println(vector1)


