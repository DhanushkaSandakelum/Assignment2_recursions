object q5_program extends App{
	def isEven(n: Int): Boolean = n match{
		case 0 => true
		case _ => isOdd(n-1)
	}
	
	def isOdd(n: Int): Boolean = !(isEven(n))
	
	//even sum generator
	var sum = 0
	def evenSum(n: Int): Int = {		
		if(n>1)
			evenSum(n-1)
		if(isEven(n))
			sum = sum + n
		sum
	}
	
	print("enter integer: ")
	val num = scala.io.StdIn.readInt()
	println(evenSum(num))
}