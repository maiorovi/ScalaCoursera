def msort[T](xs:List[T])(implicit ord:Ordering[T]):List[T] = {
  val n = xs.length / 2;
  if (n == 0) xs
  else {
    val (one, two) = xs splitAt n
    def merge(xs:List[T], ys:List[T]):List[T] =
      (xs,ys) match {
        case (Nil,ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) =>
          if (ord.lt(x,y)) x::merge(xs1, ys)
          else y::merge(xs, ys1)
      }
    merge(msort(one), msort(two))
  }
}
val testList = List(6,5,4,-2,3,2,1,-5);
println(msort(testList))