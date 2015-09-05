def msort(xs:List[Int]):List[Int] = {
  val n = xs.length / 2;
  if (n == 0) xs
  else {
    val (one, two) = xs splitAt n
    def merge(xs1:List[Int], xs2:List[Int]) = ???
    merge(msort(one), msort(two))
  }
}