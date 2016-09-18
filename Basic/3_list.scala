// print even numbers in a list

object list
{
	def main(args : Array[String])
	{
		var i = 0
		val l = List(1,2,3,4,5,6,7,8,9,10) // creates a list
		for(i<-l)
		{
			if(i%2 == 0)
				println(i)
		}
	}
}