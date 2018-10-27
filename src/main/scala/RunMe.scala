import org.graalvm.polyglot._
import org.graalvm.polyglot.proxy._


object RunMe {

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
  }
}
