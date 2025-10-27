package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QBs2 {

	public static void main(String[] args) {
		//2. Print all words that start with 'a'.
				// Expected output: apple, apple
		
		List<String> words = Arrays.asList("apple", "banana", 
				"mango", "orange", "grape", "kiwi","melon", "apple", "mango");
				
				
				for(String word : words) {
				
				if(word.startsWith("a")) {
					System.out.println(word);
				}
				
				}
				List<String> start = new ArrayList<>();
				
				         words.stream()
						.filter(word -> word.startsWith("a"))
						.forEach(System.out::println);
	}
}
