package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs17 {

	public static void main(String[] args) {
		//17. Filter and collect words that contain the letter 'e'
		// Expected output: [apple, orange, grape, melon]
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		List<String> letter = new ArrayList<>();
//		
//		for(String word : words) {
//			if(word.contains("e")) {
//				letter.add(word);
//			}
//		}
//		System.out.println(letter);
		
		List<String> letter = words.stream()
				.filter(word -> word.contains("e"))
				.collect(Collectors.toList());
		
		System.out.println(letter);
		
	}
}
