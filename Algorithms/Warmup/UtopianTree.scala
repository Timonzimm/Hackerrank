object Solution {
  def main(args: Array[String]) {
    val nums = io.Source.stdin.getLines().filter(_.length > 0).drop(1).map(_.toInt)
    
    nums.foreach(n => println( (0 to n).foldLeft(0)((acc, i) => if(i%2 == 0) acc + 1 else acc * 2) ) )
  }
}