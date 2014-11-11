object Solution {
  def main(args: Array[String]) {
    val r = io.Source.stdin.getLines
    val (l, k) = (r.next.toInt, r.next.toInt)
    val ls = r.map(_.toInt).toArray.sorted
    println((0 to l-k).map(i => ls(i+k-1) - ls(i)).min)
  }
}