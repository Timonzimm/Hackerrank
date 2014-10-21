object Solution {

  def main(args: Array[String]) {
    val line = readLine

    println(
      if (line.distinct.toCharArray.map(x => line.count(_ == x)).filter(_%2 != 0).size <= 1) "YES" else "NO"
    )
  }
}