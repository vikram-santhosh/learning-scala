// Newton's Method to find the Square Root of a Number
// Algorithm - Numberical Method
// 1. 	Start with an iniital approx. (say num = 1)
// 2.	Repeat until convergence 
// 			ans = mean(num,num/ans)

import scala.io.StdIn._
import scala.math._

object SquareRoot
{
	var ans = 1.0
	def findSqrt(num: Double) : Double = 
	{
		if(abs(ans*ans - num) <= 0.001)
			ans
		else
		{
			ans = (ans + num / ans)/2.0
			findSqrt(num)
		}
	} 
	def main(args: Array[String])
	{
		var num = readDouble()
		var ans = findSqrt(num)
		println(ans)
	}
}
