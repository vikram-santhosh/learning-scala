object CoinChange
{
	def countChange(sum: Int, coins: List[Int]): Int = 
	{
		def compute(sum:Int,num:Int,coins:List[Int]) : Int = 
		{
			if(sum == 0)
				return 1

			if(sum < 0)
				return 0

			if(num <= 0 && sum >= 0)
				return 0

			return (compute(sum,num-1,coins) + compute(sum-coins(num-1),num,coins))
		}
		compute(sum , coins.length, coins)
	}
	def main(arg: Array[String])
	{
		var n = 5
		var coins = List(1,2,3)

		println(countChange(n,coins))

	}
}