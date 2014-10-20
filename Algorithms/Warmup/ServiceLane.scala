object Solution {
    def main(args: Array[String]) {
        val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1)
        val road = lines.take(1).toList(0).split(" ").toList.map(_.toInt)
        val tests = lines

        tests.foreach ( n => println(
            road.drop(n.split(" ").toList(0).toInt).dropRight(road.length - n.split(" ").toList(1).toInt - 1).min
		) )
    }
}