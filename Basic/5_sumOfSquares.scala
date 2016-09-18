import scala.io.StdIn._
import scala.math._

object SumOfSum //creates a singleton object 
{
	def square(x:Int) : Int = 	// return the square of the received args
	{
		x*x
	}

	def sumOfSquares(x:Int , y:Int) : Int = //returns the sum of squares 
	{
		val ans = square(x) + square(y)
		return ans
	}
	def main(args : Array[String])
	{
		val a = readInt()
		val b = readInt()

		println(sumOfSquares(a,b))
	}
}