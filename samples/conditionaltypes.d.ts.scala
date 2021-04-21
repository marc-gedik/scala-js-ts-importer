
import scala.scalajs.js
import js.annotation._

package conditionaltypes {

@js.native
@JSGlobalScope
object Conditionaltypes extends js.Object {
  type NonNullable[T] = T match { case Null | Unit => Nothing; case _ => T }
  type Unpromisify[T] = T match { case Promise[infferedR] => infferedR; case _ => T }
}

}