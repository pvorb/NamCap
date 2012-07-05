package de.vorb.namcap.l10n

import de.vorb.l10n.Language

object de_DE extends Language {
  def code = "de-DE"
  def name = "Deutsch (Deutschland)"
  override def translate[Term](term: Term) = term match {
    case Term.StartFrameTitle => "Neues NamCap-Spiel"

    case Term.DefaultGame => "Standard-Spiel"
    case Term.DefaultGameDescription => "Startet das vom originalen Pac-Man "+
      "bekannte Spiel."
    case Term.RandomGame => "Zufälliges Spiel"
    case Term.RandomGameDescription => "Startet ein zufällig generiertes "+
      "Spiel. Nachfolgende Level unterscheiden sich jeweils vom vorherigen."

    case Term.GameFrameTitle => "NamCap"

    case Term.MenuGame => "Spiel"
    case Term.MenuStatistics => "Statistiken"
    case Term.MenuInfo => "?"

    case Term.StatFrameTitle => "Statistiken"

    case Term.InfoFrameTitle => "Über NamCap"

    case Term.Copyright => "(c) 2012 Paul Vorbach."

    case _ => "[nicht definiert]"
  }
}
