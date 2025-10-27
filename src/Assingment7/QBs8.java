package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QBs8 {

	public static void main(String[] args) {
		
		//8. Sort the list in reverse alphabetical order
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange", "grape", "kiwi",
				"melon", "apple", "mango");
		
//		List<String> reve = words.stream()
//				            .sorted(Comparator.reverseOrder())
//				            .collect(Collectors.toList());
//		System.out.println(reve);
		
		
		List<String> reve = new ArrayList<>(words);
		
		Collections.sort(reve, Collections.reverseOrder());
		
		for(String word : reve) {
			System.out.println(word);
		}
		
	}
}
