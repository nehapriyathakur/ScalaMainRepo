case class Company(name: String, value: Int)
import cats.kernel.Monoid

object Company extends App {
  implicit val CompanyMergeMonoid = new Monoid[Company] {
    def empty = Company("", 0)
    def combine(t1: Company, t2: Company) =
      Company(t1.name + t2.name, t1.value + t2.value)
  }

  implicit val EliminateCompetitorsMonoid = new Monoid[Company] {
    def empty = Company("", 0)
    def combine(t1: Company, t2: Company) = Set(t1, t2) maxBy (_.value)
  }

  import Monoid._
  import Company._

  val c1 = Company("A", 10)
  val c2 = Company("B", 20)
  val c3 = Company("C", 30)
  val c4 = Company("D", 40)

  val cs = List(c1, c2, c3, c4)

  val res1 = combineAll(cs)(CompanyMergeMonoid)
  val res2 = combineAll(cs)(EliminateCompetitorsMonoid)

  println(res1)
  // Company(ABCD,100)

  println(res2)
  // Company(D,40)
}