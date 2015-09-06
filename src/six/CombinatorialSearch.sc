val n = 7;
val xss = ((1 until n) map ( x => (1 until x) map (y => (x,y)))).flatten
xss.filter(xy => isPrime(xy._1 + xy._2) )

def isPrime(n: Int):Boolean = {
  (2 until n) forall ( x => n % x != 0)
}
