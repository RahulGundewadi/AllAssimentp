package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs4 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", 
				"mango", "orange", "grape", "kiwi","melon", "apple", "mango");
				
		
			    //	4. Convert all strings to uppercase and store it in list.
				// Expected output: [APPLE, BANANA, MANGO, ORANGE, GRAPE, 
				//KIWI, MELON, APPLE,MANGO]
				
				List<String> upper = new ArrayList<>();
		           for(String word : words) {
					upper.add(word.toUpperCase());	
				}
		           System.out.println(upper);
		           
		           
		           List<String> upper1 = words.stream()
		        		   .map(String::toUpperCase)
		        		   .collect(Collectors.toList());
		           
		           System.out.println(upper1);
	}
}
