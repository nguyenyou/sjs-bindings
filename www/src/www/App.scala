package www

import com.raquo.laminar.api.L.*
import www.bindings.clsx.mod

case class App() {
  def apply() = {
    div(
        cls(mod.clsx("text-blue-500", "bg-red-500")),
        "App"
    )
  }
}
