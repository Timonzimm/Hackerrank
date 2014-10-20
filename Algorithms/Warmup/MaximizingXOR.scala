object Solution {
  def main(args: Array[String]) {
		val start = readLine.toInt
		val end = readLine.toInt
		var maxi: Int = 0

		(start to end).toList.foreach(a => ((a+1) to end).toList.foreach(b => maxi = maxi.max(a ^ b)))

		println(maxi)
	}
}