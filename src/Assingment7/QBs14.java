package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QBs14 {

	public static void main(String[] args) {
		//14. Check if any word contains the letter 'z'
		// Expected output: false
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		boolean letter = false;
//		
//		for(String word : words) {
//			if(word.contains("z")) {
//				letter = true;
//				break;
//			}
//		}
//		System.out.println(letter);
		
		boolean letter = words.stream()
				.anyMatch(word -> word.contains("z"));
		
		System.out.println(letter);
	}
}
