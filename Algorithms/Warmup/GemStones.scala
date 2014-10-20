object Solution {

  def main(args: Array[String]) {
    val base = io.Source.stdin.getLines().filter(_.length > 0).drop(1).map(_.toString).toList

    println(
      base.foldLeft(base(0))((acc, s) => acc.filter(s contains _)).distinct.size
    )
  }
}