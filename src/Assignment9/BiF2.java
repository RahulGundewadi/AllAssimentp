package Assignment9;

import java.util.function.BiFunction;

public class BiF2 {

	public static void main(String[] args) {
//		2. Write a BiFunction<String, Integer, String> that repeats a string the
//		given number of times. For example, input ("Hi", 3) → Output: "HiHiHi".
	
		BiFunction<String, Integer, String> name = (str, n)->{
			
			StringBuilder result = new StringBuilder();
			
			for(int i=0;i<n;i++) {
				result.append(str);
			}
			return result.toString();
		};
		
		String output = name.apply("Hii", 3);
		
		System.out.println(output);
	
	}
}
