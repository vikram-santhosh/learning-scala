object PascalsTriangle
{
	def Pascal(steps : Int ) = 
	{

		def pattern(row:Int,col:Int) : Int =
		{
			if(col == 0 || row == col)
				return 1
			else
				return (pattern(row-1,col)+pattern(row-1,col-1))
		}

		for(i <- 0 to steps)
		{
			for( j <- 0 to i)
			{
				print(pattern(i,j) + " ")
			}	
			println()
		}
	}

	def main(args : Array[String])
	{
		Pascal(5)
	}

}