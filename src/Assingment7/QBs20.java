package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs20 {

	public static void main(String[] args) {
		
		//20. Skip the first 3 elements and print the rest
		// Expected output: [orange, grape, kiwi, melon, apple, mango]
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		List<String> three = new ArrayList<>();
//		
//		for(int i=3; i<words.size();i++) {
//			three.add(words.get(i));
//		}
//		System.out.println(three);
		
		List<String> three = words.stream()
				.skip(3)
				.collect(Collectors.toList());
		System.out.println(three);
	}
}
