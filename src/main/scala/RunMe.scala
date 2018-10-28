import org.graalvm.polyglot._
import org.graalvm.polyglot.proxy._


object RunMe {

  final case class Wah[T](x: T)

  def main(args: Array[String]): Unit = {
    println("Hello Java!")
    val item = new MySomething {
      override def data: Int = 15
    }
    val context = Context.create()
    val function = context.eval("js", "function(x) ({result: x.data() + 1})")
    assert(function.canExecute)
    val x = function.execute(item)
    val r = x.getMember("result").asInt()
    println(s"Result = $r")
    context.eval("js", "print('Hello JavaScript!');")

    val f2 = context.eval("js", "function(x) (x.copy(2))")
    val r2 = f2.execute(Wah("Hey"))
    println(s"Result = ${r2}")

    val f3 = context.eval(Source.newBuilder("js", getClass.getResource("/runner.js").toURI.toURL).build())
    assert(f3.canExecute)
    println(f3.execute(Wah("H")))
  }
}
