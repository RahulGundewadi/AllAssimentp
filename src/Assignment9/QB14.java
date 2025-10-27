package Assignment9;

import java.util.function.Function;
import java.util.function.Predicate;

public class QB14 {

	public static void main(String[] args) {
//		14. Use Predicate<Integer> to check if a number is divisible by 3 or 5. Use
//		Function<Integer, String> to return a message accordingly: “Fizz”, “Buzz”,
//		or “FizzBuzz”.
		
		Predicate<Integer> number1 = n -> n%3 ==0; 
		Predicate<Integer> number2 = n -> n%5 ==0;
		
		Function<Integer, String> divi = n -> {
			if(number1.and(number2).test(n)) {
				return "FizzBuzz ";
			}else if(number1.test(n)) {
				return "Fizz";
			}else if(number2.test(n)){
				return "Buzz";
			}else {
				return "not divid";
			}
		};
		for(int i=0; i<=20;i++) {
			System.out.println(i+ "  -- "+divi.apply(i));
		}
	}
}
