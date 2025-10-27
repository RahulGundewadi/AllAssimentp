package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QBs6 {

	public static void main(String[] args) {
		//6. Remove duplicates from the list
		// Expected output: [apple, banana, mango, orange, grape, kiwi, melon]
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi",
				"melon", "apple", "mango");
		
//		List<String> word = words.stream()
//				                 .distinct()
//				                 .collect(Collectors.toList());
//		
//		System.out.println(word);
		
		List<String> fruit = new ArrayList<>();
		
		for(String fruits : words) {
			if(!fruit.contains(fruits)) {
				fruit.add(fruits);
			}
		}
		System.out.println(fruit);
	}	
}