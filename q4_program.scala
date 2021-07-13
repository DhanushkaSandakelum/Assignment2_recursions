object q4_program extends App{
	def isEven(n: Int): Boolean = n match{
		case 0 => true
		case _ => isOdd(n-1)
	}
	
	def isOdd(n: Int): Boolean = !(isEven(n))
	
	//either can use isEven() or isOdd() both gives valid results
	println(isEven(8))
	println(isEven(11))
}