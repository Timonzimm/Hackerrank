object Solution {

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1).toList

    lines.map(x => println({
        val n = x.split(" ")(0).toInt
        val c = x.split(" ")(1).toInt
        val m = x.split(" ")(2).toInt
        n/c + getNumFromWrappers(0, n/c, m)
      }
    ))

    def getNumFromWrappers(acc: Integer,w: Integer, m: Integer) : Integer = {
      if(w < m) acc
      else getNumFromWrappers(acc + w/m, w/m + w%m, m)
    }
  }
}