package Assignment9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class QB2 {

	public static void main(String[] args) {
		//2. Create a Function<String, Integer> to return the length of a string. Use it to
		//	get the length of a name provided by a Supplier<String> , 
		//and print the result	using a Consumer<Integer> .
		
		Supplier<String> name = () ->"Rahul";
		
		Function<String , Integer> nameLength = len -> len.length();
		
		Consumer<Integer> PrintLength = length -> System.out.println(length);
		
		String nm = name.get();
		int len = nameLength.apply(nm);
		PrintLength.accept(len);
		
	}
}