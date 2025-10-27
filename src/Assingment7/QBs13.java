package Assingment7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QBs13 {

	//13. Join all words into a single string separated by commas
	// Expected output: apple, banana, mango, ..
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "mango", "orange",
				"grape", "kiwi","melon", "apple", "mango");
		
//		StringBuilder result = new StringBuilder();
//		
//		for(int i=0; i< words.size(); i++) {
//			result.append(words.get(i));
//			if(i<words.size()-1) {
//				result.append(" , ");
//			}
//		}
//		System.out.println(result.toString());
		
		String result = words.stream()
				.collect(Collectors.joining(", "));
		
		System.out.println(result);
	}
}
