package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs19 {
	
	public static void main(String[] args) {
		//19. Get the first 3 elements of the list
		// Expected output: [apple, banana, mango]
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		List<String> three = new ArrayList<>();
//		
//		for(int i=0; i<3 && i<words.size();i++) {
//         three.add(words.get(i));
//		}
//		System.out.println(three);
		
		List<String> three = words.stream()
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println(three);
	}

}
