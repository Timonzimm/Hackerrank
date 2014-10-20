object Solution {
    def main(args: Array[String]) {
        val lines = io.Source.stdin.getLines().filter(_.length > 0).drop(1)
        
		lines.foreach { n => println(inner(0, n))
			def inner(acc: Int, n: String) : String = {
					if(n.length == 0 || n.length == 1) acc.toString
					else if(n.charAt(0) == n.charAt(n.length - 1)) inner(acc, n.substring(1, n.length - 1))
					else if(n.charAt(0) > n.charAt(n.length - 1))
					  inner(acc + 1, ((n.charAt(0).toInt - 1).toChar.toString).concat(n.substring(1, n.length)) )
					else inner(acc + 1, n.substring(0, n.length - 1).concat((n.charAt(n.length - 1).toInt - 1).toChar.toString) )
			}
        }
    }
}