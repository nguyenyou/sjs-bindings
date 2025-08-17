package www.bindings.clsx

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object mod {
  @js.native
  @JSImport("clsx", "clsx")
  def clsx(inputs: ClassValue*): String = js.native

  type ClassArray = js.Array[ClassValue]
  type ClassDictionary = js.Dictionary[js.Any]
  type ClassValue = js.UndefOr[Any | ClassDictionary |String | Double | js.BigInt | Null | Boolean]
}