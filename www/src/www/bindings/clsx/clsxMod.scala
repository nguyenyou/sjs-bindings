package www.bindings.clsx

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

type ClassValue = String

object clsxMod {
  @js.native
  @JSImport("clsx", "clsx")
  def clsx(x: ClassValue*): String = js.native
}