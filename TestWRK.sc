import cats.kernel.Monoid
import scala.language.higherKinds


import scala.math.Ordered._
case class Money(amount: Int)
val contramapFn: Money => Int = (money) => money.amount
implicit val moneyOrd: Ordering[Money] = Ordering.by(contramapFn)

Money(13) < Money(20)

import cats.implicits._

(1 to 10).fold(0)(_ + _)
(1 to 10).toList.combineAll

(1 to 10).fold(Monoid[Int].empty)((a,b) => a.combine(b))

Monoid[Int].empty

import monix.eval.Coeval

val coeval = Coeval.now { println("Effect"); "Hello!" }
coeval.value


val coeval1 = Coeval.eval { println("Effect"); "Hello!" }
// coeval: monix.eval.Coeval[String] = Once(<function0>)

coeval1.value



