package Assingment7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QBs12 {

	public static void main(String[] args) {
		//12. Find the shortest word
		// Expected output: kiwi
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		String shortest = words.get(0);
//		
//		for(String word : words) {
//			if(word.length()<shortest.length()) {
//				shortest = word;
//			}
//		}
//		System.out.println(shortest);
		

		String Shortes = words.stream()
				.min(Comparator.comparingInt(String::length))
				.orElse(null);
		
		System.out.println(Shortes);
	}
}
