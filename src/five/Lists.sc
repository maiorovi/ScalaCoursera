def squareList(xs:List[Int]):List[Int] = xs match {
  case Nil => xs
  case y::ys => (y*y)::squareList(ys)
}

trait MyList[T] {
//  def map[U](f: T => U):MyList[T] = this match {
//    case Nil => this;
//    case x::xs1 => f(x)::xs1.map(f)
//  }
}

List(1,2,3,4,5,6) :: List(1,2,3,4,5,6)

squareList(List(1,2,3,4))
squareList1(List(1,2,6,4))

def squareList1(xs:List[Int]):List[Int] = xs.map(x => x * x)

def posElement(xs:List[Int]):List[Int] = xs match{
  case Nil => xs
  case x::xs1 => if (x > 0) x::posElement(xs1) else posElement(xs1)
}

posElement(List(1,2,3,4,5,6,7,-5,-6,-7,-8))


def pack[T](xs:List[T]):List[List[T]] =xs match {
  case Nil => Nil
  case x::xs1 =>
    val (frst, rest) = xs span (p => x == p)
    frst::pack(rest)
}

pack(List(1,1,1,2,3,4,5,6,6))


def encode[T](xs:List[List[T]]):List[(T,Int)] = xs match {
  case Nil => Nil
  case x::xs1 => (x.head, x.length)::encode(xs1)
}


encode(pack(List(1,1,1,2,3,4,5,6,6)))