object tute_05 extends App{

	def add(x:Int):Int ={
		if(x <= 0){
			return 0
		}

		return x + add(x - 1)
	}

	

	println(add(5))
}

