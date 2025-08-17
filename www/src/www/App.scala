package www

import com.raquo.laminar.api.L.*

case class App() {
  def apply() = {
    div(
        cls("text-blue-500"),
        "App"
    )
  }
}
