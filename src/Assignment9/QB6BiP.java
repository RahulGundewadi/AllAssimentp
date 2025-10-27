package Assignment9;

import java.util.function.BiPredicate;

public class QB6BiP {

	public static void main(String[] args) {
//		6. Use a BiPredicate<Integer, Integer> to check if the
//		first number is divisible by the second.
		
		BiPredicate<Integer, Integer> number = (a, b) -> b != 0 && a % b == 0;
		
		boolean result = number.test(15, 5);
		
		System.out.println(result);
	}
}
