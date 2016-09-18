object BalancedParanthesis
{
	def balance(chars: List[Char]): Boolean = 
	{
		def check(chars : List[Char],count: Int) : Boolean = 
		{
			if (chars.isEmpty) count == 0
			else if (chars.head == '(') check (chars.tail,count+1)
			else if (chars.head == ')') count > 0 && check (chars.tail,count-1)
			else check(chars.tail,count)
		} 
		check(chars,0)
	}

	def main(args : Array[String])
	{
		var l = List('(',')','(')
		println(balance(l))
	}
}
