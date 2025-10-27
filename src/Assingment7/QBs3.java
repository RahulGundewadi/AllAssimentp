package Assingment7;

import java.util.Arrays;
import java.util.List;

public class QBs3 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", 
				"mango", "orange", "grape", "kiwi","melon", "apple", "mango");
		//3. Print all words with length greater than 5.
				// Expected output: banana, orange
				
				for(String word : words) {
					
					if(word.length()>5) {
						System.out.println(word);
					}
				}
				words.stream()
				.filter(x -> x.length()>5)
				.forEach(System.out::println);
	}
}
