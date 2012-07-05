package de.vorb.namcap.game.world

import de.vorb.namcap.game.world.TileType.Type

import scala.collection.mutable.ListBuffer

class Tile(val typeOf: Type) {
  def *(times: Int) = {
    val lbuf = new ListBuffer[Tile]
    for (i <- 1 to times)
      lbuf += new Tile(typeOf)
    lbuf.toList
  }
}
