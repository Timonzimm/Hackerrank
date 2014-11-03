object Solution {

  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1)

    lines.foreach(x => {
      val nums = lines.next().split(" ").map(_.toInt).toList
      val filtered = nums.filter(x => !nums.exists(y => x%y == 0 && x != y)).distinct

      println(
        if(filtered.contains(1) || filtered.exists(x => filtered.exists(y => gcd(x, y) == 1 && x != y ))) "YES" else "NO"
      )
    })
  }

  def gcd(a: Int, b: Int): Int = if (b == 0) a.abs else gcd(b, a % b)
}

