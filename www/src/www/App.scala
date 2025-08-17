package www

import com.raquo.laminar.api.L.*
import www.bindings.clsx.clsxMod

case class App() {
  def apply() = {
    div(
        cls(clsxMod.clsx("text-blue-500", "bg-red-500")),
        "App"
    )
  }
}
