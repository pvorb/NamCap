package de.vorb.namcap.game.world

import scala.collection.immutable.Seq

class World(val dimensions: Pair[Int, Int], val tiles: Array[Tile]) {

  override def toString = {
    val sb = new StringBuilder
    for (tile <- tiles) {
      sb.append(tile.toString)
    }
    sb.toString
  }
}
