package Assignment9;

import java.util.function.BiFunction;

public class BiF3 {

	public static void main(String[] args) {
//		3. Use a BiFunction<String, String, Integer> to return the 
//		total length of two strings combined.
		
		BiFunction<String, String, Integer> name = (str1, str2)->str1.length()+str2.length();
		
		int result = name.apply("Hellow", "rahul");
		
		System.out.println("Total length : "+ result);
	}
}
