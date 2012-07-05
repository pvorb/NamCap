package de.vorb.namcap.game
import de.vorb.namcap.game.world.WorldReader

class Level(val num: Int, val random: Boolean) {
  def this() = this(0, false)
  def this(num: Int) = this(num, true)

  val world = if (random) generateWorld(num) else WorldReader.readWorld()

  def generateWorld(difficulty: Int) = {
    // FIXME
    WorldReader.readWorld()
  }
}
