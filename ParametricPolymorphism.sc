///////////////classical example of parametric polymorphism and implicits:end///////////////

/*def combine(x: String, y: String): String = x + y
def combine[A](x: A, y: A): A = ???*/
trait Adder[A] {
  def add(x: A, y: A): A
  }

case class Student(name:String)
implicit object IntAdder extends Adder[Int] {
  override def add(x: Int, y: Int)= x + y
}

implicit object StringAdder extends Adder[String] {
  override def add(x: String, y: String)= x + y
}

def combine[A](x: A, y: A)(implicit adder: Adder[A]): A =
  adder.add(x, y)

combine(1, 2)
combine("abc", "xyz")

///////////////classical example of parametric polymorphism and implicits:end///////////////

val test :String ="khhkhuk"
val names : List[String] = List( "Anne", "George", "Carla" )
val primes : List[Int] = List( 11, 17, 19 )
//val things : List = List( "Anne", 17, true )

val empty = ( xs :List[_] ) => xs == Nil



//val empty : List[_] => Boolean  =  ( xs :List[_] ) => xs == Nil
//val empty = ( xs :List[_] ) => xs == Nil
empty( Nil )           // true
empty( names )         // false
empty( primes )        // false

val first :Tuple2[_,_] =>
  _ = {
  ( pair :Tuple2[_,_] ) => pair._1
}
val person = ( "Anne", 27 )
val name = first( person )





