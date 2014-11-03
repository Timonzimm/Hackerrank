object Solution {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1)

    lines.foreach(x => {
      val nums = x.split(" ").map(_.toInt)

      val l = (Math.sqrt(nums(0)).floor.toInt to Math.sqrt(nums(1)).ceil.toInt)

      println(
        l.filter(x => (nums(0) <= x*x && x*x <= nums(1)) == true).size
      )
    })
  }
}

