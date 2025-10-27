package Assingment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QBs11 {

	public static void main(String[] args) {
		//11. Find the longest word
		// Expected output: banana
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		String longest ="";
//		
//		for(String word : words) {
//			if(word.length()>longest.length()) {
//				longest = word;
//			}
//		}
//		System.out.println(longest);
		
		String longest = words.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse(null);
		
		System.out.println(longest);
	}
}
