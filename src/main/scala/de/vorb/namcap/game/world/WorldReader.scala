package de.vorb.namcap.game.world

import scala.collection.mutable.ListBuffer
import de.vorb.namcap.game.world.TileType._
import java.io.File
import scala.io.Source

object WorldReader {
  private val worlds = new File("src/main/resources/worlds")

  def readWorld(name: String = "default") = {
    val src = Source.fromFile(new File(worlds, name+".world"));

    val lines = src.getLines
    val first = lines.toIndexedSeq(0)

    val dim = (first.length, lines.length)

    val tiles = for {
      line <- lines
      c <- line
    } yield new Tile(c match {
      case ' ' => Way
      case '#' => Wall
      case 'o' => Way
      case _ => Off
    })

    new World(dim, tiles.toArray)
  }

  def main(args: Array[String]) {
    readWorld()
  }
}
