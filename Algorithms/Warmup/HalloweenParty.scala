object Solution {
	def main(args: Array[String]) {
		val nums = io.Source.stdin.getLines().filter(_.length > 0).drop(1).map(_.toLong)

		nums.foreach(k => println((k/2)*(k-k/2)))
	}
}