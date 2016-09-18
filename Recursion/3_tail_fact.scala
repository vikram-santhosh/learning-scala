// A tail recurrsive implementation of factorial

import scala.io.StdIn._

object TailFact
{
	def fact(n:Int) : Int = 
	{
		def loop(n:Int,acc:Int) : Int = 
		{
			if(n==0)
				return acc
			else
				return loop(n-1,acc*n)
		}
		loop(n,1)
	}

	def main(args : Array[String])
	{
		var num = readInt()
		println (fact(num))
	}
}