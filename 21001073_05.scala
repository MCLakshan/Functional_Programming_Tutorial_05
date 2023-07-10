object tute_05 extends App{

	def sum_of_even(num:Int):Int ={
		if(num <= 0){ return 0 }

		if(num % 2 == 0){
			return num + sum_of_even(num - 2)
		}else{
			return 0 + sum_of_even(num - 1)
		}
	}

	println(sum_of_even(10))
}

