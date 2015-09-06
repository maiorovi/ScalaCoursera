val l = List(1,2,3,4)

l.reduceLeft(_ + _)
l.foldLeft[Int](0)((x,y) => x + y)
l.foldLeft[Int](1)((x,y) => x * y)

def concat[T](xs:List[T], ys:List[T]):List[T] =
  (xs foldRight ys)(_::_)