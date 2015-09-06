val xs = Array(1,2,3,44);

xs map (x => x * 2)

val s = "Hello World"

s filter (c => c.isUpper)

val r: Range = 1 until 5
val r1:Range = 1 to 5
1 to 10 by 3
6 to 1 by -2


val M = 5;
val N = 5;

(1 to M) flatMap (x => (1 to N) map ( y => (x,y)))


def scalarProduct(xs: Vector[Double], ys: Vector[Double]):Double = {
  (xs zip ys).map(xy => xy._1 * xy._2).sum
}


def isPrime(n: Int):Boolean = {
  (2 until n) forall ( x => n % x != 0)
}

isPrime(11)