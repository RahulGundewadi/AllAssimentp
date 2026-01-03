package Assignment9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class QB13 {

	public static void main(String[] args) {
//		13. Use a Function<String, Boolean> (or Predicate<String> ) to check if
//		a string is a palindrome. Input is from Supplier<String> , output printed using
//		Consumer<Boolean>.
		
		Supplier<String> supplie = () -> "madam";
		
		Function<String, Boolean> palindrome = p -> {
			String reves = new StringBuilder(p).reverse().toString();
			return p.equalsIgnoreCase(reves);
		};
		Consumer<Boolean> print = res -> {
			if(res) {
			System.out.println("palindrome");	
			}else {
				System.out.println("not palindrome");
			}
		};
		String input = supplie.get();
		
		Boolean result = palindrome.apply(input);
		
		print.accept(result);
	}
}
