package six

object Application extends App{
  val persons = List(Person("Egor", 24),
  Person("Oksana", 34),
  Person("Vitaliy", 29))

  val list = for (person <- persons if person.age > 25) yield person.name

  println(list).toString;

  def isPrime(n: Int):Boolean = {
    (2 until n) forall ( x => n % x != 0)
  }

}
