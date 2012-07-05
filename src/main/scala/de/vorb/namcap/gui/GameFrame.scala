package de.vorb.namcap.gui

import de.vorb.namcap.Starter
import de.vorb.namcap.l10n._
import javax.swing.UIManager
import scala.swing._
import scala.swing.event.ButtonClicked
import java.awt.Color

class GameFrame extends Frame {
  title = translate(Term.GameFrameTitle)

  menuBar = new MenuBar {
    contents += new Menu(translate(Term.MenuGame)) {
      contents += new MenuItem(translate(Term.MenuStatistics)) {
        reactions += {
          case ButtonClicked(ev) => new StatFrame
        }
      }
    }
    contents += new MenuItem(translate(Term.MenuInfo)) {
      reactions += {
        case ButtonClicked(ev) => new InfoFrame
      }
      pack()
    }
  }

  contents = new Panel {
    preferredSize = new Dimension(448, 576)
    background = Color.BLACK
  }

  resizable = false
  centerOnScreen()
  pack()
  visible = true
}
