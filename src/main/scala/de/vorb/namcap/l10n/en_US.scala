package de.vorb.namcap.l10n

import de.vorb.l10n.Language

object en_US extends Language {
  def code = "en-US"
  def name = "English (United States)"
  override def translate[Term](term: Term) = term match {
    case Term.StartFrameTitle => "New McPan Game"
    case Term.DefaultGame => "Default Game"
    case Term.DefaultGameDescription => "This starts the default game as "+
      "known from the original Pac-Man."
    case Term.RandomGame => "Random Game"
    case Term.RandomGameDescription => "This starts McPan with a random "+
      "generated level. Every level is different from the previous one."

    case _ => "[undefined]"
  }
}