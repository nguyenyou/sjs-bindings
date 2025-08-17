package www.bindings.clsx

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object clsxMod {
  @js.native
  @JSImport("clsx", "clsx")
  def clsx(x: String*): String = js.native
}