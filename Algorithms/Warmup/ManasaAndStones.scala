object Solution {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1)

    lines.foreach(x => {
      val n = x.toInt
      val a = lines.next().toInt
      val b = lines.next().toInt

      println(
        (1 to n).foldLeft(List(a,b))((acc, d) => List(a,b) ++ acc).combinations(n-1).toList.distinct.map(_.fold(0)((acc, d) => acc + d)).sorted.mkString(" ")
      )
    })
  }
}