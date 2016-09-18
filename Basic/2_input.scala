import scala.io.StdIn._
import scala.math._

object Input
{
	def main(args : Array[String])
	{
		var a = readInt // reads int
		var b = readInt // reads int

		printf("Sum of %d and %d is %d\n",a,b,add(a,b))
	}

	def add(a:Int , b:Int) : Int = 
	{
		var sum = 0
		sum = a+b
		return sum
	}
}


