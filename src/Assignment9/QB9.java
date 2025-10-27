package Assignment9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class QB9 {

	public static void main(String[] args) {
		//9. Use Function<String, String> to convert a string to uppercase. Provide the
		//string using a Supplier and print the result using Consumer .
		
		Supplier<String> name = () -> "rahul";
		
		Function<String, String> fUpper = n -> n.toUpperCase();
		
		Consumer<String> print = result-> System.out.println("UpperCase " + result);
		
		String input = name.get();
		
		String upper = fUpper.apply(input);
		
		print.accept(upper);
	}
}
