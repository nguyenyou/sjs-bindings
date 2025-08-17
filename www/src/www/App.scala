package www

import com.raquo.laminar.api.L.*
import www.bindings.clsx.mod.clsx
import scala.scalajs.js

case class App() {
  def apply() = {
    div(
      clsx("text-blue-500", "bg-red-500", 0, false),
      clsx(
        js.Dictionary(
          "text-blue-500" -> true,
          "bg-red-500" -> false
        )
      ),
      clsx(
        js.Array(
          "text-blue-500",
          "bg-red-500",
          0,
          false
        )
      )
    )
  }
}
