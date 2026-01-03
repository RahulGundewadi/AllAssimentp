package Assignment9;

import java.util.function.BiFunction;

public class BiF1 {

	public static void main(String[] args) {
//		1. Create a BiFunction<Integer, Integer, Integer> that takes two
//		integers and returns their sum. Use it to add 5 and 10, and print the result.
		
		BiFunction<Integer, Integer, Integer> add = (a, b) ->a+b;
		
		int result = add.apply(5, 10);

		System.out.println("sum : "+ result);
	}
}
