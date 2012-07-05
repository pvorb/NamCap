package de.vorb.namcap

import de.vorb.l10n.Language
import de.vorb.namcap.game.Game
import de.vorb.namcap.gui._
import de.vorb.namcap.l10n._

import scala.swing._
import scala.swing.event.ButtonClicked

import java.awt.{ Color, Dimension }
import java.util.Locale

import javax.swing.UIManager

object Starter extends SimpleSwingApplication {
  val padding = 8

  val top = new MainFrame {
    title = translate(Term.StartFrameTitle)

    iconImage = toolkit.getImage("src/main/resources/nampac-icon.png")

    for (laf <- UIManager.getInstalledLookAndFeels; if "Nimbus" == laf.getName)
      UIManager.setLookAndFeel(laf.getClassName)

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
      }
    }

    contents = new FlowPanel {
      border = Swing.EmptyBorder(padding)

      contents += new Button {
        text = translate(Term.DefaultGame)
        tooltip = translate(Term.DefaultGameDescription)
        reactions += {
          case ButtonClicked(ev) => new GameFrame
        }
      }
      contents += new Button {
        text = translate(Term.RandomGame)
        tooltip = translate(Term.RandomGameDescription)
        reactions += {
          case ButtonClicked(ev) => new GameFrame
        }
      }
    }

    resizable = false
    centerOnScreen()
    pack()
    visible = true
  }

  val laf = UIManager.getLookAndFeel

  val game = new Game(true)
}
