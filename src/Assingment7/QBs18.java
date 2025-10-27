package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs18 {

	public static void main(String[] args) {
		
		//18. Map each word to its length and collect the result as a list
		// Expected output: [5, 6, 5, 6, 5, 4, 5, 5, 5]
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");

//		List<Integer>  lenght = new ArrayList<>();
		
//		for(String word : words) {
//			lenght.add(word.length());
//		}
//		System.out.println(lenght);
		
		List<Integer>  lenght = words.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		System.out.println(lenght);
	}
}
