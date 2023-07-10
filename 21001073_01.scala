object tute_05 extends App{

	def prime(p:Int, n:Int = 2):Boolean = {
		if (p == n){
			true
		}else if(p % n == 0){
			false
		}else{
			prime(p, n+1)
		}
	}

	println(prime(10))
	println(prime(13))
}