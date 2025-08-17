package www

import org.scalajs.dom
import com.raquo.laminar.api.L.*

object Main {
  @main
  def run(): Unit = {
    render(
      dom.document.getElementById("app"),
      div(
        cls("text-red-500"),
        "Mill + Vite + Scala.jssss",
      )
    )
  }

  def hello(): String = "Hello World"
}
