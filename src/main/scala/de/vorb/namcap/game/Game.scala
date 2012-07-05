package de.vorb.namcap.game

class Game(val random: Boolean) {
  val level = new Level
  var score: Int = 0
  var levelCount: Int = 0
}
