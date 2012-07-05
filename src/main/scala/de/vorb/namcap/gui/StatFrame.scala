package de.vorb.namcap.gui

import de.vorb.namcap.l10n._

import scala.swing._

class StatFrame extends Dialog {
  title = translate(Term.StatFrameTitle)

  contents = new Button {
    text = "This is a very long button with very much text."
  }

  resizable = false
  centerOnScreen()
  pack()
  visible = true
}
