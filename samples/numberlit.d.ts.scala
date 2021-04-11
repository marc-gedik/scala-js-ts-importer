
import scala.scalajs.js
import js.annotation._

package numberlit {

package numberlit {

@js.native
trait Machine extends js.Object {
  var state: 0 | 1 = js.native
  def setState(flag: 0 | 1 | Boolean): 0 | 1 = js.native
}

@js.native
@JSGlobal("numberlit")
object Numberlit extends js.Object {
  type HttpStatuscode = 200 | 404 | 503
  def floating(prob: 0.1 | 0.5 | 1.0): 0.0 | 1 = js.native
}

}

}
