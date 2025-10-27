package Assignment9;

import java.util.function.Function;
import java.util.function.Supplier;

public class QB11 {

	public static void main(String[] args) {
		//11. Use a Supplier<Integer> to provide two numbers (separately), use
		//Function<Integer, Integer> to double them, and print their sum.
		
		Supplier<Integer> Number1 = () -> 5;
		Supplier<Integer> Number2 = () -> 4;
		
		Function<Integer, Integer> Fdouble= n -> n*2;
		
		int num1 = Number1.get();
		int num2 = Number2.get();
		
		int double1 = Fdouble.apply(num1);
		int double2 = Fdouble.apply(num2);
		
		int sum = double1+double2;
		
		System.out.println("Sum of doubled numbers: "+sum);
	}
}
