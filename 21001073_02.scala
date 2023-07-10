object tute_05 extends App{

/*
	def prime(p:Int, n:Int = 2):Boolean = {
		if (p == n){
			true
		}else if(p % n == 0){
			false
		}else{
			prime(p, n+1)
		}
	}


	def primeSqn(n:Int):Unit = {
		if (prime(n)){
			println(n)
		}

		if (n > 1){
			primeSqn(n - 1)
		}
	}

	primeSqn(10)

*/


	def primeSeq(p:Int, n:Int = 2):Unit = {
		if(n > p){
			return
		}

		def prime(p:Int, n:Int = 2):Boolean = {
			if (p == n){
				true
			}else if(p % n == 0){
				false
			}else{
				prime(p, n+1)
			}
		}

		if(prime(p)){
			println(p)
		}

		primeSeq(p - 1)
	}

	primeSeq(10)

	
}