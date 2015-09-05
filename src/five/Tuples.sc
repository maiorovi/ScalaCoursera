def msort[T](xs:List[T])(lt: (T,T) => Boolean):List[T] = {
  val n = xs.length / 2;
  if (n == 0) xs
  else {
    val (one, two) = xs splitAt n
    def merge(xs:List[T], ys:List[T]):List[T] =
      (xs,ys) match {
        case (Nil,ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) =>
          if (lt(x,y)) x::merge(xs1, ys)
          else y::merge(xs, ys1)
      }
    merge(msort(one)(lt), msort(two)(lt))
  }
}
val testList = List(6,5,4,-2,3,2,1,-5);
println(msort(testList)
  ((x:Int, y:Int) => if (x < y) true else false))
// merge using nested pattern matching
//def merge(xs:List[Int], ys:List[Int]):List[Int] = xs match {
//  case Nil => xs
//  case x::xs1 => {
//    ys match {
//      case Nil => xs
//      case y::ys1 =>
//        if (x < y) x::merge(xs1, ys)
//        else y::merge(xs, ys1)
//    }
//  }
//}