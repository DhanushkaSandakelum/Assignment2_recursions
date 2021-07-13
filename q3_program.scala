object q3_program extends App{
	//recursive sum
	def sum(n: Int): Int = n match{
		case 1 => 1
		case _ => n + sum(n-1)
	}
	
	println(sum(5))
}