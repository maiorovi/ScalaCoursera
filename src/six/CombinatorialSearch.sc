val n = 7;
val xss = ((1 until n) map ( x => (1 until x) map (y => (x,y)))).flatten
xss.filter(xy => isPrime(xy._1 + xy._2) )

def isPrime(n: Int):Boolean = {
  (2 until n) forall ( x => n % x != 0)
}


def scalarProduct(xs: List[Double], ys:List[Double]):Double = {
  (for {
    i <- 0 until xs.length
    j <- 0 until ys.length
    if (i == j)
  } yield xs(i) * ys(j)).sum
}

def scalarProduct1(xs: List[Double], ys:List[Double]):Double = {
  (for ((fst, snd) <- (xs zip ys))
    yield fst * snd).sum
}

val l1 = List(1.0,2.0,3.0,4.0)
val l2 = List(5.0,6.0,7.0,8.0)

scalarProduct(l1, l2)
scalarProduct1(l1, l2)