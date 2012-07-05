package de.vorb.namcap.gui

import de.vorb.namcap.l10n._

import scala.swing._

class InfoFrame extends Dialog {
  title = translate(Term.InfoFrameTitle)

  contents = new Label {
    text = translate(Term.Copyright)
  }

  resizable = false
  centerOnScreen()
  pack()
  visible = true
}
