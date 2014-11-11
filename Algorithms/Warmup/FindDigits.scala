object Solution {
  def main(args: Array[String]) {
    for(n <- io.Source.stdin.getLines().drop(1).toList) {
      println(n.map(_.asDigit).count( d => d != 0 && n.toInt % d == 0))
    }
  }
}