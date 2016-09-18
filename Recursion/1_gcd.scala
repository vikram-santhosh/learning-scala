import scala.io.StdIn._

object GCD
{
	def gcd(a:Int,b:Int) : Int = 
	{
		if(b == 0)
			return a
		else
			gcd(b,a%b)
	}

	def main(args : Array[String])
	{
		var a = readInt()
		var b = readInt()

		println(gcd(a,b))
	}
}