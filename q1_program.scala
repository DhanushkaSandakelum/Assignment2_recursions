object q1_program extends App{
	//gcd function
	def gcd(a: Int, b: Int): Int = b match{
		case 0 => a
		case x if(x>a) => gcd(x, a)
		case _ => gcd(b, a%b)
	}
	
	//prime recursive function
	def prime(n: Int, t: Int = 2): Boolean = t match{
		case x if(x==n) => true
		case x if(gcd(n, x)>1) => false
		case x => prime(n, x+1)
	}
	
	println(prime(5))
	println(prime(8))
}