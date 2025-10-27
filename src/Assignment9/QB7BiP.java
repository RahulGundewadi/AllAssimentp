package Assignment9;

import java.util.function.BiPredicate;

public class QB7BiP {

	public static void main(String[] args) {
	
//		7. Write a BiPredicate<String, Integer> that returns true if
//		the length of thestring is greater than the given number.
		
		BiPredicate<String, Integer> len = (str , n) -> str.length()>n ;
		
		boolean result = len.test("hello", 6);
		
		System.out.println(result);
	}
}
