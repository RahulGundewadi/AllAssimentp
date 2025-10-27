package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QBs15 {

	public static void main(String[] args) {
		
		//15. Check if all words have more than 3 letters
		// Expected output: true
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		boolean letter = false;
//		
//		for(String word : words) {
//			if(word.length()>3) {
//				letter= true;
//				break;
//			}
//		}
//		System.out.println(letter);
		
		boolean letter = words.stream()
				.allMatch(word -> word.length()>3);
		
		System.out.println(letter);
	}
}
