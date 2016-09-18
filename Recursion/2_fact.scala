import scala.io.StdIn._

object Fact
{
	def fact(n:Int) : Int = 
	{
		if(n == 0)
			return 1
		else
			return n*(fact(n-1))
	}

	def main(args : Array[String])
	{
		var num = readInt()
		println (fact(num))
	}
}