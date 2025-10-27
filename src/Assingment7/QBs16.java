package Assingment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QBs16 {

	public static void main(String[] args) {
		
		//16. Group words by their length using Collectors.groupingBy()
		// Example output: {4=[kiwi], 5=[grape, mango], 6=[banana, orange], ...}
		
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		Map<Integer, List<String>> groupLength = new HashMap<>();
//		
//		for(String word : words) {
//			int length = word.length();
//			
//			if(!groupLength.containsKey(length)) {
//			groupLength.put(length, new ArrayList<>());
//		}
//		
//		groupLength.get(length).add(word);
//		}
//		System.out.println(groupLength);
		
		Map<Integer, List<String>> groupLength = words.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupLength);
	}
}
