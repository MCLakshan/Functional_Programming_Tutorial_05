object tute_05 extends App{

	def odd_or_even(num:Int):String = num match{
		case x if x == 0 => "Even"
		case x if x == 1 => "Odd"
		case x if x < 0 => odd_or_even(-num)
		case _ => odd_or_even(num - 2)
	}

	println(odd_or_even(1210))
}

