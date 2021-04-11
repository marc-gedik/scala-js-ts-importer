
import scala.scalajs.js
import js.annotation._

package stringlit {

package stringlit {

@js.native
trait IEditorOptions extends js.Object {
  var ariaLabel: String = js.native
  var rulers: js.Array[Double] = js.native
  var selectionClipboard: Boolean = js.native
  var lineNumbers: "on" | "off" | "relative" | js.Function1[Double, String] = js.native
  var readable: "yes" | Boolean | "restricted" = js.native
}

@js.native
@JSGlobal("stringlit")
object Stringlit extends js.Object {
  type BuiltinTheme = "vs" | "vs-dark" | "hc-black"
}

}

}
