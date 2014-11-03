object Solution {
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1).map(_.toInt)
    lines.foreach(x => println(getNum(x)))
    
    def getNum(x: Int) : String ={
      for( i <- (x to 0 by -1) ) {
        if( i % 3 ==0 && (x - i) % 5 ==0 ) return ("5" * i  + "3" * (x-i))
      }
      return "-1"
    }
  }
}