object Solution {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).toList.map(_.split(" "))
    val jars = lines(0)(0).toLong
    printf((lines.drop(1).map(x => (((x(1).toLong - x(0).toLong + 1)*x(2).toLong))).sum / jars).toString)
  }
}