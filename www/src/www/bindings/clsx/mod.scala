package www.bindings.clsx

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// type ClassArray = js.Array[ClassValue]

// type ClassValue = String | ClassArray

object mod {
  @js.native
  @JSImport("clsx", "clsx")
  def clsx(x: String*): String = js.native
}