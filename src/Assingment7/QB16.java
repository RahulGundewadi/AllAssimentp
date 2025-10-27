package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//16. From numbers(provided at top of doc),
//convert List<Integer> to List<String>
//Expected output: ["1", "2", ..., "10"]
public class QB16 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
//		List<String> stringList = new ArrayList<String>();
//		
//		for(int num : numbers) {
//			
//			stringList.add(String.valueOf(num));
//		}
//		System.out.println(stringList);
		
		List<String> StringList = numbers.stream()
				                  .map(String::valueOf)
				                  .collect(Collectors.toList());
		
		System.out.println(StringList);
				     
				   
	}
}
