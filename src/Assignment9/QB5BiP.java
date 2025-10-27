package Assignment9;

import java.util.function.BiPredicate;

public class QB5BiP {

	public static void main(String[] args) {
//		5. Create a BiPredicate<String, String> that checks if two strings are equal
//		(case-insensitive). Test it with inputs like ("hello", "HELLO").
		
		BiPredicate<String, String> name = (n1, n2) -> n1.equalsIgnoreCase(n2);
		
		boolean result = name.test("hello", "HELLO");
		
		System.out.println("Are strings equal (case-insensitive)? " + result);
	}
}
