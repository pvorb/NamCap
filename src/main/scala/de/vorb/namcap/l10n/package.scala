package de.vorb.namcap

import java.util.Locale

package object l10n {
  val defaultLanguage = en_US
  val languages = Map(
    "en_US" -> en_US,
    "en" -> en_US,
    "de_DE" -> de_DE,
    "de" -> de_DE)

  // get default system locale and select language accordingly
  val locale = Locale.getDefault.toString
  val translate = languages.getOrElse(locale, defaultLanguage)
}
