package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs5 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", 
				"mango", "orange", "grape", "kiwi","melon", "apple", "mango");
				
		
		//5. Convert all strings to lowercase and store it in list.
		 
		  List<String> words1 = Arrays.asList("APPLE", "BANANA", "MANGO", "ORANGE",
				            "GRAPE","KIWI", "MELON", "APPLE", "MANGO");
		
		  
		  List<String> lower = new ArrayList<>();
		
		  for(String word : words1) {
			lower.add(word.toLowerCase());	
		  }
           System.out.println(lower);
           
           List<String> lower1 = words1.stream()
        		   .map(String::toLowerCase)
        		   .collect(Collectors.toList());
           
           System.out.println(lower1);
	}
}
