package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(contains(singletonSet(1), 2))
  val a = singletonSet(2)
  val b = singletonSet(3)
  val c = union(a, b)
  val d = singletonSet(10)
  println(contains(c, 2))
  println(contains(c, 3))
  println(contains(c, 4))
  
  println(forall(c, d))
  println(exists(c, d))
  printSet(map(c, x => x * x))
}
