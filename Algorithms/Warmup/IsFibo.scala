object Solution {
  def main(args: Array[String]) {

    for(i <- io.Source.stdin.getLines.drop(1).map(BigInt(_))) {
      println(if(fib.dropWhile(_ < i).head == i) "IsFibo" else "IsNotFibo")
    }

    lazy val fib: Stream[BigInt] = 0 #:: 1 #:: fib.zip(fib.tail).map { n => n._1 + n._2 }
  }
}