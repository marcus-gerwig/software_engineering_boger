import de.htwg.se.dicepoker.controller.DPController
import aView.Tui

import scala.io.StdIn.readLine

object DicePoker {

  val controller = new DPController(null)
  val tui = new Tui(controller)
  //controller.notifyObservers

  def main(args: Array[String]): Unit = {
    var input: String = ""

    do {
      input = readLine()
      tui.processInputLine(input)
    } while (input != "q")
  }
}