object HelloWorld extends App {
  val greeting = "Hello World"
  println(s"$greeting")

  def sum(a: Long, b: Long) = a + b

  println(sum(5,4))
}