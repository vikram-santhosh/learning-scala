import scala.collection.mutable.Stack

object BalancedParanthesis
{
	def balance(chars: List[Char]): Boolean = 
	{
		var st = Stack[Char]()
		for(i <- chars)
		{
			if(i == '(')
				st.push(i)
			if(i == ')')
			{
				if(st.top == '(')
					st.pop
				else
					return false
			}
		}
		return st.isEmpty
	}

	def main(args : Array[String])
	{
		var l = List('(',')','(')
		println(balance(l))
	}
}
